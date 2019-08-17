package com.echostream.orangebot.dto.telegram;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.springframework.util.StringUtils;

import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Optional;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Data
public class MessageDto {

    @NotNull
    @ApiModelProperty("Unique message identifier inside this chat")
    private Integer messageId;

    @ApiModelProperty("Sender, empty for messages sent to channels")
    private UserDto from;

    @NotNull
    @ApiModelProperty("Date the message was sent in Unix time")
    private Integer date;

    @NotNull
    @ApiModelProperty("Conversation the message belongs to")
    private ChatDto chat;

    @ApiModelProperty("For forwarded messages, sender of the original message")
    private UserDto forwardFrom;

    @ApiModelProperty("For messages forwarded from channels, information about the original channel")
    private ChatDto forwardFromChat;


    @ApiModelProperty("For messages forwarded from channels, identifier of the original message in the channel")
    private Integer forwardFromMessageId;

    @ApiModelProperty("For messages forwarded from channels, signature of the post author if present")
    private String forwardSignature;

    @ApiModelProperty("Sender's name for messages forwarded from users who disallow adding a link to their account in forwarded messages")
    private String forwardSenderName;

    @ApiModelProperty("For forwarded messages, date the original message was sent in Unix time")
    private Integer forwardDate;

    @ApiModelProperty("For replies, the original message. Note that the Message object in this field will not contain further reply_to_message fields even if it itself is a reply.")
    private MessageDto replyToMessage;

    @ApiModelProperty("Date the message was last edited in Unix time")
    private Integer editDate;

    @ApiModelProperty("The unique identifier of a media message group this message belongs to")
    private String mediaGroupId;

    @ApiModelProperty("Signature of the post author for messages in channels")
    private String authorSignature;

    @ApiModelProperty("For text messages, the actual UTF-8 text of the message, 0-4096 characters.")
    private String text;

    @ApiModelProperty("For text messages, special entities like usernames, URLs, bot commands, etc. that appear in the text")
    private List<MessageEntityDto> entities;

    @ApiModelProperty("For messages with a caption, special entities like usernames, URLs, bot commands, etc. that appear in the caption")
    private List<MessageEntityDto> captionEntities;

    @ApiModelProperty("Message is an audio file, information about the file")
    private AudioDto audio;

    @ApiModelProperty("Message is a general file, information about the file")
    private DocumentDto document;

    @ApiModelProperty("Message is an animation, information about the animation. For backward compatibility, when this field is set, the document field will also be set")
    private AnimationDto animation;

    @ApiModelProperty("Message is a game, information about the game.")
    private GameDto game;

    @ApiModelProperty("Message is a photo, available sizes of the photo")
    private List<PhotoSizeDto> photo;

    @ApiModelProperty("Message is a sticker, information about the sticker")
    private StickerDto sticker;

    @ApiModelProperty("Message is a video, information about the video")
    private VideoDto video;

    @ApiModelProperty("Message is a voice message, information about the file")
    private VoiceDto voice;

    @ApiModelProperty("Message is a video note, information about the video message")
    private VideoNoteDto videoNote;

    @ApiModelProperty("Caption for the animation, audio, document, photo, video or voice, 0-1024 characters")
    private String caption;

    @ApiModelProperty("Message is a shared contact, information about the contact")
    private ContactDto contact;

    @ApiModelProperty("Message is a shared location, information about the location")
    private LocationDto location;

    @ApiModelProperty("Message is a venue, information about the venue")
    private VenueDto venue;

    @ApiModelProperty("Message is a native poll, information about the poll")
    private PollDto poll;

    @ApiModelProperty("New members that were added to the group or supergroup and information about them (the bot itself may be one of these members)")
    private List<UserDto> newChatMembers;

    @ApiModelProperty("A member was removed from the group, information about them (this member may be the bot itself)")
    private UserDto leftChatMember;

    @ApiModelProperty("A chat title was changed to this value")
    private String newChatTitle;

    @ApiModelProperty("A chat photo was change to this value")
    private List<PhotoSizeDto> newChatPhoto;

    @ApiModelProperty("Service message: the chat photo was deleted")
    private Boolean deleteChatPhoto;

    @ApiModelProperty("Service message: the group has been created")
    private Boolean groupChatCreated;

    @ApiModelProperty("Service message: the supergroup has been created. This field can‘t be received in a message coming through updates, because bot can’t be a member of a supergroup when it is created. It can only be found in reply_to_message if someone replies to a very first message in a directly created supergroup.")
    private Boolean supergroupChatCreated;

    @ApiModelProperty("Service message: the channel has been created. This field can‘t be received in a message coming through updates, because bot can’t be a member of a channel when it is created. It can only be found in reply_to_message if someone replies to a very first message in a channel.")
    private Boolean channelChatCreated;

    @ApiModelProperty("The group has been migrated to a supergroup with the specified identifier. This number may be greater than 32 bits and some programming languages may have difficulty/silent defects in interpreting it. But it is smaller than 52 bits, so a signed 64 bit integer or double-precision float type are safe for storing this identifier.")
    private Integer migrateToChatId;

    @ApiModelProperty("The supergroup has been migrated from a group with the specified identifier. This number may be greater than 32 bits and some programming languages may have difficulty/silent defects in interpreting it. But it is smaller than 52 bits, so a signed 64 bit integer or double-precision float type are safe for storing this identifier.")
    private Integer migrateFromChatId;

    @ApiModelProperty("Specified message was pinned. Note that the Message object in this field will not contain further reply_to_message fields even if it is itself a reply.")
    private MessageDto pinnedMessageDto;

    @ApiModelProperty("Message is an invoice for a payment, information about the invoice.")
    private InvoiceDto invoice;

    @ApiModelProperty("Message is a service message about a successful payment, information about the payment.")
    private SuccessfulPaymentDto successfulPayment;

    @ApiModelProperty("The domain name of the website on which the user has logged in.")
    private String connectedWebsite;

    @ApiModelProperty("Telegram Passport data")
    private PassportDataDto passportData;

    @ApiModelProperty("Inline keyboard attached to the message. login_url buttons are represented as ordinary url buttons.")
    private InlineKeyboardMarkupDto replyMarkup;

    public Optional<Command> extractCommand() {
        if (StringUtils.isEmpty(text)) {
            return Optional.empty();
        }
        Command command = new Command(text);
        if (StringUtils.isEmpty(command.getCommand()) || command.getCommand().length() == 1){
            return Optional.empty();
        }
        return Optional.of(command);
    }

    @Data
    public static class Command {
        private final static Pattern commandPattern = Pattern.compile("^(/[a-z0-9_]*)?(@[a-z0-9_]+)?(.*)$");

        private String command;
        private String commandOwner;
        private String commandParams;

        public Command(){}

        public Command(String text){
            Matcher cmdMatcher = commandPattern.matcher(text);
            if (cmdMatcher.find()) {
                this.command = cmdMatcher.group(1);
                this.commandOwner = cmdMatcher.group(2);
                this.commandParams = cmdMatcher.group(3);
            }
        }
    }

}
