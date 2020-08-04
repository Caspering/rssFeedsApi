package com.kasperin.rssfeeds.Repository;

import com.kasperin.rssfeeds.model.EntryDescription;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EntryDescriptionRepository extends JpaRepository<EntryDescription, Long> {
}
