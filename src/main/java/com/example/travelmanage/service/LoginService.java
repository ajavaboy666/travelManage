package com.example.travelmanage.service;

import com.example.travelmanage.entity.User;

import java.util.LinkedHashMap;
import java.util.Map;

/*
 * @Time 2021-06-23 21:25
 * @Author huangshaowu
 *
 */
public interface LoginService {
    Map login(User user) throws  Exception;
}
