package co.com.colombia.api.model.movement.gateway;

import reactor.core.publisher.Mono;

public interface MovementGateway {

    Mono<String> movement(String Headers);

}
