package com.huoxiaolu.manger.mangerbackend.common;
import com.auth0.jwt.JWT;
import com.auth0.jwt.JWTVerifier;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.interfaces.DecodedJWT;
import java.util.Date;

public class TokenUtil {
  private static final long EXPIRE_TIME= 10*60*60*1000;
  private static final String TOKEN_SECRET="tokenSecret";
  /**
   * 签名生成
   * @param userName 用户名
   * @return token
   */
  public static String sign(String userName){
    String token = null;
    try {
      Date expiresAt = new Date(System.currentTimeMillis() + EXPIRE_TIME);
      token = JWT.create()
          .withIssuer("auth0")
          .withClaim("userName", userName)
          .withExpiresAt(expiresAt)
          // 使用了HMAC256加密算法。
          .sign(Algorithm.HMAC256(TOKEN_SECRET));
    } catch (Exception e){
      e.printStackTrace();
    }
    return token;
  }
  /**
   * 签名验证
   * @param token
   * @return
   */
  public static boolean verify(String token){
    try {
      JWTVerifier verifier = JWT.require(Algorithm.HMAC256(TOKEN_SECRET)).withIssuer("auth0").build();
      DecodedJWT jwt = verifier.verify(token);
      System.out.println("认证通过：");
      System.out.println("userName: " + jwt.getClaim("userName").asString());
      System.out.println("过期时间：      " + jwt.getExpiresAt());
      return true;
    } catch (Exception e){
      return false;
    }
  }

}
