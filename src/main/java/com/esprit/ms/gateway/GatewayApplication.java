package com.esprit.ms.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;


@SpringBootApplication
@EnableDiscoveryClient
public class GatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(GatewayApplication.class, args);
    }
    @Bean
    public RouteLocator getroutesApiGateway(RouteLocatorBuilder builder) {
        return builder.routes().
                route("Commande",r->r.path("/commandes/**")
                        .filters(f -> f.rewritePath("/commandes/(?<segment>.*)", "/Commande/${segment}"))  // Réécriture du chemin
                        .uri("lb://Commande")).build();
}}
