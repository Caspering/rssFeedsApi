package com.kasperin.rssfeeds.services;

import com.kasperin.rssfeeds.model.Item;

import java.util.List;

public interface ApiService {

    List<Item> getItems(Integer limit);
}
