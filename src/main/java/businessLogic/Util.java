package businessLogic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Util {

    private static final String DB_DRIVER = "org.h2.Driver";
    private static final String DB_URL = "jdbc:h2:~/test";
    private static final String DB_USERNAME = "sa";
    private static final String DB_PASSWORD = "";

    //Метод, который вернет нам connection
    public Connection getConnection() {
        Connection connection = null;
        try {
            Class.forName(DB_DRIVER);
            //установим соединение с помощью драйвер менеджера
            connection = DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);
            //чтобы мы видили, что connection установлен выведем message
            System.out.println("Connection OK");
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
            System.out.println("Connection ERROR");
        }
        return connection;
    }

}
