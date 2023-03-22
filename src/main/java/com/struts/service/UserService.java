package com.struts.service;

import com.struts.dao.UserDao;
import com.struts.model.User;

import java.util.List;

public class UserService {
    private UserDao userDao;

    public UserService() {
        this.userDao = new UserDao();
    }

    public List<User> getUsers(){
        return userDao.getAllUsers();
    }

    public User getUserById(int id){
        return userDao.getUserById(id);
    }

    public void addUser(User user){
        userDao.addUser(user);
    }

    public void deleteUser(int id) {
        userDao.
    }
}
