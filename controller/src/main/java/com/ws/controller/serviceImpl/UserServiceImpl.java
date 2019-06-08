package com.ws.controller.serviceImpl;

import com.ws.common.entiry.UserService;

public class UserServiceImpl implements UserService {

    @Override
    public String login(String name) {
        return "你是 "+name;
    }
}
