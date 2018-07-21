package com.glqdlt.serverpowermanager;

import com.jcraft.jsch.Channel;
import com.jcraft.jsch.ChannelExec;
import com.jcraft.jsch.JSch;
import com.jcraft.jsch.Session;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;

@Slf4j
@Component
public class ShutdownExecutor {

    public void exec(String userId, String userPw, String host, Integer port, String rootPw, ShutdownCommander command, Integer timer) {
        try {
            java.util.Properties config = new java.util.Properties();
            config.put("StrictHostKeyChecking", "no");
            JSch jsch = new JSch();
            Session session = jsch.getSession(userId, host, port);
            session.setPassword(userPw);
            session.setConfig(config);
            session.connect();

            log.info("Connected ==> " + userId + "@" + host);

            Channel channel = session.openChannel("exec");
            ((ChannelExec) channel).setPty(true);
            ((ChannelExec) channel).setCommand("sudo -S -p '' " + command.getCommand() + timer);
            channel.setInputStream(null);
            ((ChannelExec) channel).setErrStream(System.err);

            try (InputStream in = channel.getInputStream();
                 OutputStream outputStream = channel.getOutputStream()) {

                channel.connect();
                outputStream.write((rootPw + "\n").getBytes());
                outputStream.flush();

                BufferedReader reader = new BufferedReader(new InputStreamReader(in));
                String line;

                while ((line = reader.readLine()) != null) {
//                    log.info(line);
                }
            } finally {
                channel.disconnect();
                session.disconnect();

                log.info("Disconnected ==> " + userId + "@" + host);

            }
        } catch (Exception e) {
            log.error(e.getMessage(), e);
        }
    }
}
