package com.sun.user.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.antlr.v4.runtime.misc.NotNull;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;

@Entity
@Table(name = "user")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Users {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @NotNull
    private String firstName;

    @NotNull
    private String lastName;

    @NotNull
    private String password;
    private String mobileNo;
   // private String userId;
    @NotNull
    private String emailId;
    @CreationTimestamp
    private LocalDateTime createdDate;
    @CreationTimestamp
    private LocalDateTime updatedDate;
    private Boolean isLocked;
    private String unlockedBy;
    private Integer wrongPassCount;
    private String Role;
}
