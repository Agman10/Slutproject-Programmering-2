import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 * namnen på värde från tables
 */
public class client {
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
    private final int port;
    private final String host;
    public String username = null;
    public String password = null;



    public int id = 0;

    public final String tableUser = username + password + id;


    public static void main(String[] args) throws IOException {
        //new Client("127.0.0.1", 3306).run();
        System.out.println("username");

    }

    /**
     *
     * @param host det är var servern hostas (localhost)
     * @param port porten som den connectas till (3306)
     */
    public client(String host, int port){
            this.host = host;
            this.port = port;
            System.out.println(host);
        }

    public void run() throws IOException {

        Socket client = new Socket(host, port);


    }

}