package com.echostream.orangebot.dto.telegram;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;

@Data
public class AnimationDto {

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

    @ApiModelProperty("Animation thumbnail as defined by sender")
    private PhotoSizeDto thumb;

    @ApiModelProperty("Original animation filename as defined by sender")
    private String fileName;

    @ApiModelProperty("MIME type of the file as defined by sender")
    private String mimeType;

    @ApiModelProperty("File size")
    private Integer fileSize;
}
