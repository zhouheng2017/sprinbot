package com.mytest.sprinbot.mapper;

import com.mytest.sprinbot.model.UserRegist;

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
    
public interface UserRegistMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(UserRegist record);

    int insertSelective(UserRegist record);

    UserRegist selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(UserRegist record);

    int updateByPrimaryKey(UserRegist record);
}