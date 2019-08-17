package com.echostream.orangebot.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum TgCmdEnum {
    /**
     * telegram bot 支持的命令列表
     */
    UNKNOWN(""),
    CLOCK("/clock"),
    SCHEDULER("/sched");

    private String command;

    public static TgCmdEnum fromCommand(String command){
        for (TgCmdEnum value : TgCmdEnum.values()) {
            if (value.getCommand().equals(command)){
                return value;
            }
        }
        return UNKNOWN;
    }

}
