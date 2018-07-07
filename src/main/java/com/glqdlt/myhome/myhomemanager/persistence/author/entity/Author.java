package com.glqdlt.myhome.myhomemanager.persistence.author.entity;

import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity(name = "tbl_author")
public class Author {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer seq;
    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    @CreationTimestamp
    private Date regDate;
}
