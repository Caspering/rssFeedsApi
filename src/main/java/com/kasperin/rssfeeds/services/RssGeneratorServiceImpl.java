//package com.kasperin.rssfeeds.services;
//
//
//import com.kasperin.rssfeeds.model.FeedEntry;
//import com.rometools.rome.feed.synd.SyndContent;
//import com.rometools.rome.feed.synd.SyndEntry;
//import com.rometools.rome.feed.synd.SyndEntryImpl;
//import com.rometools.rome.feed.synd.SyndFeed;
//import com.rometools.rome.io.SyndFeedOutput;
//import lombok.AllArgsConstructor;
//import lombok.SneakyThrows;
//
//import org.springframework.stereotype.Service;
//
//import java.util.ArrayList;
//import java.util.Collections;
//import java.util.List;
//
//
//@Service
//@AllArgsConstructor
//public class RssGeneratorServiceImpl implements RssGeneratorService {
//
//    private final FeedEntryService feedEntryService;
//
//    @Override
//    @SneakyThrows
//    public String generateRssFeed(){
//
//        SyndFeed feed = RssUtils.getFeed();
//
//       // List<FeedEntry> entries = new ArrayList<>();
//                //feedEntryService.findAll();
//       // processRssFeed(entries);
//        return new SyndFeedOutput().outputString(feed);
//    }
//
////    @SneakyThrows
////    private String processRssFeed(List<FeedEntry> entries){
////        List<SyndEntry> rssEntries = new ArrayList<>();
////
////
////        entries.forEach(entry -> rssEntries.add(generateEntry(entry)));
////        //feed.setEntries(rssEntries);
////
////        return new SyndFeedOutput().outputString(feed);
////    }
//
////    private SyndEntry generateEntry(FeedEntry entry) {
////        SyndEntry rssEntry = new SyndEntryImpl();
////        rssEntry.setTitle(entry.getTitle());
////
////        SyndContent content = RssUtils.getFeedEntryContent();
////        content.setValue(entry.getContent());
////
////        rssEntry.setLink(entry.getUrl());
////        rssEntry.setContents(Collections.singletonList(content));
////        rssEntry.setAuthor(entry.getAuthor());
////        return rssEntry;
////    }
//
//}
//
