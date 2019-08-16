package com.echostream.orangebot.dto.telegram;

import lombok.Data;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.NotNull;

@Data
public class ShippingAddressDto {

    @NotNull
    @ApiModelProperty("ISO 3166-1 alpha-2 country code")
    private String countryCode;

    @NotNull
    @ApiModelProperty("State, if applicable")
    private String state;

    @NotNull
    @ApiModelProperty("City")
    private String city;

    @NotNull
    @ApiModelProperty("First line for the address")
    private String streetLine1;

    @NotNull
    @ApiModelProperty("Second line for the address")
    private String streetLine2;

    @NotNull
    @ApiModelProperty("Address post code")
    private String postCode;

}
