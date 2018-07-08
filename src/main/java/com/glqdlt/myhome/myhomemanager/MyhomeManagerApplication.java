package com.glqdlt.myhome.myhomemanager;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = "com.glqdlt.myhome.myhomemanager")
@SpringBootApplication
public class MyhomeManagerApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(MyhomeManagerApplication.class, args);
    }

    @Override
    public void run(String... strings) throws Exception {


    }
}
