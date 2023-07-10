package com.huoxiaolu.manger.mangerbackend.interceptor;

import com.auth0.jwt.JWT;
import com.auth0.jwt.JWTVerifier;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.exceptions.JWTVerificationException;
import com.huoxiaolu.manger.mangerbackend.shared.enums.LoginErrorCode;
import com.huoxiaolu.manger.mangerbackend.shared.exceptions.LoginBusinessException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.HandlerInterceptor;

public class JwtInterceptor implements HandlerInterceptor {

  public static final String OPTIONS = "OPTIONS";

  @Override
  public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
    String method = request.getMethod();
    if (OPTIONS.equalsIgnoreCase(method)) {
      return true;
    }
    if (!(handler instanceof HandlerMethod)) {
      return true;
    }
    String token = request.getHeader("token");
    if (token == null) {
      throw new LoginBusinessException(LoginErrorCode.TOKEN_ERROR);
    }
    //在jwt中，只要token不合法或者验证不通过就会抛出异常
    JWTVerifier jwtVerifier = JWT.require(Algorithm.HMAC256("managerBackend")).build();
    try {
      jwtVerifier.verify(token);
    } catch (JWTVerificationException e) {
      throw new LoginBusinessException(LoginErrorCode.TOKEN_ERROR);
    }
    return true;
  }

}
