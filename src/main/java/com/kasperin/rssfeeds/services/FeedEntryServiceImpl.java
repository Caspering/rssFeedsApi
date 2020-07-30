package com.kasperin.rssfeeds.services;

import com.kasperin.rssfeeds.Repository.FeedEntryRepository;
import com.kasperin.rssfeeds.model.FeedEntry;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class FeedEntryServiceImpl implements FeedEntryService{

    private final FeedEntryRepository feedEntryRepository;

    @Override
    public List<FeedEntry> findAll() {
        return feedEntryRepository.findAll();
    }

    @Override
    public FeedEntry save(FeedEntry feedEntry){
        return feedEntryRepository.save(feedEntry);
    }


}
