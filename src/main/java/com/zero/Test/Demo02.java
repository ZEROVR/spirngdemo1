package com.zero.Test;

import com.zero.Service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Demo02 {
    @Test
    public void testSpring(){
        ApplicationContext app = new FileSystemXmlApplicationContext("F:\\idealprroject\\SpringDemo3\\src\\main\\resources\\ApplicationContext.xml");
        UserService bean = app.getBean(UserService.class);
        bean.save();
    }
}
