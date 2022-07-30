package persistence;

import logic.Dish;

import java.sql.*;
import java.util.ArrayList;

public class DishDAOImpl implements DishDAO{
    private final String DRIVER = "com.mysql.cj.jdbc.Driver";
    private final String URL = "jdbc:mysql://localhost/menu";
    private final String USER = "userMintic";
    private final String PASSWORD = "mintic123";

    @Override
    public int addDish(Dish dish) {

        try(Connection connection = DriverManager.getConnection( URL,USER,PASSWORD)){
            Statement statement = connection.createStatement();
            String id = Integer.toString( dish.getId());
            String name = dish.getName();
            String calories = Short.toString( dish.getCalories());
            String isVegetarian = dish.isVegetarian() ? "T" : "F";
            String price = Double.toString( dish.getPrice());

            String query = "INSERT INTO dish VALUES('" + id + "','" + name + "','" + calories + "','" + isVegetarian + "" +
                    "','" + price + "')";

            return statement.executeUpdate( query );

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

        return 0;
    }

    @Override
    public int updateDish(Dish dish) {
        try(Connection connection = DriverManager.getConnection( URL,USER,PASSWORD)){
            Statement statement = connection.createStatement();

            String id = Integer.toString( dish.getId());
            String name = dish.getName();
            String calories = Short.toString( dish.getCalories());
            String isVegetarian = dish.isVegetarian() ? "T" : "F";
            String price = Double.toString( dish.getPrice());

            String query = "UPDATE dish SET name='" + name + "',calories='" + calories + "',is_vegetarian='" + isVegetarian + "" +
                    "',price='" + price + "' WHERE id='" + id + "'" ;

            return statement.executeUpdate( query );

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }


        return 0;
    }

    @Override
    public int deleteDish(int id) {
        try(Connection connection = DriverManager.getConnection( URL,USER,PASSWORD)){
            Statement statement = connection.createStatement();

            String query = "DELETE FROM dish WHERE id='" + id + "'";

            return statement.executeUpdate( query );

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }


        return 0;
    }

    @Override
    public Dish findById(int id) {
        try(Connection connection = DriverManager.getConnection( URL,USER,PASSWORD)){
            Statement statement = connection.createStatement();

            String query = "SELECT * FROM dish WHERE id='" + id + "'";

            ResultSet rs = statement.executeQuery( query );

            rs.next();

            int idDish = rs.getInt( 1 );
            String name = rs.getString( 2 );
            short calories = (short) rs.getInt( 3 );
            boolean isVegetarian = rs.getString( 4 ).equals("T") ? true :  false;
            double priice = rs.getDouble( 5 );

            return new Dish(idDish,name,calories,isVegetarian,priice );

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

        return null;
    }

    @Override
    public ArrayList<Dish> getAllDishes() {
        try(Connection connection = DriverManager.getConnection( URL,USER,PASSWORD)){
            Statement statement = connection.createStatement();

            String query = "SELECT * FROM dish";
            ArrayList<Dish> data = new ArrayList<>();

            ResultSet rs = statement.executeQuery( query );
            while( rs.next()){
                int idDish = rs.getInt( 1 );
                String name = rs.getString( 2 );
                short calories = (short) rs.getInt( 3 );
                boolean isVegetarian = rs.getString( 4 ).equals("T") ? true :  false;
                double priice = rs.getDouble( 5 );

                data.add( new Dish(idDish,name,calories,isVegetarian,priice ) );
            }

            return data;

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

        return null;
    }

    @Override
    public void close() throws Exception {

    }
}
