package com.bridgeit.loginRegistration.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.bridgeit.loginRegistration.model.Login;
import com.bridgeit.loginRegistration.model.User;

public class UserDaoImpl implements Userdao {

	@Autowired
	JdbcTemplate jdbcTemplate;

	public UserDaoImpl(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;

	}

	@Override
	public void register(User user) {
		String sql = "insert into registration (username,password,phonenumber,address) values(?,?,?,?)";
		jdbcTemplate.update(sql,
				new Object[] { user.getUsername(), user.getPassword(), user.getPhone(), user.getAddress() });

	}

	@Override
	public User validateUser(Login login) {
		
     String sql="select * from registration where username='" + login.getUsername() + "' and password='" + login.getPassword() + "' ";
     List<User> users = jdbcTemplate.query(sql, new UserMapper());
     return users.size() > 0 ? users.get(0) : null;
     
		
	}

    
}
class UserMapper implements RowMapper<User> {
	 
    @Override
	public User mapRow(ResultSet rs, int rowNum) throws SQLException {
		
    	User user = new User();
    	 user.setUsername(rs.getString("username"));
    	 user.setPassword(rs.getString("password"));
    	 user.setPhone(rs.getLong("phonenumber"));
    	 user.setAddress(rs.getString("address"));
		return user;
	}
	}