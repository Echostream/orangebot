package com.echostream.orangebot.dto.telegram;

import lombok.Data;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.NotNull;

@Data
public class ContactDto {

    @NotNull
    @ApiModelProperty("Contact's phone number")
    private String phoneNumber;

    @NotNull
    @ApiModelProperty("Contact's first name")
    private String firstName;

    @ApiModelProperty("Contact's last name")
    private String lastName;

    @ApiModelProperty("Contact's user identifier in Telegram")
    private Integer userId;

    @ApiModelProperty("Additional data about the contact in the form of a vCard")
    private String vcard;

}
