package com.example.dotheG.controller;

import com.example.dotheG.service.QuizService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/quiz")
public class QuizController {

    private final QuizService quizService;

    public QuizController(QuizService quizService) {
        this.quizService = quizService;
    }

    // 오늘의 퀴즈 이미 풀었는지 조회
    @GetMapping()
    public void check(@RequestParam Long userId,
                      @RequestParam Long quizId){
        quizService.check(userId, quizId);
    }

    // 퀴즈 풀기
    @PostMapping("/solve")
    public void solve(@RequestParam String myAnswer,
                      @RequestParam Long userId,
                      @RequestParam Long quizId){
        quizService.solve(userId, quizId, myAnswer);
    }
}
