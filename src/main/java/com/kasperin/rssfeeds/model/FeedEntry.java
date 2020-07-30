package com.kasperin.rssfeeds.model;


import com.rometools.rome.feed.synd.SyndFeed;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class FeedEntry implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    private Channel channel;


//    private String title;
//
//    private String author;
//
    private String content;


//    public FeedEntry(String string){
//
//    }


//
//    private String version;
//
//    private String description;
//
//    private String url;
//
//    //@Transient
//    //List<Module> descriptions;
//
//    public FeedEntry(SyndFeed syndFeed){
//        //this.setAuthor(syndFeed.getAuthor());
//       // this.setTitle(syndFeed.getTitle());
//       // this.setDescription(syndFeed.getDescription());
//       // this.addItem(syndFeed.getDescriptionEx());
//        //this.setDescriptions(syndFeed.getModules());
//
//        //this.setUrl(syndFeed.getLink());
//        this.setChannel(syndFeed.);
//    }
//
//    @Transient
//    @OneToMany
//    private List<SyndContent> item = new ArrayList<>();
//
//    public void addItem(SyndContent item){
//        this.item.add(item);
//    }


//    @ManyToOne
//    @JoinColumn(name = "target_website_id")
//    private TargetWebsite targetWebsite;
}
