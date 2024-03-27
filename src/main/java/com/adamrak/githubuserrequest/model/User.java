package com.adamrak.githubuserrequest.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.ZonedDateTime;


public class User {

    private int id;
    private String login;
    private String name;
    private String type;
    private String avatarUrl;
    private ZonedDateTime createdAt;
    private int followers;

    public User() {
    }

    @JsonCreator
    public User(
            final int id,
            final String login,
            final String name,
            final String type,
            @JsonProperty("avatar_url") String avatarUrl,
            @JsonProperty("created_at") ZonedDateTime createdAt,
            final int followers
    ){
        this.id = id;
        this.login = login;
        this.name = name;
        this.type = type;
        this.avatarUrl = avatarUrl;
        this.createdAt = createdAt;
        this.followers = followers;
    }

    public int getId() {
        return id;
    }

    public String getLogin() {
        return login;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public String getAvatarUrl() {
        return avatarUrl;
    }

    public ZonedDateTime getCreatedAt() {
        return createdAt;
    }

    public double getFollowers() {
        return followers;
    }



    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", login='" + login + '\'' +
                ", name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", avatarUrl='" + avatarUrl + '\'' +
                ", createdAt='" + createdAt + '\'' +
                ", followers=" + followers +
                '}';
    }
}
