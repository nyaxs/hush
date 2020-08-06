package org.nyaxs.hush.controller;

import org.nyaxs.hush.entity.Groups;
import org.nyaxs.hush.entity.Messages;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * @ClassName MessageController
 * @Description TODO:
 * @Author nyaxs
 * @Date 2020-08-05 15:48
 * @Version 1.0
 **/
@RestController
public class MessageController {

    @GetMapping("groups/{id}")
    public void getGroups(@PathVariable String id){
    }


    @GetMapping("messages/{groupId}")
    public void getMessagesByGroupId(@PathVariable int groupId){

    }

    @PostMapping("message/send")
    public void send(@RequestBody Messages message){

    }

    @GetMapping("message/save")
    public void save(){
        
    }

}
