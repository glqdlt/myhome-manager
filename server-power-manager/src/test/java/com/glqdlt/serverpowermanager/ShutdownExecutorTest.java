package com.glqdlt.serverpowermanager;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

@ActiveProfiles("prod")
@SpringBootTest
@Slf4j
@RunWith(SpringRunner.class)
public class ShutdownExecutorTest {

    @Value("${ssh.user.id}")
    private String userId;
    @Value("${ssh.user.pw}")
    private String userPw;
    @Value("${ssh.host.ip}")
    private String host;
    @Value("${ssh.host.port}")
    private String port;
    @Value("${ssh.root.pw}")
    private String rootPw;

    @Autowired
    ShutdownExecutor shutdownExecutor;

    @Test
    public void exec() {
        shutdownExecutor.exec(userId, userPw, host, Integer.parseInt(port), rootPw, ShutdownCommander.SHUTDOWN ,0);
    }
}