package com.glqdlt.myhome.persistence.coupon.repository;

import com.glqdlt.myhome.persistence.coupon.entity.EventCouponIssueLog;
import com.glqdlt.myhome.persistence.coupon.entity.EventCoupon;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface EventCouponIssueLogRepo extends JpaRepository<EventCouponIssueLog,Integer> {

    Optional<EventCouponIssueLog> findByEventCoupon_CouponId(Integer seq);
    Optional<EventCouponIssueLog> findByMemberIdAndEventCoupon(String memberId, EventCoupon couponMetadata);
}
