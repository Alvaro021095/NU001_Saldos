package co.com.colombia.api.model.balance.response;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class Balance {

    private String code;
    private String accountingDate;
    private String description;
    private int amount;
    private String type;
    private String reference1;
    private String reference2;
    private String reference3;
    private String checkNumber;

}
