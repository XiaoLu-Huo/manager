package com.huoxiaolu.manger.mangerbackend.common;


import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.FilterConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import org.springframework.stereotype.Component;

/**
 * 解决跨域问题：即前后端分离项目中协议、域名、端口号中存在不一致的情况下是否有权限访问资源的问题
 */
@Component
public class SimpleCORSFilter implements Filter {

  @Override
  public void doFilter(ServletRequest req, ServletResponse res, FilterChain chain) throws IOException, ServletException {
    HttpServletRequest reqs = (HttpServletRequest) req;
    String curOrigin = reqs.getHeader("Origin");
    HttpServletResponse response = (HttpServletResponse) res;
    response.setHeader("Access-Control-Allow-Origin", curOrigin == null ? "true" : curOrigin);
    response.setHeader("Access-Control-Allow-Credentials", "true");
    response.setHeader("Access-Control-Allow-Methods", "POST, GET, OPTIONS, DELETE, HEAD");
    response.setHeader("Access-Control-Max-Age", "3600");
    response.setHeader("Access-Control-Allow-Headers", "access-control-allow-origin, authority, token, content-type, version-info, X-Requested-With");
    response.setContentType("application/json;charset=UTF-8");
    chain.doFilter(req, res);

  }

  @Override
  public void init(FilterConfig filterConfig) {}

  @Override
  public void destroy() {}

}
