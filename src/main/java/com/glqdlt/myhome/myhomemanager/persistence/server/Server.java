package com.glqdlt.myhome.myhomemanager.persistence.server;

import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity(name = "tbl_server")
public class Server {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer seq;
    @Column(nullable = false,unique = true)
    private String name;
    private String ip;

    @Column(columnDefinition = "DATETIME DEFAULT CURRENT_TIMESTAMP",nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    @CreationTimestamp
    private Date regDate;
}
