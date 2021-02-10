package co.com.colombia.api.model.balance.gateway;

import reactor.core.publisher.Mono;

public interface BalanceGateway {

    Mono<String> balance(String Headers);

}
