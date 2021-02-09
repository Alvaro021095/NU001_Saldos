package co.com.colombia.api.model.prueba.gateway;

import co.com.colombia.api.model.prueba.PruebaResponse;
import reactor.core.publisher.Mono;

public interface PruebaGateway {

    Mono<PruebaResponse> getTest();

}
