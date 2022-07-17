package control;

import Logic.Dish;
import Logic.Management;
import persistence.FileDish;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ControllerDish {
    private Management<Dish> management;
    private FileDish file;

    public ControllerDish() {

        management = new Management<>((d1,d2)->d1.getIdDish().compareTo(d2.getIdDish()));
        file = new FileDish();
        load();
    }


    /***
     * Método que permite agregar un nuevo plato al sistema
     * @param data Datos que se van a agrgar (arreglo)
     * @return verdadero o falso dependiendo del resultado de si se agrega o no (id repetido)
     */
    public boolean addDish(String ... data ){

        String id = data[0];
        String name = data[1];
        boolean isVegetarian = data[2].equals("SI") ? true : false;
        int calories = Integer.parseInt(data[3]);
        double value = Double.parseDouble(data[4]);

        Dish dish = new Dish( id,name,isVegetarian,calories,value);

        return management.addObject( dish );
    }

    public String[][] sortDish( int field ){
        Comparator<Dish> comparator = null;

        switch( field ){
            case 0 : comparator = (d1,d2)->d1.getIdDish().compareTo( d2.getIdDish());
            break;

            case 1 : comparator = (d1,d2)->d1.getName().compareTo( d2.getName());
            break;

            case 2 : comparator = (d1,d2)-> Integer.compare( d1.getCalories(), d2.getCalories());
            break;

            default: comparator = (d1,d2)-> Double.compare( d1.getValue(),d2.getValue());
        }

        List<Dish> list = management.sortObject( comparator );

        String[][] data = new String[ list.size()][5];

        int cont = 0;
        for ( Dish dish : list ){
            data[cont][0] = dish.getIdDish();
            data[cont][1] = dish.getName();
            data[cont][2] = dish.isVegetarian() ? "SI" : "NO";
            data[cont][3] = Integer.toString( dish.getCalories());
            data[cont++][4] = Double.toString( dish.getValue());
        }

        return data;
    }

    public String[] findDish( String id ){
        Dish dish = management.findObject( new Dish(id,null,false,0,0.0));
        if( dish != null ){
            return new String[]{dish.getIdDish(),dish.getName(),dish.isVegetarian() ? "SI" : "NO", Integer.toString( dish.getCalories()) , Double.toString(dish.getValue())};
        }

        return null;
    }

    public String[] deleteDish(String id){
        if ( management.findObject( new Dish(id,null,false,0,0.0)) != null ){
            Dish dish = management.deleteObject( management.findObject(new Dish(id,null,false, 0,0.0) ) );

            return new String[]{dish.getIdDish(),dish.getName(),dish.isVegetarian() ? "SI" : "NO", Integer.toString( dish.getCalories()),Double.toString( dish.getValue())};
        }

        return null;
    }

    public void dump(){
        try {
            file.dump( management.getObjects());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void load(){
        List<Dish> dishes = null;

        try {
            dishes = file.load();
            for( Dish dish : dishes ){
                management.addObject( dish );
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
