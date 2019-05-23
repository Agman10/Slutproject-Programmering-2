import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.MulticastSocket;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {
    private ServerSocket servSock;

    /**
     *
     * @param port connectar till porten
     */
    public void start(int port) {
        try {
            servSock = new ServerSocket(port);
            while (true) {
                System.out.println("Någon har connectat");
                new EchoClientHandler(servSock.accept()).start();
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            stop();
        }

    }

    /**
     * stoppar
     */
    public void stop() {
        try {
            servSock.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    /**
     *
     */
    private static class EchoClientHandler extends Thread {
        private Socket clientSocket;
        private PrintWriter out;
        private BufferedReader in;

        public EchoClientHandler(Socket socket) {
            this.clientSocket = socket;
        }

        /**
         * kör programmet
         */
        public void run() {
            try {
                out = new PrintWriter(clientSocket.getOutputStream(), true);
                in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
                String inputLine;
                while ((inputLine = in.readLine()) != null) {
                    System.out.println(inputLine);
                    out.println(inputLine);
                }

                in.close();
                out.close();
                clientSocket.close();

            } catch (IOException e) {
            }
        }
    }

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        Server server = new Server();
        System.out.println("Startar servern");
        server.start(3000);
    }
}

