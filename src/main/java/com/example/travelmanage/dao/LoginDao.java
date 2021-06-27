package com.example.travelmanage.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.travelmanage.entity.User;
import org.springframework.stereotype.Repository;

/*
 * @Time 2021-06-23 21:40
 * @Author huangshaowu
 *
 */
@Repository
public interface LoginDao extends BaseMapper<User> {
}
