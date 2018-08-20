import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class ThreadedClient extends Thread {

    private Socket socket;

    public ThreadedClient(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
        try {
            PrintWriter pw = new PrintWriter(socket.getOutputStream(), true);
            pw.println("Hello there!");
            BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            String message = br.readLine();
            System.out.println(message);
            br.close();
            pw.close();
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
