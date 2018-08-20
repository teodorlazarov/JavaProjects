import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class ThreadedServer {
    public static void main(String[] args) {
        try {
            ServerSocket server = new ServerSocket(9090);
            boolean running = true;
            while (running){
                System.out.println("Waiting for clients...");
                Socket socket = server.accept();
                System.out.println("Connected!");
                ThreadedClient theclient = new ThreadedClient(socket);
                theclient.start();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
