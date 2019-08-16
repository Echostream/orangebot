package com.echostream.orangebot.dto.telegram;

import lombok.Data;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.NotNull;

@Data
public class ShippingQueryDto {

    @NotNull
    @ApiModelProperty("Unique query identifier")
    private String id;

    @NotNull
    @ApiModelProperty("User who sent the query")
    private UserDto from;

    @NotNull
    @ApiModelProperty("Bot specified invoice payload")
    private String invoicePayload;

    @NotNull
    @ApiModelProperty("User specified shipping address")
    private ShippingAddressDto shippingAddress;

}
