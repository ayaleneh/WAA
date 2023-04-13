package com.WAAHomework.WAA.Config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.*;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter{
private JwtUtils jwtUtils;
public SecurityConfig(JwtUtils jwtUtils){
    this.jwtUtils=jwtUtils;
}
protected void configure(HttpSecurity http) throws Exception{
    http.csrf().disable()
            .authorizeRequests()
            .antMatchers("/public/**").permitAll()
            .anyRequest().authenticated()
            .and()
            .addFilter(new JwtAuthenticationFilter(jwtUtils));
}
@Bean
    public BCryptPasswordEncoder passwordEncoder(){
    return  new BCryptPasswordEncoder();
}
}