import java.lang.reflect.Executable;
import java.sql.*;
public class Database {
    public static final String DEFAULT_DRIVER_CLASS = "com.mysql.jdbc.Driver";
    public static String hostname = "localhost";
    public static String dbName = "Chatt";
    public static int port = 3306;
    public static final String DEFAULT_URL = "jdbc:mysql://" + hostname + ":" + port + "/" + dbName;
    private static final String DEFAULT_USERNAME = "null";
    private static final String DEFAULT_PASSWORD = "null";

    Connection connection = null;

    public Database() {
        try {
            Class.forName(DEFAULT_DRIVER_CLASS);
            connection = DriverManager.getConnection(DEFAULT_URL, DEFAULT_USERNAME, DEFAULT_PASSWORD);
        } catch(Exception e){

        }
    }

    public void insert(String values, String columns, String tables) throws SQLException {

        // SQL queries goes here
        PreparedStatement ps;
        ResultSet rs;
        ps = connection.prepareStatement("SELECT * FROM User where id = 1");
        rs = ps.executeQuery();

        while (rs.next()) {
            String username = rs.getString("username");
            String password = rs.getString("password");
            System.out.println(username + " , " + password);
        }

    } catch(SQLException e){
        System.err.println(e.getMessage());
    } catch(Exception e){
        
        }
}
