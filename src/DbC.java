import java.sql.Connection;
import java.sql.DriverManager;


public class DbC {
    static Connection conn = null;
    public static Connection connect(){
        try {
            String url = "jdbc:mysql://localhost:3306/employee";
            String usrnm = "root";
            String paswrd = "@HelloRaj003";
            conn = DriverManager.getConnection(url, usrnm, paswrd);

        } catch (Exception e) {
            e.printStackTrace();
        }
        return conn;
    }
}
