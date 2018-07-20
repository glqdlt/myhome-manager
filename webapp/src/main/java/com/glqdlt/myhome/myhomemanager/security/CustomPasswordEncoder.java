package com.glqdlt.myhome.myhomemanager.security;
//
//import lombok.extern.slf4j.Slf4j;
//import org.springframework.security.crypto.password.PasswordEncoder;
//
//@Slf4j
//public class CustomPasswordEncoder implements PasswordEncoder {
//
//    @Override
//    public String encode(CharSequence rawPw) {
//        log.info("lawPw : {}", rawPw.toString());
//        return rawPw.toString();
//    }
//
//    @Override
//    public boolean matches(CharSequence rawPw, String encodePw) {
//        log.info("rawPw : {} , encodedPassword : {}",rawPw.toString(), encodePw);
//        return encodePw.equals(rawPw.toString());
//    }
//}
