package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.User;
import com.example.demo.service.UserService;

@RestController
@RequestMapping("/users")
public class UserController
{
	@Autowired
	private UserService userService;
	
	//All User
	@GetMapping("/")
	public List<User> getAllUser()
	{
		return userService.getAllUser();
	}
	
	//single user
	@GetMapping("{username}")
	public User singleUser(@PathVariable("username") String username)
	{
		return userService.singleUser(username);
	}
	
	//add user
	@PostMapping("/add")
	public User addUser(@RequestBody User user)
	{
		return userService.adduser(user);
	}
	
	
}
