package com.glqdlt.myhome.myhomemanager.service.book;

import com.glqdlt.myhome.persistence.myhomepersistence.book.repository.ScanBookRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ScanBookService {

    @Autowired
    ScanBookRepo scanBookRepo;
}
