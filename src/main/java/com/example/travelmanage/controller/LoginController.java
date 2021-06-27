package com.example.travelmanage.controller;

import com.example.travelmanage.entity.User;
import com.example.travelmanage.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

/*
 * @Time 2021-06-23 21:01
 * @Author huangshaowu
 *
 */
@RequestMapping("/login")
@RestController
public class LoginController {
    @Autowired
    private LoginService loginService;

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    @ResponseBody
    private Map login(@RequestBody User user) throws Exception {
        return loginService.login(user);
    }
}
