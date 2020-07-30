package com.kasperin.rssfeeds.model;

import com.rometools.rome.feed.synd.SyndFeed;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Channel implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;

    private String link;

    private String description;

    private String language;

//    @OneToOne
//    private FeedEntry feedEntry;

    @OneToMany
    private List<Item> items = new ArrayList<>();

    public void addItem(Item item){
        this.items.add(item);
    }

    public Channel(com.rometools.rome.feed.rss.Channel syndFeed){
       // this.setAuthor(syndFeed.getAuthor());
        this.setTitle(syndFeed.getTitle());
        this.setDescription(syndFeed.getDescription());
        //this.setDescriptions(syndFeed.getModules());
        this.setLink(syndFeed.getLink());
        this.setLanguage(syndFeed.getLanguage());
    }








}
