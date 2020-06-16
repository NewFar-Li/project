package com.xr.controller;

import com.xr.entity.Users;
import com.xr.service.UsersService;
import com.xr.util.CommonUtil;
import com.xr.util.ResponseResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.apache.shiro.authz.annotation.RequiresRoles;
import org.apache.shiro.crypto.SecureRandomNumberGenerator;
import org.apache.shiro.crypto.hash.Md5Hash;
import org.apache.shiro.session.Session;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;
import java.util.*;

import static com.xr.util.CommonUtil.getMD5Password;

@RestController
@RequestMapping("/user")
@Api("用户管理相关接口")
public class UsersController {
    @Autowired
    private UsersService usersService;

    private CommonUtil commonUtil = new CommonUtil();


    /*public ResponseEntity login(@RequestBody Users users, HttpSession session){
        Users loginUser = usersService.findUserByName(users);
        Map<String,Object> map = new HashMap<>();
        if(loginUser!=null){
            map.put("msg","登录成功");
            map.put("loginUser",loginUser);
            map.put("token",session.getId());
            return ResponseEntity.status(HttpStatus.OK).body(map);
        }else{
            map.put("msg","登录失败，用户名或密码错误");
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(map);
        }
    }*/

    @RequestMapping("/hello")
    public void hello(){
        System.out.println("hello");
    }

    @RequestMapping("/login")
    public ResponseResult login(@RequestBody Users users, HttpSession session){
        /*Users loginUser = usersService.findUserByName(users);
        System.out.println(loginUser);
        ResponseResult result = new ResponseResult();
        if(loginUser!=null){
           // 返回给前台的toke，唯一标识用户
           result.getData().put("token",loginUser.getName());
        }else{
            //登录失败
            result.getData().put("message","登录失败，用户名或密码错误");
        }
        return result;*/

        ResponseResult result = new ResponseResult();
        UsernamePasswordToken token = new UsernamePasswordToken(users.getName(), users.getPassword());
        // 获得登录的主题
        Subject subject = SecurityUtils.getSubject();
        // 调用登录方法
        subject.login(token);
        // 返回给前台的toke，唯一标识用户
        result.getData().put("token",subject.getSession().getId());
        return result;
    }

    @RequestMapping("info")
    @ApiOperation(value = "获得登录用户信息",notes = "获得登录用户信息")
    public ResponseResult info(String token){
        /*// 根据用户名查询用户信息
        Users user = usersService.findUserByUserName(token);
        // 根据用户名查询角色信息
        List<String> roles =  usersService.findRoleByUserName(token);
        ResponseResult result = new ResponseResult();
        result.getData().put("roles",roles);
        result.getData().put("introduction",user.getIntroduction());
        result.getData().put("avatar",user.getAvatar());
        result.getData().put("name",user.getName());
        return result;*/

        Subject subject = SecurityUtils.getSubject();
        Session session = subject.getSession();
        ResponseResult result = new ResponseResult();
        if(token.equals(subject.getSession().getId().toString())){
            // 从shiro的session里获得保存的用户信息
            Users loginUser = (Users) session.getAttribute("USER_SESSION");
            // 获得角色字符串集合
            List<String> roles = (List<String>) session.getAttribute("roles");
            if(loginUser!=null){
                // 根据用户获得角色字符串数组
                roles = usersService.findRoleByUserName(loginUser.getName());
                result.getData().put("roles",roles);
                result.getData().put("introduction",loginUser.getIntroduction());
                result.getData().put("avatar",loginUser.getAvatar());
                result.getData().put("name",loginUser.getName());
                return result;
            }
        }
        return null;
    }

    @RequestMapping("logout")
    public ResponseResult logout(HttpSession session){
        ResponseResult result = new ResponseResult();
        Subject subject = SecurityUtils.getSubject();
        // 调用shiro的logout方法
        subject.logout();
        return result;
    }

    @RequestMapping("list")
    @RequiresPermissions("user:list")
    @ApiOperation(value = "获得用户列表",notes = "获得用户列表")
    public ResponseResult userList(@RequestBody Users user){
        ResponseResult result = new ResponseResult();
        List<Users> items = null;
        if(user == null || user.getName().equals("")) {
            items = usersService.AllList();
        }else{
            items = usersService.list(user);
        }
        result.getData().put("items",items);
        result.getData().put("total",items.size());
        return result;
    }

    @RequestMapping("delete")
    @ApiOperation(value = "删除用户",notes = "删除用户")
    public ResponseResult deleteUser(int id){
        ResponseResult result = new ResponseResult();
        usersService.deleteUser(id);
        return result;
    }

    @RequestMapping("update")
    @RequiresPermissions("user:update")
    @ApiOperation(value = "修改用户",notes = "修改用户")
    public ResponseResult updateUser(@RequestBody Users user){
        ResponseResult result = new ResponseResult();
        user.setPassword(commonUtil.getMD5Password(user.getPassword(),user.getSalt(),2));
        usersService.updateUser(user);
        return result;
    }

    @RequestMapping("add")
    @RequiresPermissions("user:add")
    @ApiOperation(value = "添加用户",notes = "添加用户")
    public ResponseResult insertUser(@RequestBody Users user){
        ResponseResult result = new ResponseResult();
        user.setSalt(new SecureRandomNumberGenerator().nextBytes().toHex());
        user.setPassword(commonUtil.getMD5Password(user.getPassword(),user.getSalt(),2));
        usersService.addUser(user);
        return result;
    }
}
