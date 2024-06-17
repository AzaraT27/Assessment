package com.sts.service;

import java.util.List;

import com.sts.entity.UserEntity;

public interface UserService {
	public String addUser(UserEntity user);
	
	public List<UserEntity> getAll();
	
	public UserEntity getUser(String userName);
}
