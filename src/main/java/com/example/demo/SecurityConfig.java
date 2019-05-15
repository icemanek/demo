package com.example.demo;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.reactive.EnableWebFluxSecurity;
import org.springframework.security.config.web.server.ServerHttpSecurity;
import org.springframework.security.core.userdetails.MapReactiveUserDetailsService;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.web.server.SecurityWebFilterChain;

@Configuration
@EnableWebFluxSecurity
public class SecurityConfig {

    @Bean
    public MapReactiveUserDetailsService user() {

        UserDetails userDetails = User.withDefaultPasswordEncoder()
                .username("emil")
                .password("1234")
                .roles("user")
                .username("admin")
                .password("admin")
                .roles("admin")
                .build();

        return new MapReactiveUserDetailsService(userDetails);
    }

    @Bean
    public SecurityWebFilterChain springSecurity(ServerHttpSecurity http) {

        http
                .authorizeExchange()
                .pathMatchers("/").permitAll()
                .pathMatchers("/admin").hasRole("admin")
                .anyExchange().authenticated()
                .and()
                .httpBasic().and()
                .formLogin();

        return http.build();
    }


}
