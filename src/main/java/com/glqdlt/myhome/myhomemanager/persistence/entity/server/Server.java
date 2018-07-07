package com.glqdlt.myhome.myhomemanager.persistence.entity.server;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "tbl_server")
public class Server {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer seq;
    private String name;
    private String ip;
}
