package com.glqdlt.serverpowermanager;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

@Component
@Slf4j
public class WakeOnLanExecutor {

    /**
     *
     * @param host  브로드캐스팅에 사용 될 ip 대역  ex) 192.168.0.255
     * @param macAddress
     */
    public void execute(String host, String macAddress) {
        DatagramSocket socket = null;
        try {
            byte[] macBytes = getMacBytes(macAddress);
            byte[] bytes = new byte[6 + 16 * macBytes.length];
            for (int i = 0; i < 6; i++) {
                bytes[i] = (byte) 0xff;
            }
            for (int i = 6; i < bytes.length; i += macBytes.length) {
                System.arraycopy(macBytes, 0, bytes, i, macBytes.length);
            }

            InetAddress address = InetAddress.getByName(host);
            DatagramPacket packet = new DatagramPacket(bytes, bytes.length, address, 9);
            socket = new DatagramSocket();
            socket.send(packet);

            log.info("Send packet.");
        } catch (Exception e) {
            log.error("Some Exception", e);
//            System.exit(1);
        } finally {
            if (socket != null) {
                socket.close();
            }
        }
    }

    private byte[] getMacBytes(String macStr) {
        byte[] bytes = new byte[6];
        String[] hex = macStr.split("(\\:|\\-)");
        if (hex.length != 6) {
            throw new IllegalArgumentException("Invalid MAC address.");
        }
        try {
            for (int i = 0; i < 6; i++) {
                bytes[i] = (byte) Integer.parseInt(hex[i], 16);
            }
        } catch (NumberFormatException e) {
            log.error("Wrong Mac Address", e);
            System.exit(1);
        }
        return bytes;
    }
}
