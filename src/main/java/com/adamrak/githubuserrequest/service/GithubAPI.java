package com.adamrak.githubuserrequest.service;


import com.adamrak.githubuserrequest.model.User;
import com.adamrak.githubuserrequest.model.UserRequest;
import com.adamrak.githubuserrequest.repository.UserRequestRepository;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class GithubAPI {
    private UserRequestRepository repository;
    private final String apiURL = "https://api.github.com/users/{userName}";
    GithubAPI(final UserRequestRepository userRequestRepository) {
        this.repository = userRequestRepository;
    }

    public User getUserData(final String userName){
        RestTemplate template = new RestTemplate();
        User user = template.getForObject(apiURL,User.class,userName);
        setUserRequest(user);
        return user;
    }

    public List<UserRequest> getAllUserRequest(){
        return repository.findAll();
    }

    void setUserRequest(User user) {
        if(repository.existsByLogin(user.getLogin())) {
            repository.findByLogin(user.getLogin())
                    .ifPresent(userRequest -> {
                        userRequest.incrementRequestCount();
                        repository.save(userRequest);
                    });
        }else{
            repository.save(new UserRequest(user.getLogin()));
        }
    }
}
