package com.echostream.orangebot.dto.telegram;

import lombok.Data;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.NotNull;

@Data
public class VenueDto {

    @NotNull
    @ApiModelProperty("Venue location")
    private LocationDto location;

    @NotNull
    @ApiModelProperty("Name of the venue")
    private String title;

    @NotNull
    @ApiModelProperty("Address of the venue")
    private String address;

    @ApiModelProperty("Foursquare identifier of the venue")
    private String foursquareId;

    @ApiModelProperty("Foursquare type of the venue. (For example, “arts_entertainment/default”, “arts_entertainment/aquarium” or “food/icecream”.)")
    private String foursquareType;

}
