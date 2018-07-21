package com.glqdlt.myhome.webapp.controller.api.power;

import com.glqdlt.serverpowermanager.ShutdownCommander;
import lombok.Data;

@Data
public class SystemInfo {

    private String userId;
    private String userPw;
    private String host;
    private Integer port;
    private String rootPw;
    private ShutdownCommander command;
    private Integer timer;

}
