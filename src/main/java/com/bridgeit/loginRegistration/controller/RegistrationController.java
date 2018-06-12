package com.bridgeit.loginRegistration.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.bridgeit.loginRegistration.dao.UserDaoImpl;
import com.bridgeit.loginRegistration.model.User;

@Controller
public class RegistrationController
{
	@Autowired
	UserDaoImpl userdao ;
	
	@RequestMapping(value = "/registrationaccount", method = RequestMethod.POST)
   public ModelAndView addUser(@ModelAttribute("userdetails") User user)
   {
		userdao.register(user);
		 ModelAndView mav = new ModelAndView("Registrationsuccess");
		 
		 
	   return mav;
	   
   }
	
	/*@RequestMapping(value = "/")
	   public ModelAndView home()
	   {	 
			 
		   return new ModelAndView("index");
		   
	   }*/
	
	
}
