package com.glqdlt.myhome.webapp.controller.api.power;

import com.glqdlt.myhome.webapp.service.power.PowerService;
import com.glqdlt.serverpowermanager.ShutdownCommander;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RequestMapping("/api/server/{server}")
@RestController
public class PowerRestController {

    @Autowired
    PowerService powerService;

    @GetMapping("/remote/{command}")
    public ResponseEntity shutdownSystem(@PathVariable String server, @PathVariable String command) {

        ShutdownCommander shutdownCommander = null;
        if (command.toUpperCase().equals(ShutdownCommander.SHUTDOWN.name())) {
            shutdownCommander = ShutdownCommander.SHUTDOWN;
            powerService.remoteExecute(server, shutdownCommander, 0);
        } else if (command.toUpperCase().equals(ShutdownCommander.RESTART.name())) {
            shutdownCommander = ShutdownCommander.RESTART;
            powerService.remoteExecute(server, shutdownCommander, 0);
        } else if (command.toUpperCase().equals("WAKE")) {
            powerService.wakeOnSystem(server);
        }

        return new ResponseEntity(HttpStatus.OK);
    }
}
