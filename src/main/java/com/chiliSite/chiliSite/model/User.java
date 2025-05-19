package com.chiliSite.chiliSite.model;

import java.time.LocalDateTime;

public class User {
    private Long userId;
    private String userEmail;
    private String userName;
    private String password;
    private String role;
    private LocalDateTime createdAt;

    // 기본 생성자
    public User() {}

    // 전체 필드 생성자
    public User(Long userId, String userEmail, String userName, String password, String role, LocalDateTime createdAt) {
        this.userId = userId;
        this.userEmail = userEmail;
        this.userName = userName;
        this.password = password;
        this.role = role;
        this.createdAt = createdAt;
    }

    // Getter 메서드
    public Long getUserId() {
        return userId;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }

    public String getRole() {
        return role;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    // toString (디버깅용)
    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", userEmail='" + userEmail + '\'' +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", role='" + role + '\'' +
                ", createdAt=" + createdAt +
                '}';
    }
}
