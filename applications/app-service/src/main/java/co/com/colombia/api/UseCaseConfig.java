package co.com.colombia.api;

import co.com.colombia.api.model.balance.gateway.BalanceGateway;
import co.com.colombia.api.model.movement.gateway.MovementGateway;
import co.com.colombia.api.usecase.prueba.BalanceMovementUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UseCaseConfig {

	@Bean
	public BalanceMovementUseCase balanceMovementUseCase(BalanceGateway balanceGateway, MovementGateway movementGateway) {
		return new BalanceMovementUseCase(balanceGateway, movementGateway);
	}


}
