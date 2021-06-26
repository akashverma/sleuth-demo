package com.example.sleuthdemo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * - adds unique ids to each web request that enters our application.
 * - added support for sharing these ids across thread boundaries
 *
 * - <p>Traces</p>
 * can be thought of like a single request or job that is triggered in an application
 * All the various steps in that request, even across application and thread boundaries, will have the same traceId.
 *
 *
 * - <p>Spans</p>
 * Spans, on the other hand, can be thought of as sections of a job or request.
 * A single trace can be composed of multiple spans each correlating to a specific step or section of the request.
 * Using trace and span ids we can pinpoint exactly when and where our application is as it processes a request.
 * Making reading our logs much easier.
 */
@RestController
@SpringBootApplication
public class SleuthDemoApplication {
	private static Logger log = LoggerFactory.getLogger(SleuthDemoApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(SleuthDemoApplication.class, args);
	}



}
