package com.xr.service.impl;

import com.xr.entity.Users;
import com.xr.entity.UsersExample;
import com.xr.mapper.UsersMapper;
import com.xr.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsersServiceImpl implements UsersService {
    @Autowired
    private UsersMapper usersMapper;

    @Override
    public Users findUserByName(Users users) {
        Users loginUser = usersMapper.findUserByName(users);
        if (loginUser != null && users.getPassword().equals(loginUser.getPassword())) {
            return loginUser;
        }
        return null;
    }
    @Override
    public Users findUserByUserName(String name){
        Users loginUser = usersMapper.findUserByUserName(name);
        if (loginUser != null) {
            return loginUser;
        }
        return null;
    }
    @Override
    public List<String> findRoleByUserName(String name){
        return usersMapper.findRoleByUserName(name);
    }

    @Override
    public List<Users> list(Users user){
        /*UsersExample example = new UsersExample();
        UsersExample.Criteria criteria = example.createCriteria();
        if(user!=null){
            if(user.getName()!=null){
                criteria.andUsernameLike("%"+user.getName()+"%");
            }
            // 还可以添加其他属性的条件
        }*/
        List<Users> list =  usersMapper.list(user);
        return list;
    }

    @Override
    public List<Users> AllList(){
        List<Users> list =  usersMapper.AllList();
        return list;
    }

    @Override
    public void addUser(Users users) {
        usersMapper.addUser(users);
    }

    @Override
    public void deleteUser(int uid) {
        usersMapper.deleteUser(uid);
    }

    @Override
    public Users findUserById(int uid) {
        return null;
    }

    @Override
    public void updateUser(Users users) {
        usersMapper.updateUser(users);
    }

    @Override
    public Users findUserByNameAndRoleAndMenu(String name){
        List<Users> list = usersMapper.findUserByNameAndRoleAndMenu(name);
        if(list!=null && list.size()>=1){
            return list.get(0);
        }
        return null;
    }
}
