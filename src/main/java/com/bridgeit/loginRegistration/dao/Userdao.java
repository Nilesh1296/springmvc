package com.bridgeit.loginRegistration.dao;

import com.bridgeit.loginRegistration.model.Login;
import com.bridgeit.loginRegistration.model.User;

public interface Userdao 
{
      void register(User user);
	  User validateUser(Login login);
}
