package com.kasperin.rssfeeds.model;

import com.rometools.rome.feed.synd.SyndEntry;
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
public class EntryDescription implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne(cascade= {CascadeType.ALL})
    private EntryDescriptionValue entryDescriptionValue;

    public EntryDescription(SyndEntry syndEntry){
        this.setEntryDescriptionValue(new EntryDescriptionValue(syndEntry));
    }
}
