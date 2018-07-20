package com.glqdlt.myhome.persistence.coupon.repository;

import com.glqdlt.myhome.persistence.coupon.entity.EventCoupon;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface EventCouponRepo extends JpaRepository<EventCoupon,Integer> {

    Optional<EventCoupon> findByCouponNameAndStatus(String couponName, boolean status);
}
