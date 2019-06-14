package com.zero.Service.Impl;

import com.zero.Dao.Impl.UserDaoImpl;
import com.zero.Dao.UserDao;
import com.zero.Service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserServiceImpl implements UserService {
    private UserDao userDao;

//    public void setUserDao(UserDao userDao) {
//        this.userDao = userDao;
//    }

    public UserServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }


    @Override
    public void save() {
//        ApplicationContext app = new ClassPathXmlApplicationContext("ApplicationContext.xml");
//        UserDao userDao = (UserDao) app.getBean("UserDao");
//        UserDaoImpl userDao = new UserDaoImpl();
        this.userDao.save();
    }
}
