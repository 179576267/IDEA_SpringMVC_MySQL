package com.wzf.dao;

import com.wzf.model.UserEntity;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Administrator on 2017/3/9.
 */
@Repository
public interface  UserMapper {

     List<UserEntity> getUsers();

    void createUser(UserEntity entity);


}
