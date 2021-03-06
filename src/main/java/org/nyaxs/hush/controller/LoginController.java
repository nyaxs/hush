package org.nyaxs.hush.controller;

import org.nyaxs.hush.entity.User;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

/**
 * @ClassName LoginController
 * @Description TODO:
 * @Author nyaxs
 * @Date 2020-08-05 16:42
 * @Version 1.0
 **/
@RestController
public class LoginController {

    private final StringRedisTemplate stringRedisTemplate;

    public LoginController(StringRedisTemplate stringRedisTemplate) {
        this.stringRedisTemplate = stringRedisTemplate;
    }

    @GetMapping("login")
    public User login(@Valid @RequestBody User users){
        User user = new User();

        return users;
    }

    @PostMapping("register")
    public void register(@RequestBody User user){

    }

}
