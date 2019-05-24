package com.mytest.sprinbot.mapper;


import com.mytest.sprinbot.model.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
public interface UserMapper {
	
	List<User> getAll();
	
	User getOne(Long id);

	void insert(User user);

	void update(User user);

	void delete(Long id);

}