package com.sts.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sts.entity.UserEntity;
import com.sts.service.UserService;


@RestController
@RequestMapping("api/user")
public class UserController {
	
	@Autowired
	UserService userService;
	
	@PostMapping(path = "/register",
	        consumes = MediaType.APPLICATION_JSON_VALUE,
	        produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<String> addUser(@RequestBody UserEntity user){
		String msg = userService.addUser(user);
		return new ResponseEntity<>(msg,HttpStatus.CREATED);
	}
	
	@GetMapping(path = "/fetchall",
	        produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<UserEntity>> getAll(){
		List<UserEntity> users = userService.getAll();
		return new ResponseEntity<>(users,HttpStatus.OK);
	}
	
	@GetMapping(path = "/fetch",
	        produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<UserEntity> getUser(@RequestParam String username){
		UserEntity user = userService.getUser(username);
		return ResponseEntity.ok(user);
	}
	
}
