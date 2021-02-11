package co.com.colombia.api.model.movement.response;

import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.util.List;

@Data
@RequiredArgsConstructor
public class DataResponseMovement {
    private OfficeResponse office;
    private RelatedTransferAccountResponse relatedTransferAccount;
    private CustomerResponse customer;
    private List<TransactionResponse> transaction;
}
