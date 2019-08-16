package com.echostream.orangebot.dto.telegram;

import lombok.Data;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.NotNull;

@Data
public class PassportFileDto {

    @NotNull
    @ApiModelProperty("Identifier for this file")
    private String fileId;

    @NotNull
    @ApiModelProperty("File size")
    private Integer fileSize;

    @NotNull
    @ApiModelProperty("Unix time when the file was uploaded")
    private Integer fileDate;

}
