package co.com.colombia.api.model.balance.response;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class ResponseAccount {

    private DataBalanceResponse data;
    private Status status;

}
