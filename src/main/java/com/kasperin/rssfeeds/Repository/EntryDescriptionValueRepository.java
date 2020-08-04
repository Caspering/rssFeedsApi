package com.kasperin.rssfeeds.Repository;

import com.kasperin.rssfeeds.model.EntryDescriptionValue;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EntryDescriptionValueRepository extends JpaRepository<EntryDescriptionValue, Long> {
}
