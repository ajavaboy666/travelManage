package com.example.travelmanage.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.travelmanage.dao.LoginDao;
import com.example.travelmanage.entity.User;
import com.example.travelmanage.service.LoginService;
import org.springframework.stereotype.Service;
import org.springframework.util.DigestUtils;

import javax.annotation.Resource;
import java.lang.reflect.Field;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/*
 * @Time 2021-06-23 21:27
 * @Author huangshaowu
 *
 */
@Service
public class LoginServiceImpl implements LoginService {
    @Resource
    private LoginDao loginDao;

    @Override
    public Map<String, Object> login(User user) throws Exception {
        String name = user.getEname();
        String password = user.getPassword();
        //使用spring自带的md5加密
        String md5Password = DigestUtils.md5DigestAsHex(password.getBytes(StandardCharsets.UTF_8));
        QueryWrapper<User> wrapper = new QueryWrapper<User>().eq("ename", name).eq("password", md5Password);
        User user1 = loginDao.selectOne(wrapper);
        Map<String, Object> map = new LinkedHashMap<>();
        if (user1 != null) {
            //获取字节码
            Class<? extends User> user1Class = user1.getClass();
            //获取属性
            Field[] fields = user1Class.getDeclaredFields();
            for (Field field : fields) {
                //暴力访问属性，包括私有属性
                field.setAccessible(true);
                //获取属性名
                String fieldName = field.getName();
                //获取对象指定的值
                Object o1 = field.get(user1);
                String o = null;
                if (o1 != null) {
                    o = o1.toString();
                }
                if (!Objects.equals(fieldName, "password")) {
                    map.put(fieldName, o);
                }
            }
            return map;
        }
        map.put("msg", "当前用户名或密码错误");
        return map;
    }
}
