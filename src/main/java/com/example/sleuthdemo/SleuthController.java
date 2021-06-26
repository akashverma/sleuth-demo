package com.example.sleuthdemo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SleuthController {

    private static Logger logger = LoggerFactory.getLogger(SleuthDemoApplication.class);

    @Autowired
    private SleuthService sleuthService;

    @GetMapping("/")
    public String helloSleuth() {
        logger.info("Hello Sleuth");
        return "success";
    }

    /**
     *
     * Take note that the trace and span ids are the same between the two logs even though the messages originate from two different classes.
     * This makes it trivial to identify each log during a request by searching for the traceId of that request.
     *
     *
     * 2021-06-26 14:11:15.250  INFO [Baeldung Sleuth Tutorial,5fa5227bba1954c5,5fa5227bba1954c5] 52897 --- [nio-8080-exec-1] c.e.sleuthdemo.SleuthDemoApplication     : Same Span
     * 2021-06-26 14:11:16.253  INFO [Baeldung Sleuth Tutorial,5fa5227bba1954c5,5fa5227bba1954c5] 52897 --- [nio-8080-exec-1] com.example.sleuthdemo.SleuthService     : Doing some work
     *
     * @return
     * @throws InterruptedException
     */
    @GetMapping("/same-span")
    public String helloSleuthSameSpan() throws InterruptedException {
        logger.info("Same Span");
        sleuthService.doSomeWorkSameSpan();
        return "success";
    }


}
