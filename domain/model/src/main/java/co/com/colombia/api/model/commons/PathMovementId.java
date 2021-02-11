package co.com.colombia.api.model.commons;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import javax.validation.constraints.NotBlank;

@Data
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
public class PathMovementId{

    @NotBlank(message = Constant.MESSAGE_PATH_MOVEMENT_ID_REQUIRED)
    private String movementId;

    private ErrorHeader errorHeader;

}
