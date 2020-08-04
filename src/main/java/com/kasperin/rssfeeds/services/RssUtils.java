package com.kasperin.rssfeeds.services;

import com.kasperin.rssfeeds.Repository.ChannelRepository;
import com.kasperin.rssfeeds.Repository.FeedRepository;
import com.kasperin.rssfeeds.model.Feed;
import com.kasperin.rssfeeds.model.FeedEntry;
import com.rometools.rome.feed.synd.*;
import com.rometools.rome.io.SyndFeedInput;
import com.rometools.rome.io.SyndFeedOutput;
import com.rometools.rome.io.XmlReader;
import lombok.AllArgsConstructor;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.component.rss.RssEndpoint;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.net.URL;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Slf4j
@Component
@AllArgsConstructor
public class RssUtils {
      //  extends RouteBuilder {

    private final FeedRepository feedRepository;
    private final FeedEntryService feedEntryService;
    private final ChannelRepository channelRepository;



    public static final String RESOURCE_LOCATION = "https://us-cert.cisa.gov/ncas/alerts.xml";

    @SneakyThrows
    @Scheduled(fixedDelay=300000)
    public void pullFeedsJob(){
        parseFeeds();
        //configure();
       // log.info("current parsed feeds /n"+parseFeeds());
    }

    @SneakyThrows
    public Feed parseFeeds(){
        URL feedUrl= new URL(RESOURCE_LOCATION);
        SyndFeedInput input = new SyndFeedInput();

        return feedRepository.save(convertToPojoFeed(input.build(new XmlReader(feedUrl))));
    }

    private static Feed convertToPojoFeed(SyndFeed feed){
        return new Feed(feed);
    }

    public static SyndContent getFeedEntryContent() {
        SyndContent content = new SyndContentImpl();
        content.setType("text/html");

        return content;
    }

//    @Override
//    public void configure() throws Exception {
//        RssEndpoint endpointNew =
//                endpoint("rss:https://us-cert.cisa.gov/ncas/alerts.xml", RssEndpoint.class);
//
//        // START SNIPPET: e1
//        from(endpointNew)
//                //.streamCaching().threads(10)
//                .marshal().rss()
//               // .startupOrder(1)
//                .process(exchange ->
//                        System.out.println(exchange.getIn()
//                                .getBody(String.class)
//                                .replaceAll(">\\s+<", "><")
//                                .trim())
//                )
//                .to("bean:rss").end();
//    }

    // channelRepository.save(convertToPojo(channel));
    //channel.setDescription(feed.getDescription());

//        //SyndContent description = new SyndContentImpl();
    //System.out.print(output.outputString(feed));
    // System.out.print(feed);



    //return channelRepository.save(convertToPojo(channel));

    // return channelRepository.save(convertToPojo(channel));
    //String string = ();
    // output.output(feed);

    // return feedEntryService.save(convertToPojo(input.build(new XmlReader(feedUrl))));
}
//    SyndFeedOutput output = new SyndFeedOutput();
//        SyndFeed feed = input.build(new XmlReader(feedUrl));
//        List<SyndEntry> entries = feed.getEntries();
//        Map<SyndFeed, List<SyndEntry>> dictionary = new HashMap<>();
//        //Map<String, List<String>> dictionary = new HashMap<>();
//        dictionary.put(feed,feed.getEntries());
//
//
//        //entries.stream().forEach(f);
//        System.out.println("***********Feed TITLE************************");
//        System.out.println(feed.getTitle());
//
//        System.out.println("************Description***********************");
//        System.out.println(feed.getDescription());
//
////        System.out.println("***********entry description************************");
////        System.out.println(feed.getEntries());
//        System.out.println("***********************************");
//
//        for (SyndEntry entry : feed.getEntries()) {
//
//            System.out.println("************** Entry Title *********************");
//            System.out.println(entry.getTitle());
//
//
//            System.out.println("***************** Entry Description / syndContent.getValue ******************");
//
//            SyndContent syndContent = entry.getDescription();
//            String description = syndContent.getValue();
//            System.out.println((description));
//
//            System.out.println("*******************************************************");
//        }
//
//        System.out.println("Done");