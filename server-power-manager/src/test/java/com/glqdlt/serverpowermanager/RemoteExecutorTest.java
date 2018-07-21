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
public class RemoteExecutorTest {

    @Value("${ssh.user.id}")
    private String USER_ID;
    @Value("${ssh.user.pw}")
    private String USER_PW;
    @Value("${ssh.host.ip}")
    private String HOST;
    @Value("${ssh.host.port}")
    private String PORT;
    @Value("${ssh.root.pw}")
    private String ROOT_PW;

    @Autowired
    RemoteExecutor remoteExecutor;

    @Test
    public void exec() {
        remoteExecutor.systemShutdownExecute(USER_ID, USER_PW, HOST, Integer.parseInt(PORT), ROOT_PW, ShutdownCommander.SHUTDOWN ,0);
    }
}