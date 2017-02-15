package com.dao;

import domain.User;

import java.util.List;

/**
 * Created by timhuo on 2017/2/10.
 */
public interface UserDao {
    public User findUser(int id);
    public List<User> findAllUser();
    public Boolean deleteUser(int id);
    public Boolean saveUser(User user);
}
