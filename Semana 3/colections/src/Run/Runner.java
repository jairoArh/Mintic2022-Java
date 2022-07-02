package Run;

import model.Dish;
import model.Generic;
import model.Management;

import java.util.*;

public class Runner {
    private Management<Dish> mngDish;

    public Runner() {
        mngDish = new Management<>();
    }

    public static void main(String[] args) {
        Generic<Double> generic = new Generic<>(Math.PI);

        System.out.println( generic.getInfo());
        System.out.println(generic.getType());

        List<Character> caracters = List.of('3','D','2');

        //caracters.add('3');

        List<Integer> list = new ArrayList<>();

        list.add(235);
        list.add(64);
        list.add(17);
        list.add(75);
        list.add(84676);
        list.add(13);
        list.add(569);
        list.add(244);
        list.add(865);

        //Recorridos en una Colección
        //Tradicional

        for( int index = 0 ; index < list.size() ; index++ ){
            System.out.print( list.get(index) + "\t");
        }

        System.out.println();
        //for mejorado
        for( Integer number : list ){
            System.out.print( number + "\t");
        }


        System.out.println();
        //Operador lambda - Java 1.8 en adelante
        list.forEach( number ->  System.out.print( number + "\t"));

        System.out.println();

        list.sort( (x,y)->Integer.compare( x,y ) );

        System.out.println( list );

        /***
         * Colecciones de Objetos
         */

        List<Dish> dishs = new ArrayList<>();
        dishs.add(new Dish("543","Carne",false, 500,28_000));
        dishs.add(new Dish("654","Pollo",false, 360,19_000));
        dishs.add( new Dish("756","Pasta",true, 154,15_000));
        dishs.add(new Dish("968","Pescado",false, 400,38_000));
        dishs.add(new Dish("867","Frutas",true, 100,10_000));

        System.out.println( "Mamá".compareTo("Mintic"));

        dishs.sort( (d1,d2) -> Integer.compare( d1.getCalories(),d2.getCalories()) );

        dishs.forEach( System.out::println);

        /***
         * Mapas
         */

        HashMap<String,String> map = new HashMap<>();

        map.put("Verde","Green");
        map.put("Mesa","Table");
        map.put("Puerta","Door");
        map.put("Telefono","Phone");

        Set<String> set = map.keySet();

        Iterator<String> it = set.iterator();

        while( it.hasNext( ) ){
            String key = it.next();
            System.out.printf("Clave=%s - Valor=%s\n",key,map.get(key));
        }

        HashMap<String,Dish> mapDishs = new HashMap<>();

        mapDishs.put("543",new Dish("543","Carne",false, 500,28_000));
        mapDishs.put("654",new Dish("654","Pollo",false, 360,19_000));
        mapDishs.put("756",new Dish("756","Pasta",true, 154,15_000));
        mapDishs.put("968",new Dish("968","Pescado",false, 400,38_000));
        mapDishs.put("867",new Dish("867","Frutas",true, 100,10_000));

        System.out.println( mapDishs.get("654"));

        Scanner input = new Scanner(System.in);

        System.out.print("Digite El Id del Plato..: ");
        String id = input.nextLine();

        if( mapDishs.containsKey( id ) ){
            System.out.println(mapDishs.get(id));
        }else{
            System.out.println( "El Plato no Existe");
        }

        new Runner().handling();
    }

    /***
     * Método para la gestión de objetos
     */

    private void handling() {
        ArrayList<Dish> ds = mngDish.getObjects();
        System.out.println( mngDish.getObjects());
        ds.add( new Dish("999","Perro Caliente",false,300,12_000));
        System.out.println( mngDish.getObjects());
        System.out.println(ds);
    }
}
