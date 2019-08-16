package com.echostream.orangebot.dto.telegram;

import lombok.Data;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.NotNull;

@Data
public class PollOptionDto {

    @NotNull
    @ApiModelProperty("Option text, 1-100 characters")
    private String text;

    @NotNull
    @ApiModelProperty("Number of users that voted for this option")
    private Integer voterCount;

}
