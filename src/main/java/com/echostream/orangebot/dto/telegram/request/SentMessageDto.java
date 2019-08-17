package com.echostream.orangebot.dto.telegram.request;
import com.echostream.orangebot.dto.telegram.InlineKeyboardMarkupDto;
import lombok.Data;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.constraints.NotNull;

@Data
public class SentMessageDto {

    @NotNull
    @ApiModelProperty("Integer or String .Unique identifier for the target chat or username of the target channel (in the format @channelusername)")
    private Integer chatId	;

    @NotNull
    @ApiModelProperty("Text of the message to be sent")
    private String	text	;

    @ApiModelProperty("Send Markdown or HTML, if you want Telegram apps to show bold, italic, fixed-width text or inline URLs in your bot's message.")
    private String	parseMode	;

    @ApiModelProperty("Disables link previews for links in this message")
    private Boolean	disableWebPagePreview	;

    @ApiModelProperty("Sends the message silently. Users will receive a notification with no sound.")
    private Boolean	disableNotification	;

    @ApiModelProperty("If the message is a reply, ID of the original message")
    private Integer	replyToMessageId	;

    @ApiModelProperty("InlineKeyboardMarkupDto or ReplyKeyboardMarkup or ReplyKeyboardRemove or ForceReply	Additional interface options. A JSON-serialized object for an inline keyboard, custom reply keyboard, instructions to remove reply keyboard or to force a reply from the user.")
    private InlineKeyboardMarkupDto replyMarkup	;

}
