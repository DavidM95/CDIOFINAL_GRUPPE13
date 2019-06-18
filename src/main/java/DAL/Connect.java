package DAL;

import javax.inject.Singleton;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

@Singleton
public class Connect implements IConnect {
    private final String url = "jdbc:mysql://ec2-52-30-211-3.eu-west-1.compute.amazonaws.com/s160601?";
    private final String userName = "user=s160601";
    private final String pass = "password=t08HP36o2H0HGQzFhf4qo";
    private String databaseURL = "jdbc:mysql://ec2-52-30-211-3.eu-west-1.compute.amazonaws.com/s160601?user=s160601&password=ax1hqY3DBtPNqRcsvMGAy";
    private static Connection connection;

    private static  Connect instance = null;

    public static Connect getInstance(){
        if(instance == null) {
            instance = new Connect();
        }
        return instance;
    }





    @Override
    public Connection createConnection() throws SQLException {
        if (connection == null) {
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                connection = DriverManager.getConnection(url + userName + "&" + pass);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return connection;
    }

/*    public Connection getConnection() {
        return connection;
    }*/

    public void closeConnection() throws SQLException {
        if (connection != null) {
            try {
                connection.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
