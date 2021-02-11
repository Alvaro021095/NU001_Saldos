package co.com.colombia.api.model.balance.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
@AllArgsConstructor
@Builder(toBuilder = true)

public class AccountBalanceRequest {
    private String type;
    private String number;
}
