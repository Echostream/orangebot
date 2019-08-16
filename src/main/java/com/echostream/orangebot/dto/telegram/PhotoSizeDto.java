package com.echostream.orangebot.dto.telegram;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import javax.validation.constraints.NotNull;

@Data
public class PhotoSizeDto {

    @NotNull
    @ApiModelProperty("Identifier for this file")
    private String fileId;

    @NotNull
    @ApiModelProperty("Photo width")
    private Integer width;

    @NotNull
    @ApiModelProperty("Photo height")
    private Integer height;

    @ApiModelProperty("File size")
    private Integer fileSize;
}
