package com.glqdlt.myhome.persistence.book.repository;

import com.glqdlt.myhome.persistence.book.entity.Author;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface AuthorRepo extends JpaRepository<Author,Integer> {
    Optional<Author> findByName(String name);
}
