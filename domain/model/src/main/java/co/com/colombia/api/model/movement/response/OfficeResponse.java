package co.com.colombia.api.model.movement.response;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class OfficeResponse {
    private String code;
    private String name;
}
