package com.echostream.orangebot.dto.telegram;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;

@Data
public class DocumentDto {

    @NotNull
    @ApiModelProperty("Identifier for this file")
    private String fileId;

    @ApiModelProperty("Document thumbnail as defined by sender")
    private PhotoSizeDto thumb;

    @ApiModelProperty("Original filename as defined by sender")
    private String fileName;

    @ApiModelProperty("MIME type of the file as defined by sender")
    private String mimeType;

    @ApiModelProperty("File size")
    private Integer fileSize;

}
