package com.bridgeit.loginregistration.dao;

import com.bridgeit.loginregistration.model.Login;
import com.bridgeit.loginregistration.model.User;

public interface Userdao 
{
      void register(User user);
	  User validateUser(Login login);
}
