package org.example.userservice.security;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SpringSecurity {


    @Bean
    public SecurityFilterChain filteringCriteria(HttpSecurity http) throws Exception {
      /*  http.cors().disable();
        http.csrf().disable();*/
      http.authorizeHttpRequests(authorizeRequests ->authorizeRequests.anyRequest().permitAll());
        return http.build();
    }


}
