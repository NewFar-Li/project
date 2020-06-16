package com.xr.shiro;

import com.xr.entity.Menu;
import com.xr.entity.Role;
import com.xr.entity.Users;
import com.xr.service.UsersService;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.session.Session;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.util.ByteSource;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * 自定义域
 */
public class Realm extends AuthorizingRealm {
    @Override
    public String getName() {
        return "myShiroRealm";
    }

    @Autowired
    private UsersService UserService;

    @Override
    /**
     * 授权
     * doGetAuthorizationInfo方法是在我们调用
     * SecurityUtils.getSubject().isPermitted（）这个方法时触发，
     * 开启了注解就是进入有 @RequiresPermissions或@RequiresRoles() 两个注解时触发
     * 授权后用户角色及权限会保存在缓存中的
     *
     * @param principal
     * @return
     * @RequiresPermissions这个注解起始就是在执行SecurityUtils.getSubject().isPermitted（）
     */
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
        // 从session中获取 user 对象
        Session session = SecurityUtils.getSubject().getSession();
        Users sysUser = (Users)session.getAttribute("USER_SESSION");
        // 查到权限数据，返回授权信息，要包括上面的权限和角色(可选，一般不这么用了)
        SimpleAuthorizationInfo simpleAuthorizationInfo = new SimpleAuthorizationInfo();
        // 根据身份信息获取角色信息，权限信息
        for (Role role : sysUser.getRoles()) {
            simpleAuthorizationInfo.addRole(role.getRoleName());
            System.out.println("roleName:"+role.getRoleName());
            // 根据身份信息获取权限信息
            for (Menu m : role.getMenus()) {
                if(m.getPerms()!=null) {
                    simpleAuthorizationInfo.addStringPermission(m.getPerms());
                    System.out.println("menuName:"+m.getPerms());
                }
            }
        }
        return simpleAuthorizationInfo;
    }

    /**
     * 认证.登录
     * doGetAuthenticationInfo这个方法是在用户登录的时候调用的
     * 也就是执行SecurityUtils.getSubject().login()的时候调用；(即:登录验证)
     * 验证通过后会用户保存在缓存中的
     */
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token)
            throws AuthenticationException  {
        try {
            //获取用户的输入的账号.
            String username = (String) token.getPrincipal();
            //通过username从数据库中查找 User对象，如果找到，没找到.
            //实际项目中，这里可以根据实际情况做缓存，如果不做，Shiro自己也是有时间间隔机制，2分钟内不会重复执行该方法
            Users sysUser = UserService.findUserByUserName(username);
            if (sysUser == null) {
                return null;
            }
//        if (sysUser.getStatus() == 0) { //账户冻结
//            throw new LockedAccountException();
//        }
            SimpleAuthenticationInfo authenticationInfo = new SimpleAuthenticationInfo(
                    username, //用户名
                    sysUser.getPassword(), //密码
                    ByteSource.Util.bytes(sysUser.getSalt()),//salt=username+salt密码加盐
                    getName()  // 当前 realm对象的name.调用父类的getName()方法即可
            );
            // 将用户信息存入到session
            Session session = SecurityUtils.getSubject().getSession();
            session.setAttribute("USER_SESSION", sysUser);
            return authenticationInfo;
        }catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
