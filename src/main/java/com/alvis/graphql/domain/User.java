package com.alvis.graphql.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * @author ALVIS
 * @since 2023-02-10
 */
@TableName("USER")
@Data
public class User implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;

    private String account;

    private String name;

    private String password;

    private Integer age;

    private String city;

    private String createId;

    private String createDept;

}
