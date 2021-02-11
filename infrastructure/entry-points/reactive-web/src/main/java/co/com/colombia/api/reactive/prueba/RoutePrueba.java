package co.com.colombia.api.reactive.prueba;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.ServerResponse;

import static org.springframework.http.MediaType.APPLICATION_JSON;
import static org.springframework.web.reactive.function.server.RequestPredicates.*;
import static org.springframework.web.reactive.function.server.RouterFunctions.route;

@Configuration
public class RoutePrueba {

    //@Value("${rou.prueba:/prueba}")
    private String routePrueba;

    @Bean
    public RouterFunction<ServerResponse> routesPrueba(HandlerPrueba handler){
        return  route(
                POST("/test")
                        .and(accept(APPLICATION_JSON))
                        .and(contentType(APPLICATION_JSON)), handler::getTest)
                .andRoute(GET("routePrueba")
                        .and(accept(APPLICATION_JSON))
                        .and(contentType(APPLICATION_JSON)), handler::getTest);

    }


}

