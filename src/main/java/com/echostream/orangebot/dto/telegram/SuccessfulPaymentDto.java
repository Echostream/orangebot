package com.echostream.orangebot.dto.telegram;

import lombok.Data;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.NotNull;

@Data
public class SuccessfulPaymentDto {

    @NotNull
    @ApiModelProperty("Three-letter ISO 4217 currency code")
    private String currency;

    @NotNull
    @ApiModelProperty("Total price in the smallest units of the currency (integer, not float/double).")
    private Integer totalAmount;

    @NotNull
    @ApiModelProperty("Bot specified invoice payload")
    private String invoicePayload;

    @ApiModelProperty("Identifier of the shipping option chosen by the user")
    private String shippingOptionId;

    @ApiModelProperty("Order info provided by the user")
    private OrderInfoDto orderInfo;

    @NotNull
    @ApiModelProperty("Telegram payment identifier")
    private String telegramPaymentChargeId;

    @NotNull
    @ApiModelProperty("Provider payment identifier")
    private String providerPaymentChargeId;
}
