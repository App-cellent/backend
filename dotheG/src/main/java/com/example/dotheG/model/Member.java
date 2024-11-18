package com.example.dotheG.model;

import jakarta.persistence.*;

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

    // TOdo : default value : False
    private boolean isSocial;
}
