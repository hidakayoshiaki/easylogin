package com.example.easylogin.model.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.easylogin.model.entity.User;
public interface UserRepository extends JpaRepository<User, Long> {

	List<User> findByUserNameAndPassword(String userName, String password);
}

