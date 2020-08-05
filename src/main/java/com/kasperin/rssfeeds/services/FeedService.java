package com.kasperin.rssfeeds.services;

import com.kasperin.rssfeeds.model.Feed;

import java.util.List;
import java.util.Optional;

public interface FeedService {
    List<Feed> findAll();
    Optional<Feed> findById(Long id);
    Feed save(Feed feed);
    List<Feed> findByTitle(String Title);
    //Feed find
}
