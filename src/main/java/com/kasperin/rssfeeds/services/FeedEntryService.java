package com.kasperin.rssfeeds.services;

import com.kasperin.rssfeeds.model.FeedEntry;

import java.util.List;

public interface FeedEntryService {
    List<FeedEntry> findAll();

    FeedEntry save(FeedEntry feedEntry);
}
