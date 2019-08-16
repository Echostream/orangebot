package com.echostream.orangebot.service.impl;

import com.echostream.orangebot.service.SchedulerSrv;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import java.util.Date;

@Slf4j
@Service
public class SchedulerImpl implements SchedulerSrv {

    @Override
    public void scheduleredMsg(Date trigger, String message) {

    }

}
