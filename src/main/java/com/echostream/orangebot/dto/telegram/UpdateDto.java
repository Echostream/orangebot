package com.echostream.orangebot.dto.telegram;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import javax.validation.constraints.NotNull;

@Data
public class UpdateDto {
    @NotNull
    @ApiModelProperty("The update‘s unique identifier.")
    private Integer updateId;

    @ApiModelProperty("New incoming messageDto of any kind — text, photo, sticker, etc.")
    private MessageDto message;

    @ApiModelProperty("New version of a messageDto that is known to the bot and was edited")
    private MessageDto editedMessageDto;

    @ApiModelProperty("New incoming channel post of any kind — text, photo, sticker, etc.")
    private MessageDto channelPost;

    @ApiModelProperty("New version of a channel post that is known to the bot and was edited")
    private MessageDto editedChannelPost;

    @ApiModelProperty("New incoming inline query")
    private InlineQueryDto inlineQuery;

    @ApiModelProperty("The result of an inline query that was chosen by a user and sent to their chat partner.")
    private ChosenInlineResultDto chosenInlineResult;

    @ApiModelProperty("New incoming callback query")
    private CallbackQueryDto callbackQuery;

    @ApiModelProperty("New incoming shipping query. Only for invoices with flexible price")
    private ShippingQueryDto shippingQuery;

    @ApiModelProperty("New incoming pre-checkout query. Contains full information about checkout")
    private PreCheckoutQueryDto preCheckoutQuery;

    @ApiModelProperty("New poll state. Bots receive only updates about stopped polls and polls, which are sent by the bot")
    private PollDto poll;
}
