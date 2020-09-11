package org.nyaxs.hush.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName GroupController
 * @Description TODO:
 * @Author nyaxs
 * @Date 2020-09-11 14:19
 * @Version 1.0
 **/
@RestController
public class GroupController {

    @GetMapping("groups/{id}")
    public void getGroups(@PathVariable String id){
    }



}
