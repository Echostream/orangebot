package com.echostream.orangebot.dto.telegram;

import lombok.Data;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.NotNull;
import java.util.List;

@Data
public class PollDto {

    @NotNull
    @ApiModelProperty("Unique poll identifier")
    private String id;

    @NotNull
    @ApiModelProperty("Poll question, 1-255 characters")
    private String question;

    @NotNull
    @ApiModelProperty("List of poll options")
    private List<PollOptionDto> options;

    @NotNull
    @ApiModelProperty("True, if the poll is closed")
    private Boolean isClosed;

}
