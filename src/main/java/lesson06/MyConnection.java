package lesson06;
import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

public class MyConnection {

    private static Connection connection;

    public static Connection getConnection(DataSource dataSource) {
        try {
            connection = dataSource.getConnection();
        } catch (SQLException e) {
            throw new IllegalArgumentException(e);
        }
        return connection;
    }
}