package com.glqdlt.myhome.persistence.book.repository;

import com.glqdlt.myhome.persistence.book.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface BookRepo extends JpaRepository<Book, Integer> {
    Optional<Book> findBookBySeq(Integer seq);
}
