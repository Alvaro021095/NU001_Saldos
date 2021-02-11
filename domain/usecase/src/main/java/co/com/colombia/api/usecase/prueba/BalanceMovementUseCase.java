package co.com.colombia.api.usecase.prueba;

import co.com.colombia.api.model.balance.gateway.BalanceGateway;
import co.com.colombia.api.model.balance.request.RequestAccount;
import co.com.colombia.api.model.commons.Header;
import co.com.colombia.api.model.movement.gateway.MovementGateway;
import co.com.colombia.api.model.movement.request.RequestMovements;
import co.com.colombia.api.model.movement.response.ResponseMovements;
import reactor.core.publisher.Mono;

public class BalanceMovementUseCase {

    private BalanceGateway balanceGateway;
    private MovementGateway movementGateway;

    public BalanceMovementUseCase(BalanceGateway balanceGateway, MovementGateway movementGateway){
        this.balanceGateway = balanceGateway;
        this.movementGateway = movementGateway;
    }

    public Mono<ResponseMovements> getBalanceAndMovement(RequestAccount requestAccount, Header header){

        return balanceGateway
                .balance(header, requestAccount)
                .flatMap(responseAccount -> {
                    RequestMovements requestMovements = RequestMovements
                            .builder()
                            .data(null)
                            .build();
                    return movementGateway.movements(requestMovements, header);
                });

    }


}

