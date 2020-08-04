package com.kasperin.rssfeeds.services;

import com.kasperin.rssfeeds.Repository.TargetWebsiteRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class TaregetWebsiteServiceImpl implements TaregetWebsiteService{


    private TargetWebsiteRepository targetWebsiteRepository;

    @Override
    public List<TargetWebsite> findAll() {
        return targetWebsiteRepository.findAll();
    }
}
