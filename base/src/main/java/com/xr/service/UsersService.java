package com.xr.service;

import com.xr.entity.Users;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public interface UsersService {
    Users findUserByName(Users users);
    Users findUserByUserName(String name);
    List<String> findRoleByUserName(String name);
    List<Users> list(Users user);
    List<Users> AllList();
    void addUser(Users users);
    void deleteUser(int uid);
    Users findUserById(int uid);
    void updateUser(Users users);
    Users findUserByNameAndRoleAndMenu(String name);

}
