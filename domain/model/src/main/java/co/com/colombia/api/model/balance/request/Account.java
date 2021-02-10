package co.com.colombia.api.model.balance.request;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class Account {

    private String type;
    private String number;

}
