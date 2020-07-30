package com.kasperin.rssfeeds.services;

import com.kasperin.rssfeeds.Repository.ChannelRepository;

import com.rometools.rome.feed.rss.Channel;
import com.rometools.rome.feed.synd.SyndContent;
import com.rometools.rome.feed.synd.SyndContentImpl;
import com.rometools.rome.feed.synd.SyndFeed;

import com.rometools.rome.io.SyndFeedInput;

import com.rometools.rome.io.SyndFeedOutput;
import com.rometools.rome.io.XmlReader;
import lombok.AllArgsConstructor;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.net.URL;

@Slf4j
@Component
@AllArgsConstructor
public class RssUtils {

    private final FeedEntryService feedEntryService;

    private final ChannelRepository channelRepository;



    public static final String RESOURCE_LOCATION = "https://us-cert.cisa.gov/ncas/alerts.xml";

    @Scheduled(fixedDelay=300000)
    public void pullFeedsJob(){
        parseFeeds();
        //log.info("current parsed feeds /n"+parseFeeds());
    }

    @SneakyThrows
    public com.kasperin.rssfeeds.model.Channel parseFeeds(){
        URL feedUrl= new URL(RESOURCE_LOCATION);
        SyndFeedInput input = new SyndFeedInput();
        SyndFeed feed = input.build(new XmlReader(feedUrl));


        SyndFeedOutput output = new SyndFeedOutput();
        Channel channel = new Channel(output.outputString(feed));
       // channelRepository.save(convertToPojo(channel));
        //channel.setDescription(feed.getDescription());

//        //SyndContent description = new SyndContentImpl();
       //System.out.print(output.outputString(feed));
       // System.out.print(feed);

      return channelRepository.save(convertToPojo(channel));

      // return channelRepository.save(convertToPojo(channel));
       //String string = (output.outputString(feed));
       // output.output(feed);

       // return feedEntryService.save(convertToPojo(input.build(new XmlReader(feedUrl))));
    }

    private static com.kasperin.rssfeeds.model.Channel convertToPojo(Channel channel){
        return new com.kasperin.rssfeeds.model.Channel(channel);
    }

    public static SyndContent getFeedEntryContent() {
        SyndContent content = new SyndContentImpl();
        content.setType("text/html");

        return content;
    }
}
