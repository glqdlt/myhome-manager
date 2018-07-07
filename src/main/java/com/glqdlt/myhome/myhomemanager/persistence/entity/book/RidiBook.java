package com.glqdlt.myhome.myhomemanager.persistence.entity.book;

import com.glqdlt.myhome.myhomemanager.persistence.entity.book.Book;
import lombok.Data;

@Data
public class RidiBook extends Book {

    private String url;
    private String ridiUserId;

}
