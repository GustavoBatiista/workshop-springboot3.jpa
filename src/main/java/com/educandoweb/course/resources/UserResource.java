package com.educandoweb.course.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.educandoweb.course.entities.User;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
@RequestMapping(value =  "/users")
public class UserResource {
    @GetMapping
    public ResponseEntity<User> findAll(){
        User u = new User((long) 1,"Maria","maria@gmail.com","9999999","1234");
        return ResponseEntity.ok().body(u);
    }
}
