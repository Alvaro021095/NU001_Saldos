package co.com.colombia.api.model.balance.response;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class AccountResponse {

    private Balance balances;

}
