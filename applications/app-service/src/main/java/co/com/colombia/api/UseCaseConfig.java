package co.com.colombia.api;

import co.com.colombia.api.model.prueba.gateway.PruebaGateway;
import co.com.colombia.api.usecase.prueba.PruebaUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UseCaseConfig {

	@Bean
	public PruebaUseCase balanceUseCase(PruebaGateway pruebaGateway) {
		return new PruebaUseCase(pruebaGateway);
	}


}
