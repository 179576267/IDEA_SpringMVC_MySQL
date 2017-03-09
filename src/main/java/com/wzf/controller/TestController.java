package com.wzf.controller;

import com.wzf.dao.UserMapper;
import com.wzf.model.UserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * Created by Administrator on 2017/3/8.
 */
@Controller
public class TestController {

    @Autowired(required=true)
    private UserMapper userMapper;

    @RequestMapping("/add.do")
    @ResponseBody
    public String addUser(HttpServletRequest request, HttpServletResponse response){
        UserEntity userEntity = new UserEntity();
        userEntity.setName("TestController");
        userEntity.setAge(50);
        userEntity.setSex(1);
        this.userMapper.createUser(userEntity);
        return "user:" + userEntity.toString();
    }


    @RequestMapping("/query.do")
    @ResponseBody
    public String queryUsers(HttpServletRequest request, HttpServletResponse response){
        return "users:" + userMapper.getUsers().toString();
    }
}
