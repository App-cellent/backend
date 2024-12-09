package com.example.dotheG.dto;

import com.example.dotheG.model.Member;
import com.example.dotheG.model.Quiz;

public class QuizDto {
    private Member userId;
    private Quiz quizId;
    private boolean isSolved;
    private boolean isCorrect;
}
