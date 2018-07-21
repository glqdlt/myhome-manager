package com.glqdlt.myhome.persistence.coupon.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "tbl_event_coupon_metadata")
public class EventCoupon {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "seq")
    private Integer couponId;
    private String couponName;

    private CouponAssetType assetType;
    private Integer assetValue;

    private Date startDate;
    private Date endDate;
    private Date regDate;

    private boolean status;
}
