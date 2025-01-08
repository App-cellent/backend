package com.example.dotheG.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.http.HttpStatus;

@AllArgsConstructor
@Getter
public enum ErrorCode {
    ID_DUPLICATED(HttpStatus.CONFLICT, "중복된 아이디입니다"),
    EMAIL_DUPLICATED(HttpStatus.CONFLICT, "중복된 이메일입니다"),
    AUTHENTICATION_FAILED(HttpStatus.UNAUTHORIZED, "유저 인증에 실패했습니다"),
    INVALID_TOKEN(HttpStatus.UNAUTHORIZED, "유효하지 않은 토큰입니다"),
    EXPIRED_ACCESS_TOKEN(HttpStatus.UNAUTHORIZED, "만료된 토큰입니다. 토큰 재발행을 요청해주세요"),
    EXPIRED_REFRESH_TOKEN(HttpStatus.UNAUTHORIZED, "만료된 토큰입니다. 로그인을 다시 해주세요."),
    TOKEN_NOT_FOUND(HttpStatus.UNAUTHORIZED, "인증에 필요한 JWT가 없습니다"),
    USER_NOT_FOUND(HttpStatus.NOT_FOUND, "유저를 찾을 수 없습니다."),
    STEP_NOT_FOUND(HttpStatus.NOT_FOUND, "step 객체를 찾을 수 없습니다."),
    MEMBER_INFO_NOT_FOUND(HttpStatus.NOT_FOUND, "memberInfo 객체를 찾을수없습니다.");
    QUIZ_NOT_FOUND(HttpStatus.NOT_FOUND, "해당 퀴즈가 없습니다."),
    MYANSWER_NOT_FOUND(HttpStatus.NOT_FOUND, "정답이 입력되지 않았습니다."),
    PROCESS_IMAGE_FAILED(HttpStatus.UNPROCESSABLE_ENTITY, "이미지 처리에 실패했습니다."),
    ACTIVITY_NOT_FOUND(HttpStatus.NOT_FOUND, "오늘 인증한 활동이 없습니다.");

    private final HttpStatus status;
    private final String message;
}
