package com.echostream.orangebot.dto.telegram;

import lombok.Data;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.NotNull;

@Data
public class PreCheckoutQueryDto {

    @NotNull
    @ApiModelProperty("Unique query identifier")
    private String id;

    @NotNull
    @ApiModelProperty("User who sent the query")
    private UserDto from;

    @NotNull
    @ApiModelProperty("Three-letter ISO 4217 currency code")
    private String currency;

    @NotNull
    @ApiModelProperty("Total price in the smallest units of the currency (integer, not float/double). For example, for a price of US$ 1.45 pass amount = 145. See the exp parameter in currencies.json, it shows the number of digits past the decimal point for each currency (2 for the majority of currencies).")
    private Integer totalAmount;

    @NotNull
    @ApiModelProperty("Bot specified invoice payload")
    private String invoicePayload;

    @ApiModelProperty("Optional. Identifier of the shipping option chosen by the user")
    private String shippingOptionId;

    @ApiModelProperty("Optional. Order info provided by the user")
    private OrderInfoDto orderInfo;

}
