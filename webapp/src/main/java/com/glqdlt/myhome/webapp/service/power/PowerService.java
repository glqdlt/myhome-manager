package com.glqdlt.myhome.webapp.service.power;

import com.glqdlt.myhome.webapp.controller.api.power.SystemInfo;
import com.glqdlt.serverpowermanager.RemoteExecutor;
import com.glqdlt.serverpowermanager.ShutdownCommander;
import com.glqdlt.serverpowermanager.WakeOnLanExecutor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class PowerService {


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

    @Value("${wol.broadcast.port}")
    public String WAKE_PORT;
    @Value("${wol.broadcast.address}")
    public String WAKE_HOST;
    @Value("${wol.system.first.mac}")
    public String WAKE_MAC;


    @Autowired
    RemoteExecutor remoteExecutor;

    @Autowired
    WakeOnLanExecutor wakeOnLanExecutor;

    public void remoteExecute(String server, ShutdownCommander shutdownCommander, Integer timer) {
        if (shutdownCommander == ShutdownCommander.WAKE) {
            wakeOnLanExecutor.execute(WAKE_PORT, WAKE_HOST, WAKE_MAC);
        } else {
            remoteExecutor.systemShutdownExecute(USER_ID, USER_PW, HOST, Integer.parseInt(PORT), ROOT_PW, shutdownCommander, timer);
        }
    }
}
