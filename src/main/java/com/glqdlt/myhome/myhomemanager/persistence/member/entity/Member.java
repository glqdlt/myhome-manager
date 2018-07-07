package com.glqdlt.myhome.myhomemanager.persistence.member.entity;


import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity(name = "tbl_member")
public class Member {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer seq;
    @Column(nullable = false,unique = true)
    private String id;

    @Column(nullable = false)
    private String password;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    @CreationTimestamp
    private Date regDate;

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private MemberType type;
}
