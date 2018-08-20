import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) {
        try {
            ServerSocket server = new ServerSocket(9090);
            System.out.println("Waiting for client...");
            boolean running = true;
            while (running) {
                Socket socket = server.accept();
                PrintWriter pw = new PrintWriter(socket.getOutputStream(), true);
                pw.println("Hello there!");
                BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                String message = br.readLine();
                System.out.println(message);
                br.close();
                pw.close();
                socket.close();
            }
            server.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
