package com.example.dotheG.service;

import com.example.dotheG.model.Member;
import com.example.dotheG.model.MemberQuiz;
import com.example.dotheG.model.Quiz;
import com.example.dotheG.repository.MemberQuizRepository;
import com.example.dotheG.repository.MemberRepository;
import com.example.dotheG.repository.QuizRepository;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class QuizService {

    private final QuizRepository quizRepository;
    private final MemberQuizRepository memberQuizRepository;
    private final MemberRepository memberRepository;

    // 오늘의 퀴즈 이미 풀었는지 조회
    public String check(Long userId, Long quizId){
        MemberQuiz memberQuiz = memberQuizRepository.findByUserIdAndQuizId(userId, quizId);
        // 오늘 퀴즈를 풀었는지 확인
        if (memberQuiz != null && memberQuiz.isSolved()){
            return "오늘 퀴즈를 이미 풀었습니다.";
        } else {
            return "퀴즈를 풀 수 있습니다.";
        }
    }

    // 퀴즈 풀기
    public void solve(Long userId, Long quizId, String myAnswer){
        // 퀴즈 조회
        Quiz quiz = quizRepository.findById(quizId)
                .orElseThrow(() -> new IllegalArgumentException("퀴즈가 없습니다."));
        String quizAnswer = quiz.getQuizAnswer();

        // 멤버퀴즈 조회
        MemberQuiz memberQuiz = memberQuizRepository.findByUserIdAndQuizId(userId, quizId);

        // MemberQuiz가 없으면 컬럼 생성
        if (memberQuiz == null){
            Member user = memberRepository.findById(userId)
                    .orElseThrow(() -> new IllegalArgumentException("사용자를 찾을 수 없습니다."));
            memberQuiz = new MemberQuiz(user, quiz);
        }

        // 정답 확인 및 상태 변경 : isSolved -> true 변경
        if (myAnswer == null || myAnswer.isBlank()){
            try {
                throw new IllegalAccessException("정답이 입력되지 않았습니다.");
            } catch (IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        } else {
            memberQuiz.updateStatus(myAnswer.equals(quizAnswer), true);
        }
        memberQuizRepository.save(memberQuiz);
    }
}