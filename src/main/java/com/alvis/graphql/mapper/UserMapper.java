package com.alvis.graphql.mapper;

import com.alvis.graphql.domain.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author ALVIS
 * @since 2023-02-10
 */
@Mapper
public interface UserMapper {

    List<User> selectPage(@Param(value = "name") String name);

}
