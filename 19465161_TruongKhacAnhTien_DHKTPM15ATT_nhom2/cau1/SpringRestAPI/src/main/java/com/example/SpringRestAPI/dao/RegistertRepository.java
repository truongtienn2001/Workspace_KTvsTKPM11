package com.example.SpringRestAPI.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.SpringRestAPI.entity.User;
@Repository
public interface RegistertRepository extends JpaRepository<User, String>{

}
