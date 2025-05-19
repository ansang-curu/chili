package com.chiliSite.chiliSite.model;

import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import lombok.ToString;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class User {
    private Long userId;
    private String userEmail;
    private String userName;
    private String password;
    private String role;
    private LocalDateTime createdAt;

}