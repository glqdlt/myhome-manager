package com.glqdlt.myhome.myhomemanager.persistence.entity.book;

import com.glqdlt.myhome.myhomemanager.persistence.entity.author.Author;
import com.glqdlt.myhome.myhomemanager.persistence.entity.user.User;
import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
public abstract class Book {

    private Integer seq;
    private String title;
    private Author author;
    private Date regDate;
    private Date expireDate;
    private User register;
    private String descriptionUrl;
    private BookType type;
    private List<Tag> tags;

}
