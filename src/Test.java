import java.util.Scanner;
import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

class Test {
    public static void main(String args[]) throws SQLException {

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


        /*byte x = (byte) 95;
        byte y = (byte) 143;

        //c = a & b
        int value = (x<<8)|y;

        System.out.println(Integer.toBinaryString(value) + " ,x: " + Integer.toBinaryString((byte)(value >> 8))
         + ", y: " + Integer.toBinaryString((byte) value));*/
    }
}