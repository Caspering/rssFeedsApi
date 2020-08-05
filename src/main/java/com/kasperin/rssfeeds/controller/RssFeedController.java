package com.kasperin.rssfeeds.controller;

import com.kasperin.rssfeeds.model.Feed;
import com.kasperin.rssfeeds.services.FeedEntryService;
import com.kasperin.rssfeeds.services.FeedService;
import com.kasperin.rssfeeds.services.RssUtils;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping(RssFeedController.BASE_URL)
public class RssFeedController {

    public static final String BASE_URL = "/rss";

    private final FeedService feedService;
    private final RssUtils rssUtils;

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public Feed generateRssFeed() {
        return rssUtils.parseFeeds();
    }

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
    List<Feed> getAll(@RequestParam(value = "title", defaultValue = "") String input) {
        if (!input.isEmpty())  return feedService.findByTitle(input);
        return feedService.findAll();
    }


}
