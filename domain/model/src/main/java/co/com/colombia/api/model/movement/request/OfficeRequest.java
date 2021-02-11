package co.com.colombia.api.model.movement.request;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class OfficeRequest {
    private String code;
    private String name;
}
