package advance_java_login;


import java.sql.Connection;
import java.sql.DriverManager;

public class DBUtil {
    public static Connection mySQLdbConnection()
    {
        String driverClassName = "com.mysql.cj.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/zensar_training";
        String dbUserName = "root";
        String dbPassword = "@Simran22";
        Connection con = null;
        try {
            Class.forName(driverClassName);
            con = DriverManager.getConnection(url, dbUserName, dbPassword);

        }catch(Exception e) {
            System.out.println("Exception while creating db connection:"+e);
        }
        return con;
    }
}
