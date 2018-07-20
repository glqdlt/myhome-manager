package com.glqdlt.myhome.persistence.coupon.entity;


import lombok.Data;

import java.io.Serializable;


@Data
public class EventCouponSerial implements Serializable {

    private EventCoupon eventCoupon;
    private Integer couponIssueCount;

}
