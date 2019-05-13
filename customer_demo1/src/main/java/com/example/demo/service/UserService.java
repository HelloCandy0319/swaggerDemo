package com.example.demo.service;

import com.example.demo.common.ReturnFomart;
import com.example.demo.entity.User;
import com.example.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;
    ReturnFomart returnFomart = new ReturnFomart();
    public ReturnFomart insertUser(User user){
        try {
            userRepository.save(user);
        }catch (Exception e){
            returnFomart.setCode(500);
            returnFomart.setMsg("failure");
            returnFomart.setObject((String) e.getMessage());
        }
        returnFomart.setCode(200);
        returnFomart.setMsg("success");
        return returnFomart;
    }
}
