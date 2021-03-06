package co.com.colombia.api.model.movement.response;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class Status {
    private String code;
    private String title;
    private String detail;
    private String severity;
}
