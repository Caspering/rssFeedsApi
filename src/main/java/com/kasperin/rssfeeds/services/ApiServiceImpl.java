//package com.kasperin.rssfeeds.services;
//
//import com.kasperin.rssfeeds.model.Item;
//import com.kasperin.rssfeeds.model.FeedEntry;
//import org.springframework.stereotype.Service;
//import org.springframework.web.client.RestTemplate;
//
//import java.util.List;
//
//@Service
//public class ApiServiceImpl implements  ApiService {
//
//    private final RestTemplate restTemplate;
//
//    public ApiServiceImpl(RestTemplate restTemplate) {
//        this.restTemplate = restTemplate;
//    }
//
//    @Override
//    public List<Item> getItems(Integer limit) {
//
//        FeedEntry feedEntry = restTemplate
//                .getForObject("https://us-cert.cisa.gov/ncas/alerts.xml" + limit, FeedEntry.class);
//        return feedEntry.getChannel().getItem();
//    }
//}
