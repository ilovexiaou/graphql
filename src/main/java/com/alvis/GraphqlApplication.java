package com.alvis;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class GraphqlApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(GraphqlApplication.class, args);
    }

}
