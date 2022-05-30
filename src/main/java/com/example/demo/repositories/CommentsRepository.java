package com.example.demo.repositories;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.example.demo.entity.Comments;

@Component
public class CommentsRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;
    public int createComment(String firstName, String lastName, String comment, Double estimationMuseum, Integer museumId){
        return jdbcTemplate.update("INSERT INTO \"COMMENTS\" (\"FIRSTNAME\", \"LASTNAME\", \"COMMENT\", \"ESTIMATION\", \"MUSEUM_ID\") VALUES (?, ?, ?, ?, ?)", firstName, lastName, comment, estimationMuseum, museumId);
    }

    public int deleteComment(Integer id){
        return jdbcTemplate.update("DELETE FROM \"COMMENTS\" WHERE \"ID\" = ?",id);
    }
 
    public Comments getComment(String name){
        return jdbcTemplate.queryForObject("SELECT * FROM \"COMMENTS\" WHERE \"NAME\"=?", new CommentsMapper(), name);
    }
 
    public List<Comments> getComments(){
        return jdbcTemplate.query("SELECT * FROM \"COMMENTS\"", new CommentsMapper());
    }
}
