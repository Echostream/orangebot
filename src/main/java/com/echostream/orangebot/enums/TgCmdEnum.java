package com.echostream.orangebot.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum TgCmdEnum {
    /**
     * telegram bot 支持的命令列表
     */
    CLOCK("/clock"),
    SCHEDULER("/sched");

    private String name;

}
