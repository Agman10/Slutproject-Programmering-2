import java.lang.reflect.Executable;
import java.sql.*;

/**
 *
 *
 * DEFAULT_URL string för att ansluta chatt appen till databasen
 *
 */
public class Database {
    public static final String DEFAULT_DRIVER_CLASS = "com.mysql.jdbc.Driver";
    public static String hostname = "localhost";
    public static String dbName = "Chatt";
    public static int port = 3306;
    public static final String DEFAULT_URL = "jdbc:mysql://" + hostname + ":" + port + "/" + dbName;
    private static final String DEFAULT_USERNAME = "null";
    private static final String DEFAULT_PASSWORD = "null";

    Connection connection = null;

    /**
     * connection ansluter url och användernamnen och lösenordet
     */
    public Database() {
        try {
            Class.forName(DEFAULT_DRIVER_CLASS);
            connection = DriverManager.getConnection(DEFAULT_URL, DEFAULT_USERNAME, DEFAULT_PASSWORD);
        } catch(Exception e){

        }
    }

    /**
     *
     * @param values värderna som man columnerna på alla tables används för att ta den från databasen
     * @param columns colmnerna som hittas i tabels
     * @param tables tables där man har columnen
     * @throws SQLException
     *
     * rs.getString("username") används för att få användarnamnet från databasen
     *
     *
     */
    public void insert(String values, String columns, String tables) throws SQLException {

        // SQL queries goes here
        PreparedStatement ps;
        ResultSet rs;
        ps = connection.prepareStatement("SELECT * FROM User where id = 1");
        rs = ps.executeQuery();
/**
 *
 */
        while (rs.next()) {
            user = new user(rs.getInt("id"), rs.getString("username"));


            String username = rs.getString("username");
            String password = rs.getString("password");
            System.out.println(username + " , " + password);
        }

    /*} catch(SQLException e){
        System.err.println(e.getMessage());
    } catch(Exception e){
*/
        }
}
