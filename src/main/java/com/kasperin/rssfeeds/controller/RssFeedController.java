package com.kasperin.rssfeeds.controller;

import com.kasperin.rssfeeds.Repository.ChannelRepository;
import com.kasperin.rssfeeds.Repository.FeedRepository;
import com.kasperin.rssfeeds.model.Feed;
import com.kasperin.rssfeeds.model.FeedEntry;
import com.kasperin.rssfeeds.services.FeedEntryService;
import com.kasperin.rssfeeds.services.RssUtils;
import lombok.AllArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@RequestMapping(RssFeedController.BASE_URL)
public class RssFeedController {

    public static final String BASE_URL = "/api/v1/rss";
    //private final WebScraperService webScraperService;
    private final ChannelRepository channelRepository;
    private final FeedEntryService feedEntryService;
    private final RssUtils rssUtils;
    //private final FeedRepository feedRepository;

   // private final RssGeneratorService rssGeneratorService;

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public Feed generateRssFeed() {
//        return rssGeneratorService.generateRssFeed();
        return rssUtils.parseFeeds();
    }
}
