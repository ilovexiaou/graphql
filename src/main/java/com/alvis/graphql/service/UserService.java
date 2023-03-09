package com.alvis.graphql.service;


import com.alvis.graphql.domain.User;

import java.util.List;
import java.util.Map;

/**
 * @author ALVIS
 * @since 2023-02-10
 */
public interface UserService {
    List<User> page(Map<String, Object> data);
}
