package com.echostream.orangebot.dto.telegram;

import lombok.Data;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.NotNull;

@Data
public class InvoiceDto {

    @NotNull
    @ApiModelProperty("Product name")
    private String title;

    @NotNull
    @ApiModelProperty("Product description")
    private String description;

    @NotNull
    @ApiModelProperty("Unique bot deep-linking parameter that can be used to generate this invoice")
    private String startParameter;

    @NotNull
    @ApiModelProperty("Three-letter ISO 4217 currency code")
    private String currency;

    @NotNull
    @ApiModelProperty("Total price in the smallest units of the currency (integer, not float/double).")
    private Integer totalAmount;

}
