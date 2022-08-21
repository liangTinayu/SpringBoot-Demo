package com.lty.service.impl;

import com.lty.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Override
    public void sayHello() {
        System.out.println("Hello Get the ApplicationContext!");
    }
}
