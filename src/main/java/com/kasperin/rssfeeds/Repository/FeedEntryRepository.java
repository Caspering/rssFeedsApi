package com.kasperin.rssfeeds.Repository;

import com.kasperin.rssfeeds.model.FeedEntry;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FeedEntryRepository extends JpaRepository<FeedEntry, Long> {


    List<FeedEntry> findAll();
}
