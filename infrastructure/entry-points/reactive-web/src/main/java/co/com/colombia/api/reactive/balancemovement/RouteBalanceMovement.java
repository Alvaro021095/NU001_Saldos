package co.com.colombia.api.reactive.balancemovement;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.ServerResponse;

import static org.springframework.http.MediaType.APPLICATION_JSON;
import static org.springframework.web.reactive.function.server.RequestPredicates.*;
import static org.springframework.web.reactive.function.server.RouterFunctions.route;

@Configuration
public class RouteBalanceMovement {

    @Bean
    public RouterFunction<ServerResponse> routesBalance(HandlerBalanceMovement handler){
        return  route(
                POST("/balancemovement")
                        .and(accept(APPLICATION_JSON))
                        .and(contentType(APPLICATION_JSON)), handler::getBalanceAndMovement);

    }


}

