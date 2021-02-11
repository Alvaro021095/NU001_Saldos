package co.com.colombia.api.model.balance.gateway;
import co.com.colombia.api.model.balance.request.RequestAccount;
import co.com.colombia.api.model.balance.response.ResponseAccount;
import co.com.colombia.api.model.commons.Header;
import reactor.core.publisher.Mono;

public interface BalanceGateway {

    Mono<ResponseAccount> balance(Header header, RequestAccount requestAccount);

}
