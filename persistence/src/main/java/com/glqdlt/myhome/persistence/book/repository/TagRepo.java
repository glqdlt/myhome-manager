package com.glqdlt.myhome.persistence.book.repository;

import com.glqdlt.myhome.persistence.book.entity.Tag;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface TagRepo extends JpaRepository<Tag,Integer> {
    Optional<Tag> findByValue(String value);
    Optional<Tag> countByValue(String value);
}
