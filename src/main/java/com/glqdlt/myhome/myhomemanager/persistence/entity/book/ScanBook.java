package com.glqdlt.myhome.myhomemanager.persistence.entity.book;

import com.glqdlt.myhome.myhomemanager.persistence.entity.server.Server;
import lombok.Data;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@DiscriminatorValue("scan")
@Entity(name = "tbl_scan_book")
@Data
public class ScanBook extends Book {

    private String fileName;
    private String fileHash;
    private String path;

    @JoinColumn(name = "seq")
    @OneToOne
    private Server server;
    private Integer size;

}
