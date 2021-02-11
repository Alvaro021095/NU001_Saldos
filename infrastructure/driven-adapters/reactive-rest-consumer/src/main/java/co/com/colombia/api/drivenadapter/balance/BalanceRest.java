package co.com.colombia.api.drivenadapter.balance;

import co.com.colombia.api.model.balance.gateway.BalanceGateway;
import co.com.colombia.api.model.balance.request.RequestAccount;
import co.com.colombia.api.model.balance.response.ResponseAccount;
import co.com.colombia.api.model.commons.Header;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

@Component
public class BalanceRest implements BalanceGateway {

    @Autowired
    private WebClient webClient;

    @Override
    public Mono<ResponseAccount> balance(Header header, RequestAccount requestAccount) {

        Mono<ResponseAccount> response = webClient
                .post()
                .uri("/balance")
                .body(Mono.just(requestAccount), RequestAccount.class)
                .accept(MediaType.APPLICATION_JSON)
                .retrieve()
                .bodyToMono(ResponseAccount.class);


        return response;
    }

}
