package com.lti.dao;

import org.springframework.stereotype.Repository;

import com.lti.pojo.Login;

@Repository
public class LoginDAO {
	
	public boolean validateLogin(Login login)
	{
		if(login.getLoginname().equals("mansi") && login.getPassword().equals("makwana"))
		{
			return true;
		}
		else
			return false;
	}

}
