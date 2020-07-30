package com.kasperin.rssfeeds.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Data
public class ParseEntryRule {

    @Id
    @GeneratedValue
    private Long id;
    private String description;
    private String title;
    private String content;
    private String link;
}