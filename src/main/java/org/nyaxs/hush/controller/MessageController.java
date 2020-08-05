package org.nyaxs.hush.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName MessageController
 * @Description TODO:
 * @Author nyaxs
 * @Date 2020-08-05 15:48
 * @Version 1.0
 **/
@RestController
public class MessageController {

    @GetMapping("messages/{groupId}")
    public void getMessagesByGroupId(@PathVariable int groupId){

    }

}
