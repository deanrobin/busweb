package com.dean.bus.controller;

import com.dean.bus.dao.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("bus/user")
public class UserController {

    @Autowired
    private UserMapper userMapper;

    @RequestMapping(value = "selectByName", method = RequestMethod.GET)
    @ResponseBody
    public String save(@RequestParam(value = "name", required = true) String name) {
        return userMapper.selectById(name);
    }



}
