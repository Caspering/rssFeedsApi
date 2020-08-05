package com.kasperin.rssfeeds.Repository;

import com.kasperin.rssfeeds.model.Feed;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FeedRepository extends JpaRepository<Feed, Long> {
    List<Feed> findByTitleContainsIgnoreCase(String title);
}
