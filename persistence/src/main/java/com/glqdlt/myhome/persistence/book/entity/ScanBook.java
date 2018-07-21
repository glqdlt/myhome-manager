package com.glqdlt.myhome.persistence.book.entity;

import com.glqdlt.myhome.persistence.server.Server;
import lombok.Data;

import javax.persistence.Column;
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

    @Column()
    private Integer isUploaded;

}
