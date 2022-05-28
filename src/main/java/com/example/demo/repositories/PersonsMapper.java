package com.example.demo.repositories;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.example.demo.entity.Users;

public class PersonsMapper implements RowMapper<Users> {
	 
    public Users mapRow(ResultSet rs, int rowNum) throws SQLException {
    	Users user = new Users();
        user.setId(rs.getInt("id"));
        user.setLogin(rs.getString("login"));
        user.setFirstName(rs.getString("firstName"));
        user.setLastName(rs.getString("lastName"));
        user.setPassword(rs.getString("password"));
        user.setPhoneNmber(rs.getString("phonNumber"));
        user.setVisitedMuseum(rs.getInt("visitedMuseum"));
        user.setNowCoin(rs.getInt("nowCoin"));
        user.setAllCoin(rs.getInt("allCoin"));
        return user;
    }
}