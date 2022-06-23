/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.udea.semana2;

/**
 *
 * @author jairoarmando
 */
public class Combinations {
    private int numberElements;
    
    private int numberGroups;
    
     public Combinations() {
        this.numberElements = 2;
        this.numberGroups = 1;
    }

    public Combinations(int numberElements, int numberGroups) {
        this.numberElements = numberElements;
        this.numberGroups = numberGroups;
    }

   

    public int getNumberElements() {
        return numberElements;
    }

    public void setNumberElements(int numberElements) {
        this.numberElements = numberElements;
    }

    public int getNumberGroups() {
        return numberGroups;
    }

    public void setNumberGroups(int numberGroups) {
        this.numberGroups = numberGroups;
    }
    
    public int calcFactorial(int number){
        int fact = 1;
        
        while( number >= 1 ){
            fact *= number--;  // fact = fact * number; number = number - 1;
        }
        
        return fact;
    }
    
    public int calcCombinations(){
        
        int result = calcFactorial(this.numberElements) / ( calcFactorial( numberGroups) * calcFactorial(numberElements - numberGroups) );
        
        return result;
    }

    @Override
    public String toString() {
        return "Combinations{" + "numberElements=" + numberElements + ", numberGroups=" + numberGroups + '}';
    }
   
}
