package com.kasperin.rssfeeds.services;

import java.util.List;

public interface ApiService {

    List<Item> getItems(Integer limit);
}
