package com.example.demo.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.time.LocalDateTime;
import java.util.List;
import org.hibernate.annotations.CreationTimestamp;
import org.springframework.data.annotation.LastModifiedDate;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(nullable = false, unique = true)
    private String name;
    @ManyToMany(fetch = FetchType.EAGER)
    private List<Permission> permissions;

    @CreationTimestamp
    private LocalDateTime createdAt;
    @LastModifiedDate
    private LocalDateTime updatedAt;
    public List<Permission> getPermissions() {
    return permissions;}
public void setPermissions(List<Permission> permissions) { this.permissions = permissions; }
public String getName() { return name; }
public void setName(String name) { this.name = name; }
}
