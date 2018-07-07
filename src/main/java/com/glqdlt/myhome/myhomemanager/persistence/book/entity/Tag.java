package com.glqdlt.myhome.myhomemanager.persistence.book.entity;

import lombok.*;

import javax.persistence.*;

@Data
@Entity(name = "tbl_tag")
public class Tag {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer seq;

    @Column(nullable = false,unique = true)
    private String value;
}
