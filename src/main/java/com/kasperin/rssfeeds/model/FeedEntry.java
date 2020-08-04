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

@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class FeedEntry implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;

    @OneToOne(cascade= {CascadeType.ALL})
    private EntryDescription entryDescription;

    public FeedEntry(SyndEntry syndEntry){
        this.setTitle(syndEntry.getTitle());
        this.setEntryDescription(new EntryDescription(syndEntry));
    }

}




//    public FeedEntry(SyndFeed syndFeed){
//
//        this.setTitle(syndFeed.getTitle());
//
//    }

//
//    @Transient
//    @OneToMany
//    private List<SyndContent> item = new ArrayList<>();
////this.setAuthor(syndFeed.getAuthor());
//    public void addDescription(String item){
//        this.description.add(item);
//    }
//    public FeedEntry(String string){
//
//    }
//    @OneToOne
//    private Channel channel;
//
//    private String author;
//
//
//    private String version;
//
// @Lob
//    @Transient
//    @OneToMany
//    private List<String> description = new ArrayList<>();
//
//    private String url;
//
//    //@Transient
//    //List<Module> descriptions;
//

//    @ManyToOne
//    @JoinColumn(name = "target_website_id")
//    private TargetWebsite targetWebsite;
//       for(SyndFeed syndFeed1 : syndFeed){
//
//       }
// this.addDescription(syndFeed.getDescription());
//this.addItem(syndFeed.getDescriptionEx());
//this.setDescriptions(syndFeed.getModules());

//this.setUrl(syndFeed.getLink());
// this.setChannel(syndFeed.);