package com.glqdlt.myhome.myhomemanager.persistence.coupon.repository;

import com.glqdlt.myhome.myhomemanager.persistence.coupon.entity.EventCoupon;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface EventCouponRepo extends JpaRepository<EventCoupon,Integer> {

    Optional<EventCoupon> findByCouponNameAndStatus(String couponName, boolean status);
}
