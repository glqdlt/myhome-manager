package com.glqdlt.serverpowermanager;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

@Slf4j
@PropertySource("classpath:power-config-${spring.profiles.active}.properties")
@SpringBootApplication
public class ServerPowerManagerApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(ServerPowerManagerApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

    }
}
