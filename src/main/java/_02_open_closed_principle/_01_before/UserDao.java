package _02_open_closed_principle._01_before;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;


//해당 어플리케이션을 제공해야할 곳이 여러 곳이라면 개발자는
// UserDao를 제공할 곳에 맞게 커넥션 연결에 대한 정보를 수정해야 한다.
// 위와 같은 코드는 확장하기 좋지 않은 코드이다. 상속을 통해 코드를 확장할 수 있다.
public class UserDao {
    private static final String MYSQL_DRIVER = "com.mysql.jdbc.Driver";
    private static final String DB_URL = "jdbc:mysql://localhost:13306/tobi?useSSL=false";
    private static final String DB_USER = "root";
    private static final String DB_PASS = "masterpw";

    public int add(User user) throws ClassNotFoundException, SQLException {
        Class.forName(MYSQL_DRIVER);
        String query = "insert into users(id, name, password) values (?,?,?)";
        Connection conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASS);
        PreparedStatement ps = conn.prepareStatement(query);

        try (conn; ps) {
            ps.setLong(1, user.getId());
            ps.setString(2, user.getName());
            ps.setString(3, user.getPassword());

            return ps.executeUpdate();
        }
    }
}
