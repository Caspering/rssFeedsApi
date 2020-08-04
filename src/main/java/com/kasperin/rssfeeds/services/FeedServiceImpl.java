package com.kasperin.rssfeeds.services;

import com.kasperin.rssfeeds.model.Feed;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FeedServiceImpl implements FeedService{


    @Override
    public List<Feed> findAll() {
        return null;
    }

    @Override
    public Optional<Feed> findById(Long id) {
        return Optional.empty();
    }

    @Override
    public Feed save(Feed feed) {
        return null;
    }

    @Override
    public Feed findByTitle(String Title) {
        return null;
    }
}
