package persistence;

import Logic.Dish;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public class FileDish {

    public void dump(ArrayList<Dish> data) throws IOException {
        FileWriter output = new FileWriter("resources/files/dishes.json");

        Gson jsonPretty = new GsonBuilder().setPrettyPrinting().create();

        String dataFile = jsonPretty.toJson( data );

        output.write( dataFile );

        output.close();
    }

    public List<Dish> load() throws IOException {

        FileReader input = new FileReader("resources/files/dishes.json");

        Type typeList = new TypeToken<List<Dish>>(){}.getType();
        List<Dish>  dishes = new Gson().fromJson(input, typeList );

        input.close();

        return dishes;
    }
}
