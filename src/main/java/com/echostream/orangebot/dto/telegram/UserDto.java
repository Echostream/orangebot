package com.echostream.orangebot.dto.telegram;

import io.swagger.annotations.ApiModelProperty;
import javax.validation.constraints.NotNull;

public class UserDto {

    @NotNull
    @ApiModelProperty("identifier for this user or bot")
    private Integer id;

    @NotNull
    @ApiModelProperty("True, if this user is a bot")
    private Boolean isBot;

    @NotNull
    @ApiModelProperty("UserDto‘s or bot’s first name")
    private String firstName;

    @ApiModelProperty("UserDto‘s or bot’s last name")
    private String lastName;

    @ApiModelProperty("UserDto‘s or bot’s username")
    private String username;

    @ApiModelProperty("IETF language tag of the user's language")
    private String languageCode;
}
