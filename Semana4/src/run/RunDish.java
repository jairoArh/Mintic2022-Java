package run;

import Logic.Dish;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import gui.DishWindow;

import java.io.*;
import java.lang.reflect.Type;
import java.util.List;

public class RunDish {
    public static void main(String[] args) {
        DishWindow dishWindow = new DishWindow();
        dishWindow.begin();
        dishWindow.setVisible( true );

        /*Gson jsonPretty = new GsonBuilder().setPrettyPrinting().create();

        Dish chiken = new Dish("2342","Pollo a la Cazadora",false,240,25000);

        List<Dish> list = List.of(new Dish("2342","Pollo a la Cazadora",false,240,25000),
                new Dish("6545","Taco al Pastor",false,240,15000),
                new Dish("7467","Pasta",true,80,12000),
                new Dish("8563","Pescado",false,250,32000));

        String chickJson = jsonPretty.toJson( list );

        //System.out.println( chickJson );

        try {
            FileWriter output = new FileWriter("resources/files/dishes.json");

            output.write( chickJson );

            output.close( );

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


        String aux = "[{\"idDish\":\"32563\",\"name\":\"Pollo a la Cazadora\",\"isVegetarian\":false,\"calories\":230,\"value\":20000}," +
                "{\"idDish\":\"876546\",\"name\":\"Bisteck a lo Pobre\",\"isVegetarian\":false,\"calories\":450,\"value\":30000}," +
                "{\"idDish\":\"635664\",\"name\":\"Pargo Rojo\",\"isVegetarian\":false,\"calories\":340,\"value\":40000}," +
                "{\"idDish\":\"11233\",\"name\":\"Pasta\",\"isVegetarian\":true,\"calories\":100,\"value\":10000}]";


        //Dish miDish = new Gson().fromJson(aux, Dish.class );

       //System.out.printf( "%s\n%s\n%ds\n%f\n",miDish.getIdDish(), miDish.getName(),miDish.getCalories(),miDish.getValue() );

        Type typeList = new TypeToken<List<Dish>>(){}.getType();
        List<Dish>  dishes = new Gson().fromJson(aux, typeList );

        dishes.forEach( System.out::println );*/

    }
}
