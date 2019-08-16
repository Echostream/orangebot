package com.echostream.orangebot.dto.telegram;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;
import java.util.List;

@Data
public class GameDto {

    @NotNull
    @ApiModelProperty("Title of the game")
    private String title;

    @NotNull
    @ApiModelProperty("Description of the game")
    private String description;

    @NotNull
    @ApiModelProperty("Photo that will be displayed in the game message in chats.")
    private List<PhotoSizeDto> photo;

    @ApiModelProperty("Brief description of the game or high scores included in the game message. Can be automatically edited to include current high scores for the game when the bot calls setGameScore, or manually edited using editMessageText. 0-4096 characters.")
    private String text;

    @ApiModelProperty("Special entities that appear in text, such as usernames, URLs, bot commands, etc.")
    private List<MessageEntityDto> textEntities;

    @ApiModelProperty("Animation that will be displayed in the game message in chats. Upload via BotFather")
    private AnimationDto animation;

}
