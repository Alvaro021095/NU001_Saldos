package co.com.colombia.api.model.movement.gateway;
import co.com.colombia.api.model.commons.Header;
import co.com.colombia.api.model.movement.request.RequestMovements;
import co.com.colombia.api.model.movement.response.ResponseMovements;
import reactor.core.publisher.Mono;

public interface MovementGateway {

    Mono<ResponseMovements> movements(RequestMovements requestMovements, Header header);

}
