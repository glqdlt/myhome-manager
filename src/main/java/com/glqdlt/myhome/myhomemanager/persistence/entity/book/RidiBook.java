package com.glqdlt.myhome.myhomemanager.persistence.entity.book;

import lombok.Data;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@DiscriminatorValue(value = "ridi")
@Entity(name = "tbl_ridi_book")
@Data
public class RidiBook extends Book {

    private String url;
    private String ridiUserId;

}
