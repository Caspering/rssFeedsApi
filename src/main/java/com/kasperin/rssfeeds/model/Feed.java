package com.kasperin.rssfeeds.model;

import com.rometools.rome.feed.synd.SyndEntry;
import com.rometools.rome.feed.synd.SyndFeed;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Feed implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String feedTitle;
    private String feedDescritption;

    @OneToMany(cascade= {CascadeType.ALL})
    List<FeedEntry> entries = new ArrayList<>();

    public Feed(SyndFeed syndFeed){
        this.setFeedTitle(syndFeed.getTitle());
        this.setFeedDescritption(syndFeed.getDescription());
        this.setEntries(setFeedEntryList(syndFeed));
    }


    public List<FeedEntry> setFeedEntryList(SyndFeed syndFeed){
        List<FeedEntry> entries = new ArrayList<>();
        for(SyndEntry entry : syndFeed.getEntries()){
            entries.add(new FeedEntry(entry));
        }
        return entries;
    }


    public void addFeedEntry(FeedEntry feedEntry){
        this.entries.add(feedEntry);
    }
    public void removeFeedEntry(FeedEntry feedEntry){
        this.entries.remove(feedEntry);
    }

}
// this.addFeedEntry(new FeedEntry(syndFeed.getEntries().stream().forEach(addFeedEntry())));