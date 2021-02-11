package co.com.colombia.api.reactive.balancemovement;

import co.com.colombia.api.model.balance.request.RequestAccount;
import co.com.colombia.api.model.commons.Header;
import co.com.colombia.api.model.movement.response.ResponseMovements;
import co.com.colombia.api.reactive.util.Util;
import co.com.colombia.api.usecase.prueba.BalanceMovementUseCase;
import lombok.AllArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;

@Component
@AllArgsConstructor
public class HandlerBalanceMovement {

    private BalanceMovementUseCase balanceMovementUseCase;

    public Mono<ServerResponse> getBalanceAndMovement(ServerRequest request) {

        Header headers = Util.buildHeaders(request);

        Mono<ResponseMovements> result = request
                .bodyToMono(RequestAccount.class)
                .flatMap(requestAccount ->
                        balanceMovementUseCase
                                .getBalanceAndMovement(requestAccount,headers));

        return ServerResponse
                .ok()
                .contentType(MediaType.APPLICATION_JSON)
                .body(result, ResponseMovements.class);

    }

}
