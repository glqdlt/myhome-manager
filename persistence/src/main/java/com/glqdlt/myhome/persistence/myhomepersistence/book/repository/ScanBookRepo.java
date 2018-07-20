package com.glqdlt.myhome.persistence.myhomepersistence.book.repository;

import com.glqdlt.myhome.persistence.myhomepersistence.book.entity.ScanBook;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ScanBookRepo extends JpaRepository<ScanBook,Integer> {
}
