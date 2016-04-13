package com.thibaultclem.example.websocket;

import javax.websocket.*;
import javax.websocket.server.ServerEndpoint;

/**
 * Created by thibaultclement on 13/04/16.
 */

@ServerEndpoint("/actions") //Declare the server endpoint
public class DeviceWebSocketServer {

    @OnOpen // Called once new connection is established
    public void open(Session session) {
    }

    @OnClose // Called once new connection is established
    public void close(Session session) {
    }

    @OnError // Called once Exception is being thrown by any method annotated with @OnOpen, @OnMessage and @OnClose
    public void onError(Throwable error) {
    }

    @OnMessage // Called once new message is received
    public void handleMessage(String message, Session session) {
    }

}
