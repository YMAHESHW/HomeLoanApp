package com.cg.homeloan.service;

import com.cg.homeloan.entities.User;

public interface IUserService {
	public User addNewUser(User user);

	public String signIn(User user) throws Exception;

	public String signOut(User user) throws Exception;

}
