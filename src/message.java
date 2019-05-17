import java.io.*;
import java.net.*;

//läser användarens input och skickar den

/**
 * writer där skriver man sitt medelande, det skickas till databasen.
 */
public class message {
        private message writer;
        private Socket socket;
        private client client;

        public message(Socket socket, client client) {
            this.socket = socket;
            this.client = client;

            try {
                OutputStream output = socket.getOutputStream();
                writer = new message(output, true);
            } catch (IOException ex) {
                System.out.println("Error getting output stream: " + ex.getMessage());
                ex.printStackTrace();
            }
        }
}
