package com.glqdlt.myhome.myhomemanager.service.book;

import org.springframework.stereotype.Service;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Service
public class CouponService {

    public boolean checkCouponName(String couponName) {
        if (couponName.length() > 10) {
            return true;
        }
        String eventCouponRegex = "[^A-Za-z0-9가-힣]";
        Pattern pattern = Pattern.compile(eventCouponRegex);
        Matcher matcher = pattern.matcher(couponName);
        return matcher.find();
    }
}
