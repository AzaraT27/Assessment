package com.sts.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.sts.entity.UserEntity;
import com.sts.exception.UsernameNotFoundException;
import com.sts.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService{

	private UserRepository userRepository;
	
	public UserServiceImpl(UserRepository userRepository) {
		this.userRepository = userRepository;
	}

	@Override
	public String addUser(UserEntity user) {
		UserEntity savedUser = userRepository.save(user);
		return "User Registration Successful!";
	}

	@Override
	public List<UserEntity> getAll() {
		return userRepository.findAll();
	}

	@Override
	public UserEntity getUser(String userName) {
		return userRepository.findByUserName(userName)
                .orElseThrow(() -> new UsernameNotFoundException("User not found with username: " + userName));
	}

}
