package http;

import java.io.*;
import java.net.Socket;
import java.nio.charset.StandardCharsets;

/**
 * Created by Michel Koolwaaij on 09-09-20.
 */
public class ConnectionHandler {
    private static final String HTTP_HEADER = "HTTP/1.1 200 OK\n" +
            "Date: Mon, 14 Sep 2020 14:15:00 +0200\n" +
            "HttpServer: My first DEA Webserver\n" +
            "Content-Length: 120\n" +
            "Content-Type: text/html\n";

    private static final String HTTP_BODY = "<!DOCTYPE html>\n" +
            "<html>\n" +
            "<body>\n" +
            "<h1>Wow. Cool web pages in DEA!</h1>\n" +
            "<p>This is really state of the art stuff</p>\n" +
            "</body>\n" +
            "</html>\n" +
            "\n";

    private Socket socket;

    public ConnectionHandler(Socket socket) {
        this.socket = socket;
        handle();
    }

    public void handle() {
        try {
            BufferedReader inputStreamReader = new BufferedReader(
                    new InputStreamReader(socket.getInputStream(), StandardCharsets.US_ASCII));
            BufferedWriter outputStreamWriter = new BufferedWriter(
                    new OutputStreamWriter(socket.getOutputStream(), StandardCharsets.US_ASCII));
            String requestLine;
            while ((requestLine = inputStreamReader.readLine()) != null) {
                System.out.println(requestLine);
                if (lineMarksEndOfRequest(requestLine)) {
                    writeResponseMessage(outputStreamWriter);
                    break;
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    private void writeResponseMessage(BufferedWriter outputStreamWriter) {
        try {
            outputStreamWriter.write(HTTP_HEADER);
            outputStreamWriter.newLine();
            outputStreamWriter.write(HTTP_BODY);
            outputStreamWriter.newLine();
            outputStreamWriter.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    private boolean lineMarksEndOfRequest(String line) {
        return line.isEmpty();
    }

}

