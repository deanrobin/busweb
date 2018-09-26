package com.dean.bus.service;

import com.dean.bus.bean.Person;
import com.dean.bus.dao.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    public int insert(Person person) {
        return userMapper.insert(person);
    }

    public int count() {
        return userMapper.count();
    }


}
