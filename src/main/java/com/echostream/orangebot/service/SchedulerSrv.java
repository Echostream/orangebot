package com.echostream.orangebot.service;

import java.util.Date;

public interface SchedulerSrv {

    void clock(Integer chatId);
    void scheduleredMsg(Date trigger, String message);

}
