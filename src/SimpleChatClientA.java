import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class SimpleChatClientA {

    PrintWriter writer;
    BufferedReader reader;
    Socket sock;

    void go() throws IOException {
        setUpNetworking();
        InputStreamReader streamReader = new InputStreamReader(sock.getInputStream());
        reader = new BufferedReader(streamReader);
        writer = new PrintWriter(sock.getOutputStream());
        writer.write("hello from client N1");
        Thread reedThread = new Thread(new IncomingReader());
        reedThread.start();
    }

    void setUpNetworking() {
        try {
            sock = new Socket("127.0.0.1", 5000);
            System.out.println("networking established");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public class IncomingReader implements Runnable {
        public void run() {
            String message;
            try {
                while ((message = reader.readLine()) != null) {
                    System.out.println("read Server's message: " + message);
                }
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
    }
    public static void main(String[] args) throws IOException {
        new SimpleChatClientA().go();
    }

}
