package com.glqdlt.myhome.webapp.service.book;

import com.glqdlt.myhome.persistence.book.repository.RidiRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RidiBookService {

    @Autowired
    RidiRepo ridiRepo;

}
