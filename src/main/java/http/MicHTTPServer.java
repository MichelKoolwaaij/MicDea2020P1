package http;

import java.io.IOException;
import java.net.ServerSocket;

/**
 * Created by Michel Koolwaaij on 09-09-20.
 */
public class MicHTTPServer {
    private int tcpPort;

    public MicHTTPServer(int tcpPort) {
        this.tcpPort = tcpPort;
    }

    public void startServer() {
        try (
                ServerSocket serverSocket = new ServerSocket(this.tcpPort);
        ) {
            System.out.println("Server accepting requests on port " + tcpPort);
            new ConnectionHandler(serverSocket.accept()).handle();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

