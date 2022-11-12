import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class SimpleChatClientA {

    void go() throws IOException {
        Socket sock = new Socket("127.0.0.1", 5000);
        System.out.println("networking established");

        InputStreamReader streamReader = new InputStreamReader(sock.getInputStream());
        PrintWriter writer = new PrintWriter(sock.getOutputStream());
        writer.println("hello from client N1 to Server");
        writer.flush();
        System.out.println("We sent message to server");

        BufferedReader reader = new BufferedReader(streamReader);
        String message;
        while ((message = reader.readLine()) != null) {
            System.out.println("We got message from server");
            System.out.println("read Server's message: " + message);
        }
    }

    public static void main(String[] args) throws IOException {
        new SimpleChatClientA().go();
    }

}
