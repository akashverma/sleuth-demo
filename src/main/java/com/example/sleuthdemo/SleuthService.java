package com.example.sleuthdemo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class SleuthService {

    private final static Logger logger = LoggerFactory.getLogger(SleuthService.class);

    public void doSomeWorkSameSpan() throws InterruptedException {
        Thread.sleep(1000L);
        logger.info("Doing some work");
    }
}