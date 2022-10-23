package com.example.SpringRestAPI.service;

import java.util.List;

import com.example.SpringRestAPI.entity.User;

public interface RegistertService {
	public void addUser(User user) ;
	List<User> getUsers();
}
