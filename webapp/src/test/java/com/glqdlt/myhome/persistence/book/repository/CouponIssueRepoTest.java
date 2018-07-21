//package com.glqdlt.myhome.persistence.book.repository;
//
//import lombok.extern.slf4j.Slf4j;
//import org.junit.Assert;
//import org.junit.Before;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
//import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
//import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
//import org.springframework.test.context.ActiveProfiles;
//import org.springframework.test.context.junit4.SpringRunner;
//
//import java.util.Calendar;
//import java.util.Date;
//import java.util.List;
//import java.util.Optional;
//import java.util.stream.IntStream;
//
//import static java.util.stream.Collectors.toList;
//
//@Slf4j
//@ActiveProfiles("test")
//@RunWith(SpringRunner.class)
//@DataJpaTest
//@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
//public class CouponIssueRepoTest {
//
//    @Autowired
//    private TestEntityManager testEntityManager;
//
//    @Autowired
//    private CouponIssueRepo couponIssueRepo;
//
//    @Autowired
//    private CouponRepo couponRepo;
//
//    @Autowired
//    private AccountRepo accountRepo;
//
//    @Test
//    public void testConst() {
//
//    }
//
//    @Before
//    public void setData() {
//        List<CouponEntity> initData = IntStream.range(1, 10).mapToObj(x -> {
//            CouponEntity someCoupon = new CouponEntity();
//
//            someCoupon.setSeq(x);
//            someCoupon.setPeriod(1);
//            someCoupon.setCountMaximum(1000 + x);
//            someCoupon.setCouponName("someCoupon-" + x);
//            someCoupon.setDeleteStatus(false);
//            someCoupon.setDeviceLimit(false);
//
//            Calendar calendar = Calendar.getInstance();
//            calendar.setTime(new Date());
//
//            if (x % 2 == 0) {
//                calendar.add(Calendar.DAY_OF_MONTH, 2);
//            } else {
//                calendar.add(Calendar.DAY_OF_MONTH, 1);
//            }
//
//            someCoupon.setStartDate(new Date());
//            someCoupon.setEndDate(calendar.getTime());
//
//            someCoupon.setPopMessage("someCoupon-" + x);
//            someCoupon.setPromotionStatus(false);
//            someCoupon.setPromotionId("");
//            someCoupon.setRewardType(CouponType.MONEY);
//            someCoupon.setRewardValue(1L + x);
//
//            if (x == 1) {
//                someCoupon.setIssueStatus(true);
//            } else {
//                someCoupon.setIssueStatus(false);
//            }
//
//            return someCoupon;
//        }).collect(toList());
//
//        couponRepo.save(initData);
//    }
//
//    @Test
//    public void INIT데이터의확인() {
//        Assert.assertEquals(9, couponRepo.findAll().size());
//    }
//
//    @Test
//    public void test001() {
//        Optional<CouponEntity> coupon = couponRepo.findByCouponNameAndIssueStatus("someCoupon-1", true);
//        Assert.assertTrue(coupon.isPresent());
//    }
//
//    @Test
//    public void test001() {
//        Optional<CouponEntity> coupon = couponRepo.findByCouponNameAndIssueStatus("someCoupon-2", true);
//        Assert.assertTrue(!coupon.isPresent());
//    }
//
//}