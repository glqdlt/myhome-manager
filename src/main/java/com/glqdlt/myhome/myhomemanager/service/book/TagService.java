package com.glqdlt.myhome.myhomemanager.service.book;

import com.glqdlt.myhome.myhomemanager.persistence.book.repository.TagRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TagService {

    @Autowired
    TagRepo tagRepo;
}
