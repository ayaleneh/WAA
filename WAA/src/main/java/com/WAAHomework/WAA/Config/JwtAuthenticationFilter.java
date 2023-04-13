package com.WAAHomework.WAA.Config;

import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.apache.tomcat.util.net.openssl.ciphers.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.www.BasicAuthenticationFilter;

import java.io.IOException;

public class JwtAuthenticationFilter extends BasicAuthenticationFilter {
    //used to handle token authentication
    private JwtUtils jwtUtils;
    public JwtAuthenticationFilter(JwtUtils jwtUtils){
        super((request, response, authException) -> {});
        this.jwtUtils=jwtUtils;
    }

    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain chain) throws IOException, ServletException {
        String token =request.getHeader("Authorization");
        if (token==null || !token.startsWith("Bearer")){
            chain.doFilter(request, response);
            return;
        }
        String jwtToken= token.substring(7);
        if (jwtUtils.validateToken(jwtToken)){
            String username=jwtUtils.getUsernameFromToken(jwtToken);
            JwtAuthentication authentication=new JwtAuthentication(username);
            SecurityContextHolder.getContext().setAuthentication(authentication);
        }
        chain.doFilter(request,response);
    }
}
