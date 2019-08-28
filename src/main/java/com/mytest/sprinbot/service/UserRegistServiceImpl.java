package com.mytest.sprinbot.service;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.mytest.sprinbot.mapper.UserRegistMapper;
import com.mytest.sprinbot.model.UserRegist;
import com.mytest.sprinbot.service.UserRegistService;
 /**
  * @Author: zhouheng
  *
  * @Created: with IntelliJ IDEA.
  *
  * @Description:
  *
  * @Date: 2019-08-28
  
  * @Time: 14:59
  * 
  */
    
@Service
public class UserRegistServiceImpl implements UserRegistService{

    @Resource
    private UserRegistMapper userRegistMapper;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return userRegistMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(UserRegist record) {
        return userRegistMapper.insert(record);
    }

    @Override
    public int insertSelective(UserRegist record) {
        return userRegistMapper.insertSelective(record);
    }

    @Override
    public UserRegist selectByPrimaryKey(Integer id) {
        return userRegistMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(UserRegist record) {
        return userRegistMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(UserRegist record) {
        return userRegistMapper.updateByPrimaryKey(record);
    }

}
