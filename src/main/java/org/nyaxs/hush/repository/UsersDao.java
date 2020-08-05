package org.nyaxs.hush.repository;

import org.nyaxs.hush.entity.Users;
import org.springframework.data.redis.core.HashOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Repository;

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
    private final RedisTemplate redisTemplate;

    public UsersDao(StringRedisTemplate redisTemplate) {
        this.redisTemplate = redisTemplate;
    }

    public void getUsers(Users users){
        HashOperations<String,Object,Object> hashOperations = redisTemplate.opsForHash();
        Map<String,String> map = new HashMap<String, String>();

    }
}
