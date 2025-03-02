package org.example.userservice.dtos;

import lombok.Getter;
import lombok.Setter;


public class ValidateTokenRequestDto {
    private Long userId;

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    private String token;
}