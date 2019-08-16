package com.echostream.orangebot.dto.telegram;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;

@Data
public class AudioDto {

    @NotNull
    @ApiModelProperty("Identifier for this file")
    private String file_id;

    @NotNull
    @ApiModelProperty("Duration of the audio in seconds as defined by sender")
    private Integer duration;

    @ApiModelProperty("Performer of the audio as defined by sender or by audio tags")
    private String performer;

    @ApiModelProperty("Title of the audio as defined by sender or by audio tags")
    private String title;

    @ApiModelProperty("MIME type of the file as defined by sender")
    private String mime_type;

    @ApiModelProperty("File size")
    private Integer file_size;

    @ApiModelProperty("Thumbnail of the album cover to which the music file belongs")
    private PhotoSizeDto thumb;
}
