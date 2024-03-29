package com.example.demo.repositories;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.example.demo.entity.Users;
 
@Component
public class PersonsRepository {
 
    @Autowired
    private JdbcTemplate jdbcTemplate;
    public int createPerson(String login, String firstName, String lastName, String phoneNumber, String password, Integer visitedMuseum, Integer allCoin, Integer commentCount){
        return jdbcTemplate.update("INSERT INTO \"USER\" (\"FIRSTNAME\", \"LASTNAME\", \"VISITEDMUSEUM\", \"ALLCOIN\", \"PHONNUMBER\", \"LOGIN\", \"PASSWORD\", \"COMMENT_COUNT\") VALUES (?, ?, ?, ?, ?, ?, ?, ?)", firstName, lastName, visitedMuseum, allCoin, phoneNumber, login, password, commentCount);
    }
 
    public int deletePerson(Integer id){
        return jdbcTemplate.update("DELETE FROM \"USER\" WHERE \"ID\" = ?",id);
    }
    
    public int updatePerson(Users person){
        return jdbcTemplate.update("UPDATE \"USER\" SET \"ALLCOIN\" = ?, \"VISITEDMUSEUM\" = ?, \"COMMENT_COUNT\" = ? WHERE \"ID\" = ?", person.getAllCoin(), person.getVisitedMuseum(), person.getCommentCount(), person.getId());
    }
 
    public Users getPerson(String login){
        return jdbcTemplate.queryForObject("SELECT * FROM \"USER\" WHERE \"LOGIN\"=?", new PersonsMapper(), login);
    }
 
    public List<Users> getPersons(){
        return jdbcTemplate.query("SELECT * FROM \"USER\"", new PersonsMapper());
    }
    
    public List<Users> getPersonsTop(){
        return jdbcTemplate.query("SELECT * FROM \"USER\" ORDER BY \"ALLCOIN\" DESC", new PersonsMapper());
    }

}