package com.example.dotheG.model;

import jakarta.persistence.*;
import org.hibernate.annotations.ColumnDefault;

@Entity
public class Member {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "USER_ID")
    private Long userId;

    private String userName;

    private String userLogin;

    private String userPassword;

    private boolean avaiable;

    @Column(columnDefinition = "boolean default false")
    private boolean isSocial;
}
