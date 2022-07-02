package run;

import logic.*;

public class Runner {
    public static void main(String[] args) {
        Terrestre gatico = new Terrestre("Mimi","Café con Negro",(byte)4,true,false);
        Acuatico delfin = new Acuatico("Flipper","Rosado",(byte)2,false,"De agua salada o dulce");
        Ave loro = new Ave("Roberto","Verde",(byte)2,true);

        System.out.println( "Terrestre " + gatico.mamar());
        System.out.println( "Acuatico " + delfin.mamar());

        printAnimal( gatico );
        printAnimal( delfin );
        printAnimal( loro );

        System.out.println( gatico );


    }

    static void printAnimal(Animal animal ){


    }

