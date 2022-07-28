package persistence;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectDB {

    private final String DRIVER = "com.mysql.cj.jdbc.Driver";

    private final String URL = "jdbc:mysql://localhost/menu";

    private final String USER = "userMintic";

    private final String PASSWORD = "mintic123";

    private Connection connection;

    public boolean setConnect(){
        boolean state = false;
        try{
            Class.forName( DRIVER );
            connection = DriverManager.getConnection( URL, USER, PASSWORD );

            state = true;
        }catch( ClassNotFoundException e){
            e.printStackTrace();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

        return state;
    }

    public Connection getConnection() {
        return connection;
    }

    public void close(){
        try {
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
