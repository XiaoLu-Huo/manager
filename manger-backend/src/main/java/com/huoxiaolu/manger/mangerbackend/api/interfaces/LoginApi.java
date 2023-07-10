package com.huoxiaolu.manger.mangerbackend.api.interfaces;

import com.huoxiaolu.manger.mangerbackend.api.request.LoginRequest;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author xiaolu.huo
 */
@RequestMapping
public interface LoginApi {

  /**
   * 登陆
   * @param user 登陆用户
   * @return 登陆成功之后返回token
   */
  @PostMapping("/login")
  String login(@RequestBody LoginRequest user);

  String info(@Param("token") String token);
}
