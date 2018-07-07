package com.glqdlt.myhome.myhomemanager.persistence.entity.member;


import javax.persistence.*;

@Entity(name = "tbl_member")
public class Member {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer seq;
    private String id;
    private String password;
    private String name;
    @Enumerated
    private MemberType type;
}
