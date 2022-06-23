/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package edu.udea.semana2;

import javax.swing.JOptionPane;

/**
 *
 * @author jairoarmando
 */
public class Semana2 {

    public static void main(String[] args) {
        
        int n = Integer.parseInt(JOptionPane.showInputDialog("Numero de Elementos"));
        
        int k = Integer.parseInt(JOptionPane.showInputDialog("Elementos para Agrupar"));
        
        //a, b, c, d, e 
        //(a,b),(a,c),(a,d),(a,e),(b,c),(b,d),(b,e),(c,d),(c,e),(d,e)
        
        //120 / 
        
        int combinations = calcFactorial(n) / (calcFactorial(k) * calcFactorial(n-k));
        
        System.out.printf("Las combianciones son %d\n",combinations);
        
        
    }
    
    public static int calcFactorial( int number){
        
        int fact = 1;
        
        while( number >= 1 ){
            fact *= number--;
        }
        
        return fact;
    }
}
