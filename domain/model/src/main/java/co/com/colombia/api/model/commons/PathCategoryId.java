package co.com.colombia.api.model.commons;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

@Data
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
public class PathCategoryId{

    @NotBlank(message = Constant.MESSAGE_PATH_MOVEMENT_ID_REQUIRED)
    @Pattern(regexp = RegularExpression.ALPHANUMERIC, message = Constant.MESSAGE_PATH_MOVEMENT_ID_ALPHANUMERIC)
    private String categoryId;

    private ErrorHeader errorHeader;


}
