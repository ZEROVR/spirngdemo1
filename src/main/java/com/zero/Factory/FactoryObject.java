package com.zero.Factory;

import com.zero.Dao.Impl.UserDaoImpl;
import com.zero.Dao.UserDao;

public class FactoryObject {
    public UserDao getUserDao(){
        return new UserDaoImpl();
    }
}
