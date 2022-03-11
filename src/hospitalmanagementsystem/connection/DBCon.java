package hospitalmanagementsystem.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBCon {
    public static Connection getConnection(){
        Connection con = null;
        String url = "jdbc:mysql://localhost:3306/hms";
        String username = "root";
        String password = "root";
        try {
            con = DriverManager.getConnection(url, username, password);
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return con;
    }
}
