package com.glqdlt.myhome.persistence.book.controller;

import lombok.extern.slf4j.Slf4j;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.mockito.Mockito.when;

@Slf4j
@ActiveProfiles("test")
@WebMvcTest(value = CouponController.class, secure = false)
@RunWith(SpringRunner.class)
public class CouponControllerTest {


    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private CouponService couponService;

    PromotionData notPromotion = new PromotionData();
    PromotionData isPromotion = new PromotionData();

    RequestBuilder requestBuilder;

    @Before
    public void initDatas() {
        notPromotion.setPromotion(false);
        notPromotion.setPromotionId(null);

        isPromotion.setPromotionId("PR2017");
        isPromotion.setPromotion(true);

        this.requestBuilder = MockMvcRequestBuilders.post("/coupon/issue")
                .param("userId", "test-user")
                .param("coupon", "some-coupon")
                .accept(MediaType.APPLICATION_FORM_URLENCODED);
    }

    @Test
    public void 프로모션이아닐때() throws Exception {
        when(
                couponService.couponIssue(Mockito.anyString(), Mockito.anyString(), Mockito.anyString())
        ).thenReturn(notPromotion);
        MvcResult result = mockMvc.perform(requestBuilder).andReturn();
        String message = result.getModelAndView().getModel().get("msg").toString();
        Assert.assertEquals(CouponStatusMessage.정상발급.getPopupMessage(), message);

    }

    @Test
    public void 프로모션일때() throws Exception {
        when(
                couponService.couponIssue(Mockito.anyString(), Mockito.anyString(), Mockito.anyString())
        ).thenReturn(isPromotion);
        MvcResult result = mockMvc.perform(requestBuilder).andReturn();
        String contentsId = result.getModelAndView().getModel().get("contentsId").toString();
        Assert.assertEquals(this.isPromotion.getPromotionId(), contentsId);
    }


    @Test
    public void 쿠폰지급기간이아님() throws Exception {
        when(
                couponService.couponIssue(Mockito.anyString(), Mockito.anyString(), Mockito.anyString())
        ).thenThrow(new CouponException(CouponStatusMessage.쿠폰지급기간이아님));
        MvcResult result = mockMvc.perform(requestBuilder).andReturn();
        String message = result.getModelAndView().getModel().get("msg").toString();
        Assert.assertEquals(CouponStatusMessage.쿠폰지급기간이아님.getPopupMessage(), message);
    }

    @Test
    public void 쿠폰이존재하지않음() throws Exception {
        when(
                couponService.couponIssue(Mockito.anyString(), Mockito.anyString(), Mockito.anyString())
        ).thenThrow(new CouponException(CouponStatusMessage.쿠폰이존재하지않음));
        MvcResult result = mockMvc.perform(requestBuilder).andReturn();
        String message = result.getModelAndView().getModel().get("msg").toString();
        Assert.assertEquals(CouponStatusMessage.쿠폰이존재하지않음.getPopupMessage(), message);
    }



}