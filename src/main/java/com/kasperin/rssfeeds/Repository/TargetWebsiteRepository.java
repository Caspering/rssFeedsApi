package com.kasperin.rssfeeds.Repository;

import com.kasperin.rssfeeds.model.TargetWebsite;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TargetWebsiteRepository extends JpaRepository<TargetWebsite, Long> {
    List<TargetWebsite> findAll();
}
