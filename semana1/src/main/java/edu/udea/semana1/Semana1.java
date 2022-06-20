/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package edu.udea.semana1;

import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author jairoarmando
 */
public class Semana1 {

    public static void main(String... args) {

        /*
        String name = JOptionPane.showInputDialog("Dime tu nombre");
        
        System.out.println("Hola " + name + ", Como estas??");
         */
        /**
         * *
         * Tipos de Datos Tipos de datos primitivos (byte, short, int, long,
         * float, double, char, boolean)
         *
         * Clases que envuelven los datos primitivos (Wrapper) Byte, Short,
         * Integer, Long, Float, Double, Character
         */
        //b es una variable primitiva de tipo byte
        byte b = 120;

        byte num = (byte) 180;

        System.out.println(num);

        //b1 es un objeto de la clase Byte
        Byte b1 = (byte) 128;

        System.out.println("byteValue=" + b1.byteValue());

        //Menor de un byte
        System.out.println("El Menor valor de un byte es " + b1.MIN_VALUE);

        //Mayor valor de un Integer
        System.out.println("El Mayor valor de un int es " + Integer.MAX_VALUE);

        //Mayor valor de un Integer
        System.out.println("El Menor valor de un int es " + Integer.MIN_VALUE);

        //Mayor valor de un Long
        System.out.println("El Mayor valor de un int es " + Long.MAX_VALUE);

        //Mayor valor de un Long
        System.out.println("El Menor valor de un int es " + Long.MIN_VALUE);

        //Convertir de un String a un int
        //int number = Integer.parseInt(JOptionPane.showInputDialog("Digite Numero"));
        long l = 1234567890123456789l;

        //Valores decimales
        float f = (float) 233.5;

        var n = 4;

        var city = "Sogamoso";

        //System.out.println( Integer.valueOf(n) instance of Integer );
        //Literales Numéricos
        System.out.println("=============================literales Numericos==============");
        System.out.println(1_057_893_543);  // Visualiza 1057893543
        System.out.println(0b1010);         //Visualiza 10
        System.out.println(037);            //Visualiza 31 (37 en octal=31)
        System.out.println(0xff);           //Visualiza 255 (ff en hexadecimal=255)

        int nOne = 80;
        int nTwo = 40;

        nTwo += 10;  // nTwo = nTwo + 10;

        int result = nOne + nTwo / 2;

        //Especificadors de formato con printf
        System.out.printf("El numero %d en octal=%o en hexadecimal=%x\n", nOne, nOne, nOne);
        System.out.println();
        System.out.println("Linea vacía");

        System.out.printf("PI=[%10.2f]\n", Math.PI);  //Visualiza el valor de la constante PI en un ancho de 10 catacteres justificado a la derecha

        System.out.printf("PI=[%-10.2f]\n", Math.PI);  //Visualiza el valor de la constante PI en un ancho de 10 catacteres justificado a la izquierda

        System.out.printf("PI=[%010.2f]\n", Math.PI);  //Visualiza el valor de la constante PI en un ancho de 10 catacteres justificado a la derecha con ceros a la izquierda

        //Operadores Artitméticos
        System.out.printf("La suma de %d + %d = %d\n", nOne, nTwo, nOne + ++nTwo);

        System.out.println("Ahora nTwo Vale " + nTwo);

        System.out.println("Division =  " + result);

        System.out.printf("2 ^ 3 = %f\n", Math.pow(2, 3));

        //Ooperadores relacionales y lógicos
        System.out.println(nOne > nTwo);

        System.out.println(nOne <= nTwo);

        System.out.printf("Residuo de %d / %d = %d\n", nOne, nTwo, nOne % nTwo);

        System.out.println(10 > 5 && nOne > nTwo);

        System.out.println(10 > 5 || nOne < nTwo);

        System.out.println(!(10 > 5 || nOne < nTwo));

        //Estructuras condicionaes (if else, if else if else)
        //Sintáxis if(expresion logica)
        nOne = 100;
        if (nOne > 10) {
            System.out.printf("%d es mayor que 10\n", nOne);
        } else if (nOne < 10) {
            System.out.printf("%d es menor que 10\n", nOne);
        } else {
            System.out.printf("%d es igual que 10\n", nOne);
        }

        //byte day = Byte.parseByte(JOptionPane.showInputDialog("Digite numero del dia"));
        byte day = 1;

        String nameDay = new String();

        /*if( day == 1 ){
            nameDay = "Domingo";
        }else if( day == 2 ){
             nameDay = "Lunes";
        }else if( day == 3 ){
             nameDay = "Martes";
        }else if( day == 4 ){
             nameDay = "Miercoles";
        }else if( day == 5 ){
             nameDay = "Jueves";
        }else if( day == 6 ){
             nameDay = "Viernes";
        }else if( day == 7 ){
             nameDay = "Sábado";
        }else{
            nameDay = "No Válido";
        }*/
        //Estructura de Selección (switch) (Selección Múltiple)
        //REVISAR switch expression a partir de Java 3
        switch (day) {
            case 1:
                nameDay = "Domingo";
                break;

            case 2:
                nameDay = "Lunes";
                break;

            case 3:
                nameDay = "Martes";
                break;

            case 4:
                nameDay = "Miercoles";
                break;

            case 5:
                nameDay = "Jueves";
                break;

            case 6:
                nameDay = "Viernes";
                break;

            case 7:
                nameDay = "Sábado";
                break;

            default:
                nameDay = "No Válido";
        }

        System.out.printf("El dia es %s\n", nameDay);

        if (day > 1 && day < 7) {
            System.out.println("El dia es hábil");
        }

        /**
         * Estructuras de Control Iterativas - while - do .. while - for
         */
        //while - repite el conjunto de instrucciones (bucle {}), mientras el resultado de la expresion lógica es verdadero
        //        Existe la posibilidad de que el ciclo no se ejecute ni una vez
        var cont = 1;
        while (cont <= 10) {
            System.out.println(cont++);
            //cont += 1;, cont++
        }

        int number = Integer.parseInt(JOptionPane.showInputDialog("Digite Numero"));

        if (isCousing(number)) {
            System.out.printf("El Numero %d es Primo\n", number);
        } else {
            System.out.printf("El Numero %d NO es Primo\n", number);
        }

        //do...while - Ejecuta el ciclo o bucle mientras el resultado de la expresión logica es verdadero
        //             Primero ejecuta el ciclo y luego valida, ejecuta al menos una vez.
        do {
            char option = 's';
            System.out.println(cont--);
        } while (cont >= 1);

        //for - declara una variable, valida el valor de la variable, modifica la variable
        for (int x = 1; x <= number; x++) {
            if (isCousing(x)) {
                System.out.printf("El Numero %d es Primo\n", x);
            } 
        }
        
        /***
         * Arreglos en Java (Estructura de datos estática)
         *  Vectores => Arreglos de una dimension
         *  Matrices => Arreglos de dos dimensiones
         */
        
        int[] vector = new int[5];
        
        vector[0] = 4;
        vector[1] = 543;
        vector[2] = 354;
        vector[3] = 43;
        vector[4] = 65;
        
        System.out.printf("El Tamaño del Arreglo es %d\n", vector.length );
        
        //Recorre arreglo
        for( int i = 0 ; i < vector.length ; i++ ){
            System.out.printf("vector[%d]=%d\n",i,vector[i]);
        }
        
        //Definir con  valores
        int aux[] = new int[ ]{5,8,13,89,4,7689,9};
        System.out.printf("El Tamaño del Arreglo es %d\n", aux.length );
        
         for( int i = 0 ; i < aux.length ; i++ ){
            System.out.printf("%d\t",aux[i]);
        }
        System.out.println("");
        
        String days[] = {"Domingo","Lunes","Martes","Miercoles","Jueves","Viernes","Sábado"};
        
        day = 6;
        
        System.out.printf("E dia es %s\n",days[day]);
        
        //Arreglos de dos dimensiones (matrices)
        
        int[][] matriz = new int[4][3];
        
        for( int i = 0 ; i < matriz.length ; i++ ){
            for( int j = 0 ; j < matriz[i].length ; j++ ){
                int nRand = new Random().nextInt(71) + 30;
                matriz[i][j] = nRand;
            }
        }
        
        for( int i = 0 ; i < matriz.length ; i++ ){
            for( int j = 0 ; j < matriz[i].length ; j++ ){
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println("");
        }
        
        //Redimensionar la matriz, hace que se pierda el contenido anterior.
        matriz = new int[10][10];
        
        

        System.out.println("****************FIN DEL PROGRAMA***************");

    }

    public static boolean isCousing(int num) {
        int cont = 2;
        boolean cousing = true;

        while (cont <= num / 2 && cousing) {
            cousing = !(num % cont++ == 0);
        }

        return cousing;
    }
}
