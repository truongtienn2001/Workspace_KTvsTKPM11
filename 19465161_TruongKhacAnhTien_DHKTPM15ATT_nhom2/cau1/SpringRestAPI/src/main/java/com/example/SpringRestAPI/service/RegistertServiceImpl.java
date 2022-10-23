package com.example.SpringRestAPI.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.SpringRestAPI.dao.RegistertRepository;
import com.example.SpringRestAPI.entity.User;
@Service
public class RegistertServiceImpl implements RegistertService{
	@Autowired
	RegistertRepository registertRepository;
	
	@Override
	@Transactional
	public void addUser(User user) {
		registertRepository.save(user);
	}

	@Override
	@Transactional
	public List<User> getUsers() {
		// TODO Auto-generated method stub
		return registertRepository.findAll();
	}
	
}
