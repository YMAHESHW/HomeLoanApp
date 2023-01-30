package com.cg.homeloan.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.homeloan.entities.User;
import com.cg.homeloan.repository.IUserRepository;

@Service
public class IUserServiceImpl implements IUserService {
	@Autowired
	IUserRepository repository;

	public IUserServiceImpl(IUserRepository repository) {
		super();
		this.repository = repository;
	}
	@Override
	public User addNewUser(User user) {

		try {
			repository.save(user);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return user;
	}

	@Override
	public String signIn(User user) throws Exception {
		User u = repository.findById(user.getUserId()).orElseThrow(() -> new Exception("User Not present"));
		if (u.getUserId() == user.getUserId() && user.getPassword().equals(u.getPassword())) {
			return "Sign in successfully done";
		} else {
			return "Invalid credentials";
		}
	}

	@Override
	public String signOut(User user) throws Exception {
		User u = repository.findById(user.getUserId()).orElseThrow(() -> new Exception("User Not present"));
		if (u.getUserId() == user.getUserId() && u.getPassword().equals(user.getPassword())) {
			return "Sign Out done successfully";
		} else {
			return "Invalid credentials";
		}
	}

}
