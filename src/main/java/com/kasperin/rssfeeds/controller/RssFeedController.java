package com.kasperin.rssfeeds.controller;

import com.kasperin.rssfeeds.Repository.ChannelRepository;
import com.kasperin.rssfeeds.model.Channel;
import com.kasperin.rssfeeds.model.FeedEntry;
import com.kasperin.rssfeeds.services.FeedEntryService;
import com.kasperin.rssfeeds.services.RssGeneratorService;
import com.kasperin.rssfeeds.services.RssUtils;
import com.rometools.rome.feed.synd.SyndFeed;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
public class RssFeedController {

    //private final WebScraperService webScraperService;
    private final ChannelRepository channelRepository;
    private final FeedEntryService feedEntryService;
    private final RssUtils rssUtils;

   // private final RssGeneratorService rssGeneratorService;

    @GetMapping("/rss")
    @ResponseBody
    public Channel generateRssFeed() {
//        return rssGeneratorService.generateRssFeed();
        return rssUtils.parseFeeds();
    }
}
