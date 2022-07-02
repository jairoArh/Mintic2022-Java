package run;

import logic.*;

public class Runner {
    public static void main(String[] args) {
        Terrestre gatico = new Terrestre("Mimi", "Café con Negro", (byte) 4, true, false);
        Acuatico delfin = new Acuatico("Flipper", "Rosado", (byte) 2, false, "De agua salada o dulce");
        Ave loro = new Ave("Roberto", "Verde", (byte) 2, true);

        Humano lola = new Humano("Dolores Perez");

        System.out.println("Terrestre " + gatico.mamar());
        System.out.println("Acuatico " + delfin.mamar());

        printSer(gatico);
        printSer(delfin);
        printSer(loro);
        printSer(lola);

    }

    static void printSer(AccionesSeresVivos ser ) {
        System.out.println( ser.toString());
        System.out.printf("Respirar=%s\nDesplazar=%s\nHablar=%s\n\n",ser.respirar(),ser.desplazar(),ser.hablar());

    }

}

