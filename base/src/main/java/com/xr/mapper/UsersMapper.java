package com.xr.mapper;

import com.xr.entity.Users;
import com.xr.entity.UsersExample;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UsersMapper {
    @Select("select id,name,password,salt,email,mobile,status,dept_id,create_by,create_time,last_update_by,last_update_time,del_flag,introduction,avatar from sys_user where name = #{username} and password = #{password}")
    Users findUserByName(Users user);

    // @Select("")
    Users findUserByUserName(String name);

    @Select("select roleName from sys_role r inner join sys_user u INNER JOIN sys_user_role ru where u.id = ru.user_id and ru.role_id = r.id and u.name = #{username}")
    List<String> findRoleByUserName(String name);

    @Select("select id,name,password,salt,email,mobile,status,dept_id,create_by,create_time,last_update_by,last_update_time,del_flag,introduction,avatar from sys_user where name=#{name}")
    List<Users> list(Users user);

    @Select("select id,name,password,salt,email,mobile,status,dept_id,create_by,create_time,last_update_by,last_update_time,del_flag,introduction,avatar from sys_user")
    List<Users> AllList();

    @Insert("insert into sys_user values(0,#{username},#{password},#{salt},#{email},#{mobile},#{status},#{deptId},#{createBy},now(),#{lastUpdateBy},#{lastUpdateTime},#{delFlag},#{introduction},#{avatar})")
    void addUser(Users users);

    @Delete("delete from sys_user where id = #{uid}")
    void deleteUser(int uid);

    @Select("select id,name,password,avatar,introduction from sys_user where id=#{uid}")
    Users findUserById(int uid);

    @Update("update sys_user set name=#{username},password=#{password},salt=#{salt},email=#{email},mobile=#{mobile},status=#{status},dept_id=#{deptId},create_by=#{createBy},create_time=#{createTime},last_update_by=#{lastUpdateBy},last_update_time=#{lastUpdateTime},del_flag=#{delFlag},introduction=#{introduction},avatar=#{avatar} where id = #{id}")
    void updateUser(Users users);

    @Select("select u.id uid,introduction,avatar,u.name,password,salt,email,mobile,status,dept_id,u.del_flag udelFlag,r.id rid,r.roleName rname,r.remark,m.id mid,m.name mname,m.parent_id,m.url,m.perms,m.type,m.icon,m.order_num from sys_user u INNER JOIN sys_user_role ur ON u.id = ur.user_id INNER JOIN sys_role r ON ur.role_id = r.id INNER JOIN sys_role_menu rm ON r.id = rm.role_id INNER JOIN sys_menu m ON m.id = rm.menu_id where u.name=#{name} and u.del_flag=0 and r.del_flag=0 and m.del_flag=0")
    List<Users> findUserByNameAndRoleAndMenu(String name);

    List<Users> selectByExample(UsersExample example);


}
