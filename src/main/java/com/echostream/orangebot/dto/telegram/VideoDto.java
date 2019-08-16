package com.echostream.orangebot.dto.telegram;

import lombok.Data;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.NotNull;

@Data
public class VideoDto {

    @NotNull
    @ApiModelProperty("Identifier for this file")
    private String fileId;

    @NotNull
    @ApiModelProperty("Video width as defined by sender")
    private Integer width;

    @NotNull
    @ApiModelProperty("Video height as defined by sender")
    private Integer height;

    @NotNull
    @ApiModelProperty("Duration of the video in seconds as defined by sender")
    private Integer duration;

    @ApiModelProperty("Video thumbnail")
    private PhotoSizeDto thumb;

    @ApiModelProperty("Mime type of a file as defined by sender")
    private String mimeType;

    @ApiModelProperty("File size")
    private Integer fileSize;

}
