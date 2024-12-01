package com.ali.springSecurity.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UsersController {

    @Autowired
    private UsersService usersService;


    @PostMapping("admin/register")
    public Users register(@RequestBody Users user){
        return usersService.register(user);
    }
}
