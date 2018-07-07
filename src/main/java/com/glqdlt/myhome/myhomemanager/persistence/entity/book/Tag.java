package com.glqdlt.myhome.myhomemanager.persistence.entity.book;

import javax.persistence.*;

@Entity(name = "tbl_book_tag")
public class Tag {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer seq;

    @Column(nullable = false)
    private String value;
}
