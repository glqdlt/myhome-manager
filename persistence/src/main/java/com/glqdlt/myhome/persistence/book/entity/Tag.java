package com.glqdlt.myhome.persistence.book.entity;

import lombok.*;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.util.Date;

@RequiredArgsConstructor
@NoArgsConstructor
@Data
@Entity(name = "tbl_tag")
public class Tag {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long seq;

    @NonNull
    @Column(nullable = false,unique = true)
    private String value;

    @Column(columnDefinition = "DATETIME DEFAULT CURRENT_TIMESTAMP",nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    @CreationTimestamp
    private Date regDate;
}
