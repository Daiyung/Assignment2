package sample;

import java.io.IOException;
import java.net.Socket;

/**
 * Created by 100554446 on 3/27/2016.
 */
public class Client {

    public static final String IP_ADDRESS = "127.0.0.1";
    public static final int PORT = 8080;

    public static void main(String[] args) {
        try {

            Socket socket = new Socket(IP_ADDRESS, PORT);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
