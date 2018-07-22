package com.glqdlt.serverpowermanager;

import lombok.Getter;

public enum ShutdownCommander {
    SHUTDOWN("shutdown -P "), RESTART("shutdown -r "), WAKE("WAKE");

    ShutdownCommander(String command) {
        this.command = command;
    }

    @Getter
    private String command;
}
