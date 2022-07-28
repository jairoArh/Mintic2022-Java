package runner;

import persistence.DishDAO;

import javax.swing.*;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Runner {
    public static void main(String[] args) {
        DishDAO dao = new DishDAO();
        ResultSet rs = dao.getDishes();
        try{
            rs = dao.getDishes();
            while( rs.next()){
                System.out.printf("%d\t%s\t%d\t%s\t%.2f\n",rs.getInt(1),rs.getString(2),rs.getInt(3),rs.getString(4), rs.getFloat(5));
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }finally {
            dao.close();
        }

        dao = new DishDAO();

        String name = JOptionPane.showInputDialog("Nombre del Plato");
        String calories = JOptionPane.showInputDialog("Calorias");
        String isVegetarian = JOptionPane.showInputDialog("Vegetariano [T/F]?");
        String value = JOptionPane.showInputDialog("Valor");

        String[] data = {"0",name,calories,isVegetarian,value};
        dao.addDish( data );

        dao.close();

    }
}
