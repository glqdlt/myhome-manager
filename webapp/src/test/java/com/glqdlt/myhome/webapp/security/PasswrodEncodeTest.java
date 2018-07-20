package com.glqdlt.myhome.webapp.security;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Slf4j
public class PasswrodEncodeTest {

    @Test
    public void doEncrypt(){
        String password ="admin1234";
//        strength 의 기본값은 10
//        값을 11 이상으로 올릴 수록 연산이 느려짐.
        PasswordEncoder passwordEncoder = new BCryptPasswordEncoder(11);
        String encryptedPassword = passwordEncoder.encode(password);
        log.info(encryptedPassword);
        log.info(passwordEncoder.matches(password,encryptedPassword) ? "Match" : "Not");
        log.info(passwordEncoder.matches(password+"1",encryptedPassword) ? "Match" : "Not");
        log.info(passwordEncoder.matches(password,encryptedPassword+"1") ? "Match" : "Not");
    }
}
