package com.mytest.sprinbot.service;

import com.alicp.jetcache.anno.CacheType;
import com.alicp.jetcache.anno.Cached;
import org.springframework.stereotype.Service;

/**
 * @Author: zhouheng
 * @Created: with IntelliJ IDEA.
 * @Description:
 * @Date: 2019-05-20
 * @Time: 13:12
 */
@Service
public class TestService {



    @Cached(name = "get_", key = "#username", cacheType = CacheType.REMOTE)
    public String get(String usernames){

        return usernames;
    }
}
