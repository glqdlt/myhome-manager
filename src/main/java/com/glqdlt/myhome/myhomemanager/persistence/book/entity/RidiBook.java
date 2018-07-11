package com.glqdlt.myhome.myhomemanager.persistence.book.entity;

import lombok.Data;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@DiscriminatorValue(value = "R")
@Entity(name = "tbl_ridi_book")
@Data
public class RidiBook extends Book {

    private String url;
    private String ridiUserId;

}
