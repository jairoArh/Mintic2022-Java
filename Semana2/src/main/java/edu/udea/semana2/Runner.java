/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.udea.semana2;

import javax.swing.JOptionPane;

/**
 *
 * @author jairoarmando
 */
public class Runner {
    
    public static void main(String[] args) {
        Combinations comb = new Combinations( );
        
        int n = Integer.parseInt(JOptionPane.showInputDialog("Numero de Elementos"));
        
        int k = Integer.parseInt(JOptionPane.showInputDialog("Elementos para Agrupar"));
        
        Combinations comb1 = new Combinations( n, k );
        
        //comb.setNumberElements( n );
        
        //comb.setNumberGroups( k );
        
        System.out.printf("Elementos=%d Grupos=%d Combinaciones=%d\n",comb.getNumberElements(), comb.getNumberGroups(),comb.calcCombinations());
        
        System.out.printf("Elementos=%d Grupos=%d Combinaciones=%d\n",comb1.getNumberElements(), comb1.getNumberGroups(),comb1.calcCombinations());
        
        System.out.println(comb);
        
        
    }
    
}
