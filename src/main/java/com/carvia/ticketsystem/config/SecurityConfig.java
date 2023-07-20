package com.carvia.ticketsystem.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

    public static final String[] API_WHITELIST = {
        "/public/**"
    } ;

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception{

        http
                .authorizeHttpRequests(requests -> requests
                        .requestMatchers(API_WHITELIST).permitAll()
//                        .requestMatchers("/private/**").hasRole("RESOURCE_OWNER")
                        .anyRequest().authenticated()
                )
                .csrf(csrf -> csrf.disable());

        return http.build();

    }
}
