package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.entity.Comments;
import com.example.demo.repositories.CommentsRepository;

@RestController
@RequestMapping("comment")
public class CommentsController {
	
    @Autowired
    private CommentsRepository comments;
    
    @RequestMapping("/create")
    public int createComment(@RequestParam String firstName, @RequestParam String lastName, @RequestParam String comment, @RequestParam Double estimationMuseum, @RequestParam Integer museumId, @RequestParam String date){
    	return comments.createComment(firstName, lastName, comment, estimationMuseum, museumId, date);
    }

    @RequestMapping("/id")
    public int deleteComment(@RequestParam Integer id){
        return comments.deleteComment(id);
    }

    @RequestMapping("/getcomment")
    public List<Comments> getComment(@RequestParam Integer id){
        return comments.getComment(id);
    }
 
    @RequestMapping("/getcomments")
    public List<Comments> getComments(){
        return comments.getComments();
    }
}