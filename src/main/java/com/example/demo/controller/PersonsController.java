package com.example.demo.controller;

import java.util.List;

import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
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
    public int createPerson(@RequestParam String login, @RequestParam String firstName, @RequestParam String lastName, @RequestParam String phoneNumber, @RequestParam String password, @RequestParam Integer visitedMuseum,@RequestParam Integer nowCoin, @RequestParam Integer allCoin){
    return user.createPerson(login, firstName, lastName, phoneNumber, password, visitedMuseum, nowCoin, allCoin);
    }
 
    @RequestMapping("/update")
    public int updatePerson(@RequestParam Integer id, @RequestParam String name){
        Users p = new Users();
        try{
            p.setId(id);
            p.setFirstName(name);
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
}