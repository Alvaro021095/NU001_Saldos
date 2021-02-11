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
public class HeaderDate extends Header{

    @NotBlank(message = Constant.MESSAGE_INITIAL_DT_NOT_BLANK)
    @Pattern(regexp = RegularExpression.FORMAT_DT, message = Constant.MESSAGE_INITIAL_DT_FORMAT_REQUIRED)
    @Pattern(regexp = RegularExpression.RANGE_DT, message = Constant.MESSAGE_INITIAL_DT_RANGE_REQUIRED)
    @HeaderName(Constant.INITIAL_DT)
    public String initialDt;

    @NotBlank(message = Constant.MESSAGE_FINAL_DT_NOT_BLANK)
    @Pattern(regexp = RegularExpression.FORMAT_DT, message = Constant.MESSAGE_FINAL_DT_FORMAT_REQUIRED)
    @Pattern(regexp = RegularExpression.RANGE_DT, message = Constant.MESSAGE_FINAL_DT_RANGE_REQUIRED)
    @HeaderName(Constant.FINAL_DT)
    public String finalDt;

    @HeaderName(Constant.PAGE_AFTER)
    public String pageAfter;


    @HeaderName(Constant.PAGE_SIZE)
    public String pageSize;




}
