package com.glqdlt.myhome.myhomemanager.persistence.coupon.entity;

import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity(name = "tbl_event_coupon_issue")
@IdClass(EventCouponSerial.class)
public class EventCouponIssueLog {

    @OneToOne(targetEntity = EventCoupon.class)
    @JoinColumn(name = "coupon_seq")
    @Id
    private EventCoupon eventCoupon;

    @Id
    private Integer couponIssueCount;

    private String memberId;

    @Column(columnDefinition = "DATETIME DEFAULT CURRENT_TIMESTAMP")
    @Temporal(TemporalType.TIMESTAMP)
    @CreationTimestamp
    private Date issuedDate;

}
