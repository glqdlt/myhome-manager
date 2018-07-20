package com.glqdlt.myhome.persistence.book.entity;

import com.glqdlt.myhome.persistence.member.entity.Member;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@DiscriminatorValue("B")
@Entity(name = "tbl_book")
@Inheritance(strategy = InheritanceType.JOINED)
@DiscriminatorColumn(name = "archiveType")
@Data
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer seq;

    @Column(nullable = false,unique = true)
    private String title;

    @OneToOne(targetEntity = Author.class)
    @JoinColumn(nullable = false)
    private Author author;

    @Column(columnDefinition = "DATETIME DEFAULT CURRENT_TIMESTAMP",nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    @CreationTimestamp
    private Date regDate;
    private Date expireDate;

    @OneToOne
    @JoinColumn(nullable = false)
    private Member register;

    private String descriptionUrl;

//    OneTomany 로 했더니 자꾸 뻑이 났다, 이유는 부모와 자신관계의 중간쯤되는 tbl_book_tags(자동생성됨) 에 tags_seq가 unique로 되어있는게 아닌가 -_-;; 이게 알고보니 ontToMany 로 해서 그렇다고 한다. 잠시 늦었으니..
//   TODO OntToMany 와 ManyToMany의 차이점에 대해 명확히 알아보자.
//    @OneToMany(targetEntity = Tag.class, cascade = CascadeType.ALL)
    @ManyToMany(targetEntity = Tag.class, cascade = CascadeType.ALL)
    private List<Tag> tags;
    private String thumbnailUrl;

}
