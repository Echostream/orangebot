package com.echostream.orangebot.dto.telegram;
import lombok.Data;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.constraints.NotNull;
import java.util.List;

@Data
public class InlineKeyboardMarkupDto {

    @NotNull
    @ApiModelProperty("Array of button rows, each represented by an Array of InlineKeyboardButton objects")
    private List<InlineKeyboardButtonDto> inlineKeyboard	;

}
