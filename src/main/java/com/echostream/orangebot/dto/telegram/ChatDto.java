package com.echostream.orangebot.dto.telegram;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import javax.validation.constraints.NotNull;

@Data
public class ChatDto {

    @NotNull
    @ApiModelProperty("Unique identifier for this chat. This number may be greater than 32 bits and some programming languages may have difficulty/silent defects in interpreting it. But it is smaller than 52 bits, so a signed 64 bit integer or double-precision float type are safe for storing this identifier.")
    private Integer id;

    @NotNull
    @ApiModelProperty("Type of chat, can be either “private”, “group”, “supergroup” or “channel”")
    private String type;

    @ApiModelProperty("Title, for supergroups, channels and group chats")
    private String title;

    @ApiModelProperty("Username, for private chats, supergroups and channels if available")
    private String username;

    @ApiModelProperty("First name of the other party in a private chat")
    private String firstName;

    @ApiModelProperty("Last name of the other party in a private chat")
    private String lastName;

    @ApiModelProperty("Chat photo. Returned only in getChat.")
    private ChatPhotoDto photo;

    @ApiModelProperty("Description, for groups, supergroups and channel chats. Returned only in getChat.")
    private String description;

    @ApiModelProperty("Chat invite link, for groups, supergroups and channel chats. Each administrator in a chat generates their own invite links, so the bot must first generate the link using exportChatInviteLink. Returned only in getChat.")
    private String inviteLink;

    @ApiModelProperty("Pinned message, for groups, supergroups and channels. Returned only in getChat.")
    private MessageDto pinnedMessage;

    @ApiModelProperty("Default chat member permissions, for groups and supergroups. Returned only in getChat.")
    private ChatPermissionsDto permissions;

    @ApiModelProperty("For supergroups, name of group sticker set. Returned only in getChat.")
    private String stickerSetName;

    @ApiModelProperty("True, if the bot can change the group sticker set. Returned only in getChat.")
    private Boolean canSetStickerSet;

}
