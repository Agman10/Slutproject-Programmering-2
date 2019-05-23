import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

/**
 *
 */
public class Client {
    private static Client client;
    private Socket clientSocket;
    private PrintWriter out;
    private BufferedReader in;
    Database username;

    /**
     *
     * @param ip tar anslutningen från public static void main
     * @param port tar porten
     */
    public void startConnection(String ip, int port) {
        try {
            clientSocket = new Socket(ip, port);
            out = new PrintWriter(clientSocket.getOutputStream(), true);
            in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
        } catch (IOException e) {
        }

    }

    /**
     *
     * @param msg printar ut medelandet
     * @return
     */
    public String sendMessage(String msg) {
        try {
            out.println(msg);
            return in.readLine();
        } catch (Exception e) {
            return null;
        }
    }

    /**
     * stoppar anslutningen
     */
    public void stopConnection() {
        try {
            in.close();
            out.close();
            clientSocket.close();
        } catch (IOException e) {
        }
    }

    /**
     * connectar clienten till servern
     * ip som startconnection använder skrivs här
     * @param args
     */
    public static void main(String[] args) {
        client = new Client();
        client.startConnection("localhost", 3000);
        System.out.println("Connected to server");
        Scanner in = new Scanner(System.in);
        String msgtToSend = in.nextLine();
        client.sendMessage(msgtToSend);
    }

        /*public static void awaitMsg(){
        Scanner scanner = new Scanner(System.in);
        String msg = scanner.nextLine();
        client.sendMessage(msg);
        awaitMsg();
    }*/
}













    /*String url = "jdbc:mysql://localhost:3306/javabase";
    String username = "java";
    String password = "password";

System.out.println("Connecting database...");

try (Connection connection = DriverManager.getConnection(url, username, password)) {
        System.out.println("Database connected!");
    } catch (SQLException e) {
        throw new IllegalStateException("Cannot connect the database!", e);
    }*/
    /**
     *
     */
    /*private final int port;
    private final String host;
    public String username = null;
    public String password = null;



    public int id = 0;

    public final String tableUser = username + password + id;*/

    /**
     *
     * @param args
     * @throws IOException
     */
    /*public static void main(String[] args) throws IOException {
        //new Client("127.0.0.1", 3306).run();

        String username;

        String password;

        String message;

        Scanner in = new Scanner(System.in);

        System.out.println("Enter your username");

        username = in.nextLine();

        System.out.println("You entered username: "+username);

        System.out.println("Enter your password");

        password = in.nextLine();

        System.out.println("logged in as " + username + " " + "with password " + password + " Now say someting");

        message = in.nextLine();

        System.out.println("<" + username + ">" + " " + message);





    }*/

    /**
     *
     * @param host det är var servern hostas (localhost)
     * @param port porten som den connectas till (3306)
     */
    /*public Client(String host, int port){
            this.host = host;
            this.port = port;
            System.out.println(host);
        }

    public void run() throws IOException {

        Socket Client = new Socket(host, port);


    }*/


    /**
     * A Java Scanner class example from http://alvinalexander.com
     */


//}