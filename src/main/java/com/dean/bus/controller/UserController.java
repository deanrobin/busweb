package com.dean.bus.controller;

import com.dean.bus.bean.Person;
import com.dean.bus.dao.UserMapper;
import com.dean.bus.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("user")
public class UserController {
    @Autowired
    UserService userService;

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    @ResponseBody
    public int save(@RequestParam(value = "name", required = true) String name) {
        Person person = new Person();
        person.setName(name);
        person.setAge(1);
        return userService.insert(person);
    }


    @RequestMapping(value = "/count", method = RequestMethod.GET)
    @ResponseBody
    public int count() {

        return userService.count();
    }
}
