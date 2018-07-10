package com.glqdlt.myhome.myhomemanager.webapp.controller.api.book;

import lombok.Data;
import org.springframework.web.multipart.MultipartFile;

import java.util.Date;

@Data
public class ScanBookDto {

    private String title;
    private String author;
    private BookType bookType;
    private String descriptionUrl;
    private String thumbnailUrl;
    private String expireDate;
    private String tags;
    private MultipartFile uploadFile;
}
