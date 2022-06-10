package _02_open_closed_principle._02_after;

import _02_open_closed_principle._01_before.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UserDao {
    private final ConnectionMaker connectionMaker;

    public UserDao(ConnectionMaker connectionMaker) {
        this.connectionMaker = connectionMaker;
    }

    public int add(User user) throws SQLException, ClassNotFoundException {
        Connection conn = connectionMaker.makeConnection();
        String query = "insert into users(id, name, password) values (?,?,?)";
        PreparedStatement ps = conn.prepareStatement(query);

        try (conn; ps) {
            ps.setLong(1, user.getId());
            ps.setString(2, user.getName());
            ps.setString(3, user.getPassword());

            return ps.executeUpdate();
        }
    }
}
