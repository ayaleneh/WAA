package com.WAAHomework.WAA.Config;

import org.springframework.security.authentication.AbstractAuthenticationToken;
import org.springframework.security.core.authority.SimpleGrantedAuthority;

import java.util.Collections;

public class JwtAuthentication extends AbstractAuthenticationToken {
    private String username;
    public JwtAuthentication(String username){
        super(Collections.singletonList(new SimpleGrantedAuthority("ROLE_USER")));
        this.username=username;
    }
    public Object getCredentials(){
        return null;
    }
    public Object getPrincipal(){
        return username;
    }
    public boolean isAuthenticated(){
        return  true;
    }
}
