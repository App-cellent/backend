package com.example.dotheG.model;

import jakarta.annotation.Nullable;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.Optional;

@Entity
@AllArgsConstructor
@NoArgsConstructor
public class MemberQuiz {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "USER_QUIZ_ID")
    private Long userQuizId;

    @ManyToOne
    @JoinColumn(name = "USER_ID")
    private Member userId;

    @ManyToOne
    @JoinColumn(name = "QUIZ_ID")
    private Quiz quizId;

    @Column(columnDefinition = "boolean default false")
    public boolean isSolved;

    @Nullable
    public Boolean isCorrect;

    public boolean isSolved(){
        return isSolved;
    }

    public MemberQuiz(Member userId, Quiz quizId){
        this.userId = userId;
        this.quizId = quizId;
        this.isSolved = false;
        this.isCorrect = null;
    }

    public Member getUserId() {
        return userId;
    }

    public Quiz getQuizId() {
        return quizId;
    }

    public void updateStatus(boolean isCorrect, boolean isSolved) {
        this.isCorrect = isCorrect;
        this.isSolved = isSolved;
    }
}
