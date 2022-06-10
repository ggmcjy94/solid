package _02_open_closed_principle._02_after;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class BConnectionMaker implements ConnectionMaker{


    private static final String MYSQL_DRIVER = "com.mysql.jdbc.Driver";
    private static final String DB_URL = "jdbc:mysql://localhost:13306/tobi?useSSL=false";
    private static final String DB_USER = "buser";
    private static final String DB_PASS = "bpass";

    @Override
    public Connection makeConnection() throws ClassNotFoundException, SQLException {
        Class.forName(MYSQL_DRIVER);
        return DriverManager.getConnection(DB_URL, DB_USER, DB_PASS);
    }
}
