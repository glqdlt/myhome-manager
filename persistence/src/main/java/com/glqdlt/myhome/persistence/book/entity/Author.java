package com.glqdlt.myhome.persistence.book.entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.util.Date;

@NoArgsConstructor
@RequiredArgsConstructor
@Data
@Entity(name = "tbl_author")
public class Author {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer seq;

    @NonNull
    @Column(nullable = false)
    private String name;

    @Column(columnDefinition = "DATETIME DEFAULT CURRENT_TIMESTAMP",nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    @CreationTimestamp
    private Date regDate;
}
