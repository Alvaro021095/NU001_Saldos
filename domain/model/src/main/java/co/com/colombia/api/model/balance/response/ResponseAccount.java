package co.com.colombia.api.model.balance.response;

import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.util.List;

@Data
@RequiredArgsConstructor
public class ResponseAccount {
    private List<DataResponseBalance> data;
    private Status status;
}
