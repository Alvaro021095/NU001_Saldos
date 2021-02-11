package co.com.colombia.api.model.movement.response;

import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.util.List;

@Data
@RequiredArgsConstructor
public class ResponseMovements {
    private Metadata meta;
    private List<DataResponseMovement> data;
    private Status status;

}
