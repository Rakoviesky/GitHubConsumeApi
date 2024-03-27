package com.adamrak.githubuserrequest.controller;

import com.adamrak.githubuserrequest.model.User;
import com.adamrak.githubuserrequest.service.GithubAPI;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserRequestController {

    private final GithubAPI githubAPI;

    UserRequestController(final GithubAPI githubAPI) {
        this.githubAPI = githubAPI;
    }

    @GetMapping("/user/{userName}")
    public ResponseEntity<?> getUserDataById(@PathVariable String userName){
        User user = githubAPI.getUserData(userName);
        return new ResponseEntity<>(user, HttpStatus.OK);
    }

    @GetMapping("/users")
    public ResponseEntity<?> getAllUserRequest(){
        return new ResponseEntity<>(githubAPI.getAllUserRequest(),HttpStatus.OK);
    }

}
