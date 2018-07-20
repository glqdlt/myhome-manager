package com.glqdlt.myhome.persistence.book.repository;

import com.glqdlt.myhome.persistence.book.entity.ScanBook;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ScanBookRepo extends JpaRepository<ScanBook,Integer> {
}
