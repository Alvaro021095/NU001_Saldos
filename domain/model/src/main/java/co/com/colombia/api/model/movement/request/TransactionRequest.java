package co.com.colombia.api.model.movement.request;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class TransactionRequest {
    private String startDate;
    private String endDate;
    private float minAmount;
    private float maxAmount;
    private String type;
    private String checkNumber;
    private String group;
    private String description;
}
