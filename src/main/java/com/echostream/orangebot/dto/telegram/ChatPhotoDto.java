package com.echostream.orangebot.dto.telegram;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class ChatPhotoDto {

    @ApiModelProperty("File identifier of small (160x160) chat photo. This file_id can be used only for photo download and only for as long as the photo is not changed.")
    private String	smallFileId	;

    @ApiModelProperty("File identifier of big (640x640) chat photo. This file_id can be used only for photo download and only for as long as the photo is not changed.")
    private String	bigFileId	;

}
