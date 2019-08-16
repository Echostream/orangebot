package com.echostream.orangebot.dto.telegram;

import lombok.Data;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.NotNull;

@Data
public class CallbackQueryDto {

    @NotNull
    @ApiModelProperty("Unique identifier for this query")
    private String id;

    @NotNull
    @ApiModelProperty("Sender")
    private UserDto from;

    @ApiModelProperty("Optional. Message with the callback button that originated the query. Note that message content and message date will not be available if the message is too old")
    private MessageDto message;

    @ApiModelProperty("Optional. Identifier of the message sent via the bot in inline mode, that originated the query.")
    private String inlineMessageId;

    @NotNull
    @ApiModelProperty("Global identifier, uniquely corresponding to the chat to which the message with the callback button was sent. Useful for high scores in games.")
    private String chatInstance;

    @ApiModelProperty("Optional. Data associated with the callback button. Be aware that a bad client can send arbitrary data in this field.")
    private String data;

    @ApiModelProperty("Optional. Short name of a Game to be returned, serves as the unique identifier for the game")
    private String gameShortName;

}
