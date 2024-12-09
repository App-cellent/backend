package com.example.dotheG.model;

import jakarta.persistence.*;
import lombok.Getter;
import java.util.Date;

@Entity
public class Quiz {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "QUIZ_ID")
    private Long quizId;

    private Date quizDate;

    @Getter
    private String quizAnswer;

    private String quizSol;

//    public String getQuizAnswer() {
//        return quizAnswer;
//    }
}
