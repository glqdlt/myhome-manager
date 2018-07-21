package com.glqdlt.serverpowermanager;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

@ActiveProfiles("prod")
@SpringBootTest
@Slf4j
@RunWith(SpringRunner.class)
public class WakeOnExecutorTest {

    @Value("${wol.broadcast.port}")
    public String PORT;
    @Value("${wol.broadcast.address}")
    public String HOST;
    @Value("${wol.system.first.mac}")
    public String MAC;

    @Test
    public void name() {
        PowerOnExecutor powerOnExecutor = new PowerOnExecutor();
        powerOnExecutor.execute(PORT, HOST, MAC);
    }
}