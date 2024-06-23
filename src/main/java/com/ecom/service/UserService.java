package com.ecom.service;

import java.util.List;

import com.ecom.model.UserDtls;

public interface UserService {

	public UserDtls saveUser(UserDtls user);

	public UserDtls getUserByEmail(String email);
	
	public List<UserDtls> getUsers(String role);

	public Boolean updateAccountStatus(Integer id, Boolean status);
	
}
