package com.glqdlt.myhome.myhomemanager.persistence.author.repository;

import com.glqdlt.myhome.myhomemanager.persistence.author.entity.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepo extends JpaRepository<Author,Integer> {
}
