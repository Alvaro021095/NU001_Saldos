package co.com.colombia.api.model.movement.response;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class Metadata {
    private int _responseSize;
    private String _flagMoreRecords;
}
