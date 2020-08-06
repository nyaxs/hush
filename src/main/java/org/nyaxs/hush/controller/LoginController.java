package org.nyaxs.hush.controller;

import org.nyaxs.hush.entity.Users;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName LoginController
 * @Description TODO:
 * @Author nyaxs
 * @Date 2020-08-05 16:42
 * @Version 1.0
 **/
@RestController
public class LoginController {

    @GetMapping("login")
    public Users login(@RequestBody Users users){
        return users;
    }

    @PostMapping("register")
    public void register(@RequestBody Users user){

    }

}
