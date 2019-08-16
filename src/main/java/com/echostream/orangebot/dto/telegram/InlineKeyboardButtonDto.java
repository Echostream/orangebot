package com.echostream.orangebot.dto.telegram;

import lombok.Data;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.NotNull;

@Data
public class InlineKeyboardButtonDto {

    @NotNull
    @ApiModelProperty("Label text on the button")
    private String text;

    @ApiModelProperty("HTTP or tg:// url to be opened when button is pressed")
    private String url;

    @ApiModelProperty("An HTTP URL used to automatically authorize the user. Can be used as a replacement for the Telegram Login Widget.")
    private LoginUrlDto loginUrl;

    @ApiModelProperty("Data to be sent in a callback query to the bot when button is pressed, 1-64 bytes")
    private String callbackData;

    @ApiModelProperty("If set, pressing the button will prompt the user to select one of their chats, open that chat and insert the bot‘s username and the specified inline query in the input field. Can be empty, in which case just the bot’s username will be inserted.")
    private String switchInlineQuery;

    @ApiModelProperty("If set, pressing the button will insert the bot‘s username and the specified inline query in the current chat's input field. Can be empty, in which case only the bot’s username will be inserted.")
    private String switchInlineQueryCurrentChat;

    @ApiModelProperty("Description of the game that will be launched when the user presses the button.")
    private CallbackGameDto callbackGame;

    @ApiModelProperty("Specify True, to send a Pay button.")
    private Boolean pay;

}
