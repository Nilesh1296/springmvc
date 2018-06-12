package com.bridgeit.loginRegistration.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.bridgeit.loginRegistration.model.User;

public class DatabaseInsertion
{
	     @Autowired
	    JdbcTemplate jdbcTemplate;
	 	public void addUser(@ModelAttribute("userdetails") User user)
	 	{
	 		String query = "insert into registration(username,password,phonenumber,address) values(?,?,?,?);"; 
	 		jdbcTemplate.update("query",user.getUsername(),user.getPassword(),user.getPhone(),user.getAddress());
	 		System.out.println("User added");
	 	}
}
