import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCConnect {
    public static Connection getJDBCConnection(){
        final String url = "jdbc:mysql://localhost:3306/qlstudent";
        final String username = "root";
        final String password = "1234";
        try {
            Class.forName("com.mysql.jdbc.Driver");
            return DriverManager.getConnection(url,username,password);
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

}
