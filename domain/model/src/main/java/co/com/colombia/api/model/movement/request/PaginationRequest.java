package co.com.colombia.api.model.movement.request;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class PaginationRequest {
    private int size;
    private int key;
}
