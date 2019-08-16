package com.echostream.orangebot.dto.telegram;

import lombok.Data;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.NotNull;

@Data
public class VoiceDto {

    @NotNull
    @ApiModelProperty("Identifier for this file")
    private String fileId;

    @NotNull
    @ApiModelProperty("Duration of the audio in seconds as defined by sender")
    private Integer duration;

    @ApiModelProperty("MIME type of the file as defined by sender")
    private String mimeType;

    @ApiModelProperty("File size")
    private Integer fileSize;

}
