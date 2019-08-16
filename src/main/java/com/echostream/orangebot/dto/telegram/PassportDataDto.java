package com.echostream.orangebot.dto.telegram;

import lombok.Data;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.NotNull;
import java.util.List;

@Data
public class PassportDataDto {

    @NotNull
    @ApiModelProperty("Information about documents and other Telegram Passport elements that was shared with the bot")
    private List<EncryptedPassportElementDto> data;

    @NotNull
    @ApiModelProperty("Encrypted credentials required to decrypt the data")
    private EncryptedCredentialsDto credentials;

}
