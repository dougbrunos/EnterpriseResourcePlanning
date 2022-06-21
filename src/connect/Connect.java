package connect;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author dougbruno
 */
public class Connect {

    public static Connection getConexao() {
        java.sql.Connection connection = null;
        String driver = "com.mysql.cj.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/erp";
        String user = "root";
        String password = "";

        try {
            Class.forName(driver);
            connection = DriverManager.getConnection(url, user, password);
            return connection;
        } catch (Exception e) {
            System.out.println("Connect ERROR " + e.getMessage());
            return null;
        }
    }

}
