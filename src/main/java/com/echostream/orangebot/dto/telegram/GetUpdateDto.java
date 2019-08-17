package com.echostream.orangebot.dto.telegram;

import lombok.Data;

import java.util.List;

@Data
public class GetUpdateDto {
    private Integer offset;
    private Integer limit;
    private Integer timeout;
    private List<String> allowedUpdates;
}
