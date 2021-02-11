package co.com.colombia.api.model.movement.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
@AllArgsConstructor
@Builder(toBuilder = true)
public class DataMovement {
    private AccountMovementRequest account;
    private TransactionRequest transaction;
    private OfficeRequest office;
    private PaginationRequest pagination;
}
