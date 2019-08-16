package com.echostream.orangebot.dto.telegram;

import lombok.Data;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.NotNull;

@Data
public class InlineQueryDto {

    @NotNull
    @ApiModelProperty("Unique identifier for this query")
    private String id;

    @NotNull
    @ApiModelProperty("Sender")
    private UserDto from;

    @ApiModelProperty("Optional. Sender location, only for bots that request user location")
    private LocationDto location;

    @NotNull
    @ApiModelProperty("Text of the query (up to 512 characters)")
    private String query;

    @ApiModelProperty("Offset of the results to be returned, can be controlled by the bot")
    private String offset;

}
