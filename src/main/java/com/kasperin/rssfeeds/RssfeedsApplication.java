package com.kasperin.rssfeeds;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@SpringBootApplication
public class RssfeedsApplication {

    public static void main(String[] args) {
        SpringApplication.run(RssfeedsApplication.class, args);
    }

}
