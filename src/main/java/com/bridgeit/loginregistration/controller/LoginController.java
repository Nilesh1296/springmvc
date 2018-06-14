package com.bridgeit.loginregistration.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.bridgeit.loginregistration.dao.UserDaoImpl;
import com.bridgeit.loginregistration.model.Login;
import com.bridgeit.loginregistration.model.User;
@Controller
public class LoginController
{
	@Autowired
	UserDaoImpl userdaoimpl;
	 @RequestMapping("/login")
		public ModelAndView showLogin(HttpServletRequest request,HttpServletResponse response,@ModelAttribute("login") Login login)
		{
		 ModelAndView mav = null;
		 User user = userdaoimpl.validateUser(login);
		    if (null != user) {
		    mav = new ModelAndView("Success");
		    mav.addObject("message", user.getUsername());
		    return mav;
		    } else {
		    	mav = new ModelAndView("index");
			    mav.addObject("message", "Please enter valid user and password");
		    	/*mav.addObject("message", Please enter valid user and password);
		    	mav = new ModelAndView("redirect:/");
*/
		    return mav;
		    
		    }
			
			
		    
			
		}
		
	 @RequestMapping("/registration")
		public ModelAndView showRegistration()
		{
			ModelAndView mav = new ModelAndView("registration");
			
		    return mav;
			
		}
	
	
}
