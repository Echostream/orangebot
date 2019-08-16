package com.echostream.orangebot.dto.telegram;

import lombok.Data;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.NotNull;

@Data
public class VideoNoteDto {

    @NotNull
    @ApiModelProperty("Identifier for this file")
    private String fileId;

    @NotNull
    @ApiModelProperty("Video width and height (diameter of the video message) as defined by sender")
    private Integer length;

    @NotNull
    @ApiModelProperty("Duration of the video in seconds as defined by sender")
    private Integer duration;

    @ApiModelProperty("Video thumbnail")
    private PhotoSizeDto thumb;

    @ApiModelProperty("File size")
    private Integer fileSize;

}
