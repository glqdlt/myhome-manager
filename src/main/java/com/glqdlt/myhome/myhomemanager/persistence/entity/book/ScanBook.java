package com.glqdlt.myhome.myhomemanager.persistence.entity.book;

import com.glqdlt.myhome.myhomemanager.persistence.entity.server.Server;
import lombok.Data;

@Data
public class ScanBook extends Book {

    private String fileName;
    private String fileHash;
    private String path;
    private Server server;
    private Integer size;

}
