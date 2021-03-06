package com.glqdlt.myhome.persistence.member.entity;


import com.fasterxml.jackson.annotation.JsonIgnore;
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

    @JsonIgnore
    @Column(nullable = false,unique = true)
    private String id;

    @JsonIgnore
    @Column(nullable = false)
    private String password;

    @Column(nullable = false)
    private String name;

    @JsonIgnore
    @Column(columnDefinition = "DATETIME DEFAULT CURRENT_TIMESTAMP",nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    @CreationTimestamp
    private Date regDate;

    @JsonIgnore
    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private MemberType type;
}
