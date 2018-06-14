package com.bridgeit.loginregistration.interceptor;

import java.util.regex.Pattern;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.ModelAndViewDefiningException;

public class LoginInterceptor implements HandlerInterceptor 
{
	String username;
	String password;
	Long phonenumber;
	String address;
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
		throws Exception {
		ModelAndView model = new ModelAndView();
		String username = request.getParameter("username");
		System.out.println(username);
		String password = request.getParameter("password");
		String phonenumber = request.getParameter("phone");
		String address = request.getParameter("address");
		if(nameValidation(username)&&username!=""&&passwordValidation(password)&&password!=""&&addressValidation(address)&&address!=""&&phonenumber.length()>8)
		{
			return true;
		}
		else
		{
			model.setViewName("registration");
			String message ="Please fill the all the details compulsory";
			model.addObject("message", message);
		    throw new ModelAndViewDefiningException(model);
		}
	}

	public boolean nameValidation(String username)
	{
		String namepattern = "[A-Za-z]*";
		if(username.matches(namepattern))
		{
			return true;
		}
		else
		{
		return false;
		}
	}
	
	public boolean passwordValidation(String password)
	{
		String passwordpattern= "((?=.*[a-z])(?=.*\\d)(?=.*[A-Z])(?=.*[@#$%!]).{8,40})";
		if(password.matches(passwordpattern))
		{
		return true;	
		}
		else
		{
		return false;
		}
	}
	
	public boolean addressValidation(String address)
	{
		String addresspattern = "[A-Za-z]*";
		if(address.matches(addresspattern))
		{
			return true;
		}
		else
		{
		return false;
		}
	}
	
}
