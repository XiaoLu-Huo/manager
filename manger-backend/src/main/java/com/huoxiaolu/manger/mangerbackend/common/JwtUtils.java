package com.huoxiaolu.manger.mangerbackend.common;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import java.util.Date;


public class JwtUtils {

  private static final String SECRET_KEY = "managerBackend1managerBackend2managerBackend3managerBackend";

  private static final long EXPIRATION = 604800;

  /**
   *   生成token
   */
  public static String generateToken(String username) {
    Date now  = new Date();
    Date expiration = new Date(now.getTime() + 1000 * EXPIRATION);
    return Jwts.builder()
        .setHeaderParam("type", "JWT")
        .setSubject(username)
        .setIssuedAt(now)
        .setExpiration(expiration)
        .signWith(SignatureAlgorithm.HS256, SECRET_KEY)
        .compact();
  }

  /**
   * 解析token，获取username
   */
  public static Claims getClaimsByToken (String token) {
    return Jwts.parser()
        .setSigningKey(SECRET_KEY)
        .parseClaimsJws(token)
        .getBody();
  }
}
