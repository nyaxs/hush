package org.nyaxs.hush.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @ClassName Users
 * @Description TODO:
 * @Author nyaxs
 * @Date 2020-08-05 16:30
 * @Version 1.0
 **/
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Users {
    private String id;
    private String name;
    private String password;
    private String nickname;
    private String signature;
    private String icon;
    private List<Groups> groups;
    private List<String> groupsId;
    private List<Users> friends;
    private List<String> friendsId;
    private String status;
}
