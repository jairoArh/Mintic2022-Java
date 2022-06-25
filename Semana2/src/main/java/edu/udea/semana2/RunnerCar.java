/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.udea.semana2;

/**
 *
 * @author jairoarmando
 */
public class RunnerCar {
    
    private String name;

    public RunnerCar( ) {
        name = "Jairo Armando";
    }
    
    
    
    public static void main(String[] args) {
        Car renault = new Car("JIA763","Renault 4", (short)1977 );
        
        Car chevrolet = new Car("NOT560","Chevrolet Aveo", (short)2007);
        
        
        System.out.println( renault  + " " + Car.LIMIT_SPEED );
        
        System.out.println( chevrolet );
        
        
        //renault.shutdown();
        
        if( renault.isState()){
            System.out.println("Prendido");
        }else{
            System.out.println("Apagado");
        }
        
        System.out.println("Acelerando a " + renault.speedUp((short)30));
        System.out.println("Acelerando a " + renault.speedUp((short)70));
        
        System.out.println("Frenando a " + renault.breaking());
        System.out.println("Frenando a " + renault.breaking());
        System.out.println("Frenando a " + renault.breaking());
        
        
        RunnerCar myRun = new RunnerCar();
        
        myRun.changeName("Jaime Alberto");
        
        System.out.println( myRun.name );
  
    }
    
    void changeName( String  name ){
        this.name = name;
    }
    
}
