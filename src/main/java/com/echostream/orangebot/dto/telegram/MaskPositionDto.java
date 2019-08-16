package com.echostream.orangebot.dto.telegram;

import lombok.Data;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.NotNull;

@Data
public class MaskPositionDto {

    @NotNull
    @ApiModelProperty("The part of the face relative to which the mask should be placed. One of “forehead”, “eyes”, “mouth”, or “chin”.")
    private String point;

    @NotNull
    @ApiModelProperty("number	Shift by X-axis measured in widths of the mask scaled to the face size, from left to right. For example, choosing -1.0 will place mask just to the left of the default mask position.")
    private Float xShift;

    @NotNull
    @ApiModelProperty("number	Shift by Y-axis measured in heights of the mask scaled to the face size, from top to bottom. For example, 1.0 will place the mask just below the default mask position.")
    private Float yShift;

    @NotNull
    @ApiModelProperty("number	Mask scaling coefficient. For example, 2.0 means double size.")
    private Float scale;

}
