package com.alvis.graphql.query;

import com.alvis.graphql.domain.User;
import com.alvis.graphql.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Author Alvis
 * @Date 2023/3/8 13:22
 */

@Controller
public class GreetingController {
    //前端页面
    //http://localhost:8990/graphiql

    @Autowired
    private UserService userService;

    //http://localhost:8990/graphql
    //{"query":"{User666:findAllUsers {id,name}}"}
    @QueryMapping
    public List<User> findAllUsers(){
        List<User> page = userService.page(null);
        return page;
    }

    //http://localhost:8990/graphql
    //{"query":"{ User: findByName(name: \"管理员\") { name } }"}
    @QueryMapping
    public List<User> findByName(@Argument(name = "name") String name){
        Map<String, Object> map = new HashMap<>();
        map.put("name", name);
        List<User> page = userService.page(map);
        return page;
    }

    //两个请求组合  http://localhost:8990/graphql
    //{"query":"{User666:findAllUsers {id,name}User: findByName(name: \"管理员\") { name }}"}

}
