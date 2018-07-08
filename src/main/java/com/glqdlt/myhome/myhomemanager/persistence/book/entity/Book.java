package com.glqdlt.myhome.myhomemanager.persistence.book.entity;

import com.glqdlt.myhome.myhomemanager.persistence.member.entity.Member;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity(name = "tbl_book")
@Inheritance(strategy = InheritanceType.JOINED)
@DiscriminatorColumn(name = "archiveType")
@Data
public abstract class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer seq;

    @Column(nullable = false,unique = true)
    private String title;

    @OneToOne(targetEntity = Author.class)
    @JoinColumn(nullable = false)
    private Author author;

    @Column(nullable = false)
    @CreationTimestamp
    private Date regDate;
    private Date expireDate;

    @OneToOne
    @JoinColumn(nullable = false)
    private Member register;

    private String descriptionUrl;

    @OneToMany(targetEntity = Tag.class)
    private List<Tag> tags;

    private String thumbnailUrl;

}
