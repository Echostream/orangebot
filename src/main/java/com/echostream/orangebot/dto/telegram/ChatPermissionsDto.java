package com.echostream.orangebot.dto.telegram;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class ChatPermissionsDto {

    @ApiModelProperty("True, if the user is allowed to send text messages, contacts, locations and venues")
    private Boolean canSendMessages;

    @ApiModelProperty("True, if the user is allowed to send audios, documents, photos, videos, video notes and voice notes, implies can_send_messages")
    private Boolean canSendMediaMessages;

    @ApiModelProperty("True, if the user is allowed to send polls, implies can_send_messages")
    private Boolean canSendPolls;

    @ApiModelProperty("True, if the user is allowed to send animations, games, stickers and use inline bots, implies can_send_media_messages")
    private Boolean canSendOtherMessages;

    @ApiModelProperty("True, if the user is allowed to add web page previews to their messages, implies can_send_media_messages")
    private Boolean canAddWebPagePreviews;

    @ApiModelProperty("True, if the user is allowed to change the chat title, photo and other settings. Ignored in public supergroups")
    private Boolean canChangeInfo;

    @ApiModelProperty("True, if the user is allowed to invite new users to the chat")
    private Boolean canInviteUsers;

    @ApiModelProperty("True, if the user is allowed to pin messages. Ignored in public supergroups")
    private Boolean canPinMessages;

}
