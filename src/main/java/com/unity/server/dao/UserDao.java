package com.unity.server.dao;

import com.unity.server.entity.User;

/**
 * Created by admin on 2017/10/27.
 */
public interface UserDao {

    User queryById(int id);

    void insert(User user);
}
