package com.echostream.orangebot.dto.telegram;

import lombok.Data;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.NotNull;

@Data
public class ChosenInlineResultDto {

    @NotNull
    @ApiModelProperty("The unique identifier for the result that was chosen")
    private String resultId;

    @NotNull
    @ApiModelProperty("The user that chose the result")
    private UserDto from;

    @ApiModelProperty("Optional. Sender location, only for bots that require user location")
    private LocationDto location;

    @ApiModelProperty("Optional. Identifier of the sent inline message. Available only if there is an inline keyboard attached to the message. Will be also received in callback queries and can be used to edit the message.")
    private String inlineMessageId;

    @NotNull
    @ApiModelProperty("The query that was used to obtain the result")
    private String query;

}
