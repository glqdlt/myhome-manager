package com.glqdlt.myhome.myhomemanager.persistence.entity.book;

import com.glqdlt.myhome.myhomemanager.persistence.entity.author.Author;
import com.glqdlt.myhome.myhomemanager.persistence.entity.member.Member;
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
    @Column(nullable = false)
    private String title;

    @OneToOne(targetEntity = Author.class)
    @JoinColumn(name = "seq")
    private Author author;

    @CreationTimestamp
    private Date regDate;
    private Date expireDate;
    private Member register;
    private String descriptionUrl;

    @Enumerated
    private BookType type;

    @JoinColumn(name = "seq")
    @OneToMany(targetEntity = Tag.class)
    @Column(nullable = false)
    private List<Tag> tags;

}
