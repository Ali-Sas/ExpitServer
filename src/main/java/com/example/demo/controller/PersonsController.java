package com.example.demo.controller;

import java.util.List;

import org.json.JSONException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Users;
import com.example.demo.repositories.PersonsRepository;

@RestController
@RequestMapping("user")
public class PersonsController {
 
    @Autowired
    private PersonsRepository user;
 
    @RequestMapping("/create")
    public int createPerson(@RequestParam String login, @RequestParam String firstName, @RequestParam String lastName, @RequestParam String phoneNumber, @RequestParam String password, @RequestParam Integer visitedMuseum, @RequestParam Integer allCoin, @RequestParam Integer commentCount){
    return user.createPerson(login, firstName, lastName, phoneNumber, password, visitedMuseum, allCoin, commentCount);
    }
 
    @RequestMapping("/update")
    public int updatePerson(@RequestParam Integer id, @RequestParam Integer allCoin, @RequestParam Integer visitedMuseum, @RequestParam Integer commentCount){
        Users p = new Users();
        try{
            p.setId(id);
            p.setAllCoin(allCoin);
            p.setVisitedMuseum(visitedMuseum);
            p.setCommentCount(commentCount);
        }catch(JSONException e){
            e.getLocalizedMessage();
            return 0;
        }
    return user.updatePerson(p);
    }
 
    @RequestMapping("/id")
    public int deletePerson(@RequestParam Integer id){
        return user.deletePerson(id);
    }
 
    @RequestMapping("/getperson")
    public Users getPerson(@RequestParam String id){
        return user.getPerson(id);
    }
 
    @RequestMapping("/getpersons")
    public List<Users> getPersons(){
        return user.getPersons();
    }
    
    @RequestMapping("/getpersonstop")
    public List<Users> getPersonsTop(){
        return user.getPersonsTop();
    }
}