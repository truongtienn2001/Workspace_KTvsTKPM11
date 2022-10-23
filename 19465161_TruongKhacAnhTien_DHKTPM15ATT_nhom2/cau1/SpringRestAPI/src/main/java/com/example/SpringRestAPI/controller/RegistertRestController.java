package com.example.SpringRestAPI.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.SpringRestAPI.entity.User;
import com.example.SpringRestAPI.service.RegistertService;

@RestController
@RequestMapping("/api")
public class RegistertRestController {
	@Autowired
	RegistertService registertService ;
	
	@PostMapping("/registerts")
	public User addUser(@RequestBody User user) {
		user.setId(0);
		registertService.addUser(user);
		return user;
	}
	

}
