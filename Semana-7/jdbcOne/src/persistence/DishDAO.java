package persistence;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DishDAO {
    private ConnectDB connectDB;

    public DishDAO() {
        connectDB = new ConnectDB();
    }

    public ResultSet getDishes(){
        String query = "SELECT * FROM dish";

        if( connectDB.setConnect( ) ){
            try {
                Statement statement = connectDB.getConnection().createStatement();
                ResultSet rs = statement.executeQuery( query );

                return rs;
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        return null;
    }

    public ResultSet getDish( int id ){
        //SELECT * FROM dish WHERE id = '1';
        String query = "SELECT * FROM dish WHERE id = '" + Integer.toString( id ) + "';";

        if( connectDB.setConnect( ) ){
            try {
                Statement statement = connectDB.getConnection().createStatement();
                ResultSet rs = statement.executeQuery( query );

                return rs;
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        return null;
    }

    public int addDish( String ... data ){
        //INSERT INTO dish VALUES('0','Caldo de Papas','T',350,'12000');

        String query = "INSERT INTO dish values('" + data[0] + "','" +
                data[1]+"','" + data[2] + "','" + data[3] + "','" + data[4] + "');";

        if( connectDB.setConnect( ) ){
            try {
                Statement statement = connectDB.getConnection().createStatement();

                return statement.executeUpdate( query );
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        return 0;
    }

    public int deleteDish( int id ){

        String query = "DELETE FROM dish WHERE id='" + Integer.toString( id ) + "';";

        if( connectDB.setConnect( ) ){
            try {
                Statement statement = connectDB.getConnection().createStatement();

                return statement.executeUpdate( query );
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        return 0;
    }

    public int updateDish( String ... data ){

        return 0;
    }

    public void close(){
        connectDB.close();
    }
}
