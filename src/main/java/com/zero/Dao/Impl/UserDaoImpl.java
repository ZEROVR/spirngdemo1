package com.zero.Dao.Impl;

import com.zero.Dao.UserDao;

public class UserDaoImpl implements UserDao {
    @Override
    public void save() {
        System.out.println("第一次创建Spring");
    }
}
