package com.zero.Factory;

import com.zero.Dao.Impl.UserDaoImpl;
import com.zero.Dao.UserDao;

public class StaticConfig {
    public static UserDao getUser(){
        return new UserDaoImpl();
    }
}
