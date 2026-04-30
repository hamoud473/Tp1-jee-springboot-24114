package com.example.demo.entity;

import java.time.LocalDateTime;
import org.hibernate.annotations.CreationTimestamp;
import org.springframework.data.annotation.LastModifiedDate;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class AppUser {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(nullable = false, unique = true)
    private String username;
    @Column(nullable = false, unique = true)
    private String email;
    @Column(nullable = false, updatable = true)
    private String password;
    @Column(unique = true)
    private String nni;
    @Column(unique = true)
    private String phoneNumber;
    private String address;

    @ManyToOne(optional = true)
    private Role role;

    @CreationTimestamp
    private LocalDateTime createdAt;
    @LastModifiedDate
    private LocalDateTime updatedAt;
    public String getUsername() {
    return username;
}

public String getPassword() {
    return password;
}

public Role getRole() {
    return role;
}
public void setUsername(String username) { this.username = username; }
public void setEmail(String email) { this.email = email; }
public void setPassword(String password) { this.password = password; }
public void setRole(Role role) { this.role = role; }
}
