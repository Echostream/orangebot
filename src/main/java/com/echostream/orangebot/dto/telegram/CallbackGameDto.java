package com.echostream.orangebot.dto.telegram;

import lombok.Data;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.NotNull;

@Data
public class CallbackGameDto {

    @NotNull
    @ApiModelProperty("Yes	User identifier")
    private Integer userId;

    @NotNull
    @ApiModelProperty("Yes	New score, must be non-negative")
    private Integer score;

    @ApiModelProperty("Optional	Pass True, if the high score is allowed to decrease. This can be useful when fixing mistakes or banning cheaters")
    private Boolean force;

    @ApiModelProperty("Optional	Pass True, if the game message should not be automatically edited to include the current scoreboard")
    private Boolean disableEditMessage;

    @ApiModelProperty("Optional	Required if inline_message_id is not specified. Unique identifier for the target chat")
    private Integer chatId;

    @ApiModelProperty("Optional	Required if inline_message_id is not specified. Identifier of the sent message")
    private Integer messageId;

    @ApiModelProperty("Optional	Required if chat_id and message_id are not specified. Identifier of the inline message")
    private String inlineMessageId;

}
