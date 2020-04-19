package com.sphnews.springcloud.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;

/**
 * @author LuoYi
 * @create 2020-04-19 14:02
 */
//@Configuration
public class GatewayConfig {

    @Bean
    public RouteLocator customerRouteLocator(RouteLocatorBuilder routeLocatorBuilder){
        RouteLocatorBuilder.Builder routes = routeLocatorBuilder.routes();
        routes.route("path_toute_sphnes",
                t -> t.path("/guonei").uri("http://news.baidu.com/guonei")).build();
        return routes.build();
    }
}
