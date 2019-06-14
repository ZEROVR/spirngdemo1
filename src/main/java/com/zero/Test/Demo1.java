package com.zero.Test;

import com.zero.Dao.UserDao;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo1 {
@Test
public void testSpring(){
    ApplicationContext app = new ClassPathXmlApplicationContext("ApplicationContext.xml");
    UserDao userDao = (UserDao) app.getBean("UserDao");
    userDao.save();
}

}
