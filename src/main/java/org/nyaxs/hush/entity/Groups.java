package org.nyaxs.hush.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @ClassName Groups
 * @Description TODO: 小组的实体类
 * @Author nyaxs
 * @Date 2020-08-05 16:29
 * @Version 1.0
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Groups {
    private String id;
    private String founderId;
    private String name;
    private String about;
    private String icon;
    private String status;
    private List<Users> users;
    private List<Messages> messages;
}
