package com.glqdlt.myhome.persistence.myhomepersistence.book.repository;

import com.glqdlt.myhome.persistence.myhomepersistence.book.entity.Tag;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface TagRepo extends JpaRepository<Tag,Integer> {
    Optional<Tag> findByValue(String value);
    Optional<Tag> countByValue(String value);
}
