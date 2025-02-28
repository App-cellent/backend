package com.example.dotheG.config.jwt;

import com.example.dotheG.dto.CustomUserDetails;
import com.example.dotheG.dto.MemberDto;
import com.example.dotheG.dto.oAuth2.CustomOAuth2User;
import com.example.dotheG.exception.CustomException;
import com.example.dotheG.exception.ErrorCode;
import com.example.dotheG.model.Member;
import io.jsonwebtoken.ExpiredJwtException;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.filter.OncePerRequestFilter;

import java.io.IOException;
import java.io.PrintWriter;

@Slf4j
public class JwtFilter extends OncePerRequestFilter {

    private final JwtUtil jwtUtil;

    public JwtFilter(JwtUtil jwtUtil) {
        this.jwtUtil = jwtUtil;
    }

    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain) throws ServletException, IOException {
        log.info("[Jwt Filter] 요청 확인");

        String accessToken = request.getHeader("access");

        log.info("[JwtFilter] Access token: {}", accessToken);
        String authorization = null;
        Cookie[] cookies = request.getCookies();
        if (cookies != null) {
            for (Cookie cookie : cookies) {
                log.info("[JwtFilter] Cookie : {} 확인", cookie);
                if (cookie.getName().equals("authorization")) {
                    authorization = cookie.getValue();
                }
            }
        }

        if (accessToken == null) {
            filterChain.doFilter(request, response);
            return;
        }

        //만료된 토큰 예외처리는 아래 방식으로 하기
        try {
            jwtUtil.isExpired(accessToken);
        } catch (ExpiredJwtException e) {
            PrintWriter writer = response.getWriter();
            writer.print("access token expired");

            response.setStatus(HttpServletResponse.SC_UNAUTHORIZED);
            return;
        }

        String category = jwtUtil.getCategory(accessToken);

        if (!category.equals("access")) {

            PrintWriter writer = response.getWriter();
            writer.print("invalid access token");

            throw new CustomException(ErrorCode.INVALID_TOKEN);
        }

        String userLogin = jwtUtil.getUsername(accessToken);
        String role = jwtUtil.getRole(accessToken);

        Member member = Member.builder()
                .userLogin(userLogin)
                .role(role)
                .build();

        CustomUserDetails customUserDetails = new CustomUserDetails(member);

        Authentication authToken = new UsernamePasswordAuthenticationToken(customUserDetails, null, customUserDetails.getAuthorities());
        SecurityContextHolder.getContext().setAuthentication(authToken);

        if (authorization == null) {
            System.out.println("token null");
            filterChain.doFilter(request, response);
            return;
        }
        String token = authorization;
        if (jwtUtil.isExpired(token)) {
            System.out.println("token expired");
            filterChain.doFilter(request, response);
            return;
        }
        String userSocialLogin = jwtUtil.getUsername(token);
        String socialRole = jwtUtil.getRole(token);
        MemberDto socialMember = MemberDto.builder()
                .userLogin(userSocialLogin)
                .role(socialRole)
                .build();
        CustomOAuth2User customOAuth2User = new CustomOAuth2User(socialMember);
        Authentication authentication = new UsernamePasswordAuthenticationToken(customOAuth2User, null, customOAuth2User.getAuthorities());
        SecurityContextHolder.getContext().setAuthentication(authentication);

        filterChain.doFilter(request, response);
    }
}