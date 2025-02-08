package com.example.springBootJWTAuthentication.entity;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AuthRequest {

    private String username;
    private String password;
}
