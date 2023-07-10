package com.huoxiaolu.manger.mangerbackend.application.controller;

import com.huoxiaolu.manger.mangerbackend.api.interfaces.LoginApi;
import com.huoxiaolu.manger.mangerbackend.api.request.LoginRequest;
import com.huoxiaolu.manger.mangerbackend.common.JwtUtils;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author xiaolu.huo
 */
@RestController
@RequiredArgsConstructor
@RequestMapping
public class LoginController implements LoginApi {

    private static final String PASSWORD = "admin123";
    private static final String USER_NAME = "admin";

    @Override
    @PostMapping("/login")
    public String login(LoginRequest user) {
        // 暂时将用户名和密码写成固定的
        if (USER_NAME.equals(user.getUserName()) && PASSWORD.equals(user.getPassword())) {
            return JwtUtils.generateToken(user.getUserName());
        }
        return "";
    }

    @Override
    @GetMapping("/info")
    public String info(String token) {
        return JwtUtils.getClaimsByToken(token).getSubject();
    }


}
