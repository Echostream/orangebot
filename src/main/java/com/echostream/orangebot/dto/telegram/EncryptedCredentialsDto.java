package com.echostream.orangebot.dto.telegram;

import lombok.Data;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.NotNull;

@Data
public class EncryptedCredentialsDto {

    @NotNull
    @ApiModelProperty("Base64-encoded encrypted JSON-serialized data with unique user's payload, data hashes and secrets required for EncryptedPassportElement decryption and authentication")
    private String data;

    @NotNull
    @ApiModelProperty("Base64-encoded data hash for data authentication")
    private String hash;

    @NotNull
    @ApiModelProperty("Base64-encoded secret, encrypted with the bot's public RSA key, required for data decryption")
    private String secret;

}
