package com.zero.Dao.Impl;

import com.zero.Dao.UserDao;
import com.zero.Domain.User;

import java.util.List;
import java.util.Map;
import java.util.Properties;

public class UserDaoImpl implements UserDao {
//    private String name;
//    private int age;
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public void setAge(int age) {
//        this.age = age;
//    }
    private List<String> listStr;
    private Map<String,User> mapStr;
    private Properties properties;

    public void setListStr(List<String> listStr) {
        this.listStr = listStr;
    }

    public void setMapStr(Map<String, User> mapStr) {
        this.mapStr = mapStr;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    @Override
    public void save() {
        System.out.println(listStr);
        System.out.println(mapStr);
        System.out.println(properties);
        System.out.println("第一次创建Spring");
//        System.out.println(name+"==="+age);
    }
}
