package com.echostream.orangebot.dto.telegram;

import lombok.Data;
import io.swagger.annotations.ApiModelProperty;

@Data
public class OrderInfoDto {

    @ApiModelProperty("User name")
    private String name;

    @ApiModelProperty("User's phone number")
    private String phoneNumber;

    @ApiModelProperty("User email")
    private String email;

    @ApiModelProperty("User shipping address")
    private ShippingAddressDto shippingAddress;

}
