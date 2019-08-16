package com.echostream.orangebot.dto.telegram;

import lombok.Data;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.NotNull;

@Data
public class StickerDto {

    @NotNull
    @ApiModelProperty("Identifier for this file")
    private String fileId;

    @NotNull
    @ApiModelProperty("Sticker width")
    private Integer width;

    @NotNull
    @ApiModelProperty("Sticker height")
    private Integer height;

    @NotNull
    @ApiModelProperty("True, if the sticker is animated")
    private Boolean isAnimated;

    @ApiModelProperty("Sticker thumbnail in the .webp or .jpg format")
    private PhotoSizeDto thumb;

    @ApiModelProperty("Emoji associated with the sticker")
    private String emoji;

    @ApiModelProperty("Name of the sticker set to which the sticker belongs")
    private String setName;

    @ApiModelProperty("For mask stickers, the position where the mask should be placed")
    private MaskPositionDto maskPosition;

    @ApiModelProperty("File size")
    private Integer fileSize;

}
