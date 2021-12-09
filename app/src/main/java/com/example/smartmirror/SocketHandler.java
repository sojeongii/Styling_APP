package com.example.smartmirror;

import java.io.IOException;
import java.net.Socket;

public class SocketHandler {
    private static Socket socket;
    private static String ip = "192.168.35.109";

    public static Socket getSocket(){
        return socket;
    }

    public static void setSocket(Socket socket){

        try {
            socket=new Socket(ip,9990);
        } catch (IOException e) {
            e.printStackTrace();
        }
        SocketHandler.socket = socket;
    }
}