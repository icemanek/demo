package com.example.demo;



import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.server.RequestPredicates;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.RouterFunctions;
import org.springframework.web.reactive.function.server.ServerResponse;

@Configuration
public class HelloRouter {




    @Bean
    public RouterFunction<ServerResponse> route(HelloHandler helloHandler) {

        return RouterFunctions
                .route(RequestPredicates.GET("/hello").and(RequestPredicates.accept(MediaType.TEXT_PLAIN)), helloHandler::hello);
    }

    @Bean
    public RouterFunction<ServerResponse> admin(AdminHandler adminHandler){


        return RouterFunctions
        .route(RequestPredicates.GET("/admin").and(RequestPredicates.accept(MediaType.TEXT_PLAIN)), adminHandler::helloAdmin);
    }
}
