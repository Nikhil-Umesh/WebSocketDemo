package com.example.springbootwebsocketexample.model;

public class UserResponse {
    String content;

    public UserResponse() {
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public UserResponse(String content) {
        this.content = content;

    }
}