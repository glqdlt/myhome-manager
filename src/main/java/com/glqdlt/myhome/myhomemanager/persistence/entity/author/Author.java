package com.glqdlt.myhome.myhomemanager.persistence.entity.author;

import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.util.Date;

@Entity(name = "tbl_author")
public class Author {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer seq;
    @Column(nullable = false)
    private String name;

    @CreationTimestamp
    private Date regDate;
}
