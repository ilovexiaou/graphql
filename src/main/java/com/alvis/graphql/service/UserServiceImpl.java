package com.alvis.graphql.service;

import com.alvis.graphql.domain.User;
import com.alvis.graphql.mapper.UserMapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author ALVIS
 * @since 2023-02-10
 */
@Service
public class UserServiceImpl implements UserService {
    private static final Logger log = LoggerFactory.getLogger(UserServiceImpl.class);
    @Autowired
    private UserMapper userMapper;
    @Override
    public List<User> page(Map<String, Object> data) {
        if (null==data) return  userMapper.selectPage(null);
        String s = data.get("name") != null ? data.get("name").toString() : null;
        log.info("main thead");
        log.info("main thead");
        return userMapper.selectPage(s);
    }

}
