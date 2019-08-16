package com.echostream.orangebot.dto.telegram;

import lombok.Data;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.NotNull;

@Data
public class LocationDto {

    @NotNull
    @ApiModelProperty("Longitude as defined by sender")
    private Float longitude;

    @NotNull
    @ApiModelProperty("Latitude as defined by sender")
    private Float latitude;

}
