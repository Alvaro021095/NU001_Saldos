package co.com.colombia.api.model.movement.response;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class RelatedTransferAccountResponse {
    private String type;
    private String number;
}
