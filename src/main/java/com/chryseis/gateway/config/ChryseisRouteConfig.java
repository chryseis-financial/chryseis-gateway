package com.chryseis.gateway.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by IntelliJ IDEA
 * User: Balaji Varadharajan
 * Class/Interface/Enum Name: ChryseisRouteConfig
 * Inside the package - com.chryseis.gateway.config
 * Created Date: 5/20/2020
 * Created Time: 5:17 PM
 **/
@Configuration
public class ChryseisRouteConfig {

    @Bean
    public RouteLocator chryseisRoutes(RouteLocatorBuilder builder){
        return builder.routes()
                .route( r -> r.path("/investors/*","/investors*")
                        .uri("http://localhost:8080"))
                .build();
    }
}
