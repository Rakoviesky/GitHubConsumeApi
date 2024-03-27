package com.adamrak.githubuserrequest.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class UserRequest {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private int id;
    private String login;
    private int requestCount;

    UserRequest() {
    }

    public UserRequest(final String login) {
        this.login = login;
        this.requestCount = 1;
    }

    public void incrementRequestCount(){
        this.requestCount++;
    }

    int getId() {
        return id;
    }

    public String getLogin() {
        return login;
    }

    public int getRequestCount() {
        return requestCount;
    }
}
