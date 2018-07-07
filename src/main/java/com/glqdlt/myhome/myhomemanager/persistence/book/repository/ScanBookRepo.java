package com.glqdlt.myhome.myhomemanager.persistence.book.repository;

import com.glqdlt.myhome.myhomemanager.persistence.book.entity.ScanBook;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ScanBookRepo extends JpaRepository<ScanBook,Integer> {
}
