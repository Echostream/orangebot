package com.echostream.orangebot.dto.telegram;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class MessageEntityDto {

    @ApiModelProperty("Type of the entity. Can be mention (@username), hashtag, cashtag, bot_command, url, email, phone_number, bold (bold text), italic (italic text), code (monowidth string), pre (monowidth block), text_link (for clickable text URLs), text_mention (for users without usernames)")
    private String type;

    @ApiModelProperty("Offset in UTF-16 code units to the start of the entity")
    private Integer offset;

    @ApiModelProperty("Length of the entity in UTF-16 code units")
    private Integer length;

    @ApiModelProperty("Optional. For “text_link” only, url that will be opened after user taps on the text")
    private String url;

    @ApiModelProperty("Optional. For “text_mention” only, the mentioned user")
    private UserDto user;
}
