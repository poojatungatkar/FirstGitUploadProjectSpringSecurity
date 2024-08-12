package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.User;
import com.example.demo.repository.UserRepo;

@Service
public class UserService 
{
	@Autowired
	private UserRepo repo;
	
	
	//get all user
	public List<User> getAllUser()
	{
		return repo.findAll();
	}
	
	//get sigle user
	public User singleUser(String username)
	{
		User user=repo.findByUsername(username);
		return user; 
	}
	
	//add new user
	public User adduser(User user)
	{
		return repo.save(user);
	}
}
