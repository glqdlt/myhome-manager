package com.glqdlt.myhome.myhomemanager.persistence.book.entity;

import com.glqdlt.myhome.myhomemanager.persistence.server.Server;
import lombok.Data;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.OneToOne;

@DiscriminatorValue("S")
@Entity(name = "tbl_scan_book")
@Data
public class ScanBook extends Book {

    private String fileName;
    private String fileHash;
    private String path;

    @OneToOne
    private Server server;
    private Integer size;

}
