package com.kasperin.rssfeeds.services;

import com.kasperin.rssfeeds.Repository.FeedRepository;
import com.kasperin.rssfeeds.controller.exceptions.ResourceNotFoundException;
import com.kasperin.rssfeeds.model.Feed;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class FeedServiceImpl implements FeedService{

    private final FeedRepository feedRepository;


    @Override
    public List<Feed> findAll() {
        return feedRepository.findAll();
    }

    @Override
    public Optional<Feed> findById(Long id) {
        return Optional.ofNullable(id)
                .map(i -> feedRepository.findById(id))
                .orElseThrow(ResourceNotFoundException::new);
    }

    @Override
    public Feed save(Feed feed) {
        return feedRepository.save(feed);
    }

    @Override
    public List<Feed> findByTitle(String title) {
        return feedRepository.findByTitleContainsIgnoreCase(title);
    }
}
