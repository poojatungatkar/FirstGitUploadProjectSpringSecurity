package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.model.User;

@Service
public class UserService 
{
	List<User> list=new ArrayList<>();

	public UserService() 
	{
		list.add(new User("pooja","pooja123","pooja@gmail.com"));
		list.add(new User("om","om123","om@gmail.com"));
	}
	
	//get all user
	public List<User> getAllUser()
	{
		return this.list;
	}
	
	//get sigle user
	public User singleUser(String username)
	{
		return this.list.stream().filter((user)->user.getUsername().equals(username)).findAny().orElse(null);
	}
	
	//add new user
	public User adduser(User user)
	{
		this.list.add(user);
		return user ;
	}
}
