package org.nyaxs.hush.repository;

import org.nyaxs.hush.entity.Users;
import org.nyaxs.hush.service.RedisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.*;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName UsersDao
 * @Description TODO:
 * @Author nyaxs
 * @Date 2020-08-05 17:12
 * @Version 1.0
 **/
@Repository
public class UsersDao {

    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    @Autowired
    private RedisTemplate redisTemplate;

    @Resource
    private ValueOperations<String,Object> valueOperations;

    @Autowired
    private HashOperations<String, String, Object> hashOperations;

    @Autowired
    private ListOperations<String, Object> listOperations;

    @Autowired
    private SetOperations<String, Object> setOperations;

    @Autowired
    private ZSetOperations<String, Object> zSetOperations;

    @Resource
    private RedisService redisService;

    public Users getUsers(Users users){
        String name = users.getName();
        if(hashOperations.get(users.getName(),"password")==null){
            return null;
        }
        String pwd = (String) hashOperations.get(users.getName(),"password");
        if(!users.getPassword().equals(pwd)){
            return null;
        }
        Users result = new Users();
        result.setNickname(hashOperations.get(name,"nickname").toString());
        return result;
    }
}
