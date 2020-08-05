package org.nyaxs.hush.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

/**
 * @ClassName Messages
 * @Description TODO: 一条信息对应的实体类
 * @Author nyaxs
 * @Date 2020-08-05 15:52
 * @Version 1.0
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Messages {
    private String id;
    private String groupId;
    private String userId;
    private LocalDateTime time;
    private String text;
    private String image;
    private String emoji;
    private String media;
}
