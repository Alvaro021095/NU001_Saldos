package co.com.colombia.api.drivenadapter.movement;

import co.com.colombia.api.model.balance.request.RequestAccount;
import co.com.colombia.api.model.balance.response.ResponseAccount;
import co.com.colombia.api.model.commons.Header;
import co.com.colombia.api.model.movement.gateway.MovementGateway;
import co.com.colombia.api.model.movement.request.RequestMovements;
import co.com.colombia.api.model.movement.response.ResponseMovements;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

@Component
public class MovementRest implements MovementGateway {

    @Autowired
    private WebClient webClient;

    @Override
    public Mono<ResponseMovements> movements(RequestMovements requestMovements, Header header) {

        Mono<ResponseMovements> response = webClient
                .post()
                .uri("/movement")
                .body(Mono.just(requestMovements), RequestMovements.class)
                .accept(MediaType.APPLICATION_JSON)
                .retrieve()
                .bodyToMono(ResponseMovements.class);


        return response;

    }
}
