package com.glqdlt.myhome.myhomemanager.persistence.book.repository;

import com.glqdlt.myhome.myhomemanager.persistence.book.entity.RidiBook;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RidiRepo extends JpaRepository<RidiBook,Integer> {
}
