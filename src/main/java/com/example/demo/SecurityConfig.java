package com.example.demo;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration
public class SecurityConfig extends WebSecurityConfigurerAdapter {


    @Bean
    public UserDetailsService userDetailsService(){

        UserDetails userDetails = User.withDefaultPasswordEncoder()
                .username("emil")
                .password("1234")
                .roles("user")
                .build();

        return new InMemoryUserDetailsManager(userDetails);
    }


    @Override
    protected void configure(HttpSecurity httpSecurity) throws Exception
    {

        httpSecurity.authorizeRequests()
                .antMatchers("/").hasRole("user")
                .and().formLogin().permitAll();
    }

}
