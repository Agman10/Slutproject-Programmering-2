import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * databas information
 */
public class server{
    public static final String DEFAULT_DRIVER_CLASS = "com.mysql.jdbc.Driver";
    public static String hostname = "localhost";
    public static String dbName = "Chatt";
    public static int port = 3306;
    public static final String DEFAULT_URL = "jdbc:mysql://"+ hostname +":"+ port +"/"+ dbName;
    private static final String DEFAULT_USERNAME = "null";
    private static final String DEFAULT_PASSWORD = "null";


    public static void main(String[] args) {
        Connection connection = null;

        try {
            Class.forName(DEFAULT_DRIVER_CLASS);
            connection = DriverManager.getConnection(DEFAULT_URL, DEFAULT_USERNAME, DEFAULT_PASSWORD);

            // SQL queries goes here
            PreparedStatement ps = null;
            ResultSet rs = null;
            ps = connection.prepareStatement("SELECT * FROM table");
            rs = ps.executeQuery();

            while (rs.next()) {
                String firstName = rs.getString("Fname");
                String address = rs.getString("Address");
                System.out.println(firstName + " , " + address);
            }

        } catch (SQLException e) {
            System.err.println(e.getMessage());
        } catch (Exception e) {

        }
    }
}

