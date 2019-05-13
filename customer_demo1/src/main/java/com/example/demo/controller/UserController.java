package com.example.demo.controller;

import com.example.demo.common.ReturnFomart;
import com.example.demo.entity.User;
import com.example.demo.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
@Api(description = "用户接口")
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("/saveUser")
    @ApiOperation(value = "新增用户",notes = "用户注册")
    public ReturnFomart insertUser(@RequestBody User user){
       return userService.insertUser(user);
    }
}
