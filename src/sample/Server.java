package sample;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by 100554446 on 3/24/2016.
 */
public class Server {

    public static final int PORT = 8080;


    public static void main(String[] args) {

        try {
            ServerSocket serverSock = new ServerSocket(PORT);
            Socket socket = serverSock.accept();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }

}
