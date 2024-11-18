package com.example.dotheG.model;

import jakarta.persistence.*;

@Entity
public class MemberInfo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userInfoId;

    @OneToOne
    @JoinColumn(name = "USER_ID")
    private Member userId;

    // Todo : default value = 20
    private int userReward;

    private Long mainChar;
}
