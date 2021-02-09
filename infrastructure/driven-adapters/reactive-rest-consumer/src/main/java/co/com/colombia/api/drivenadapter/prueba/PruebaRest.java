package co.com.colombia.api.drivenadapter.prueba;

import co.com.colombia.api.model.prueba.PruebaResponse;
import co.com.colombia.api.model.prueba.gateway.PruebaGateway;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

@Component
public class PruebaRest implements PruebaGateway {

    @Autowired
    private WebClient webClient;

    @Value("${uri.prueba}")
    private String uriPrueba;

    public PruebaRest(){ }

    @Override
    public Mono<PruebaResponse> getTest() {
        return webClient
                .get()
                .uri(uriPrueba)
                .retrieve()
                .bodyToMono(PruebaResponse.class);
    }
}
