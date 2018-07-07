package com.glqdlt.myhome.myhomemanager.persistence.server;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity(name = "tbl_server")
public class Server {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer seq;
    @Column(nullable = false,unique = true)
    private String name;
    private String ip;
}
