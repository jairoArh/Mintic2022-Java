package edu.udea.cars.run;

import edu.udea.cars.logic.Car;

import javax.swing.*;

public class RunCars {
    private Car car;

    public static void main(String[] args) {

        new RunCars().begin();

        System.out.println("***************FIN DEL PROGRAMA****************");
    }

    private void begin() {
        String menu = "<<<<<MENU PRINCIPAL>>>>>\n\n" +
                "1.  Agregar Vehiculo\n" +
                "2. Prender\n" +
                "3.  Apagar\n" +
                "4.  Acelerar\n" +
                "5. Frenar\n\n" +
                "S. Salir\n";
        char option;
        do {
            option = JOptionPane.showInputDialog(null, menu).charAt(0);
            switch (option) {
                case '1':
                    addCar();
                    break;

                case '2':
                    start();
                    break;

                case '3':
                    shutdown();
                    break;

                case '4':
                    speedUp();
                    break;

                case '5':
                    breaking();
                    break;
            }
        } while (Character.toUpperCase(option) != 'S');
    }

    private void addCar() {

        String plate = JOptionPane.showInputDialog("Placa");
        String mark = JOptionPane.showInputDialog("Marca");
        while (true){
            try {
                short model = Short.parseShort(JOptionPane.showInputDialog("Modelo"));
                car = new Car(plate, mark, model);
                break;
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Error en el Model", "ERROR", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    private void start() {
        try{
            if( !car.isState( ) ){
                car.start();
                JOptionPane.showMessageDialog(null,"El Carro " + car.getTradeMark() + " se ha Encendido","Ok",JOptionPane.YES_OPTION);
            }else{
                JOptionPane.showMessageDialog(null, "No se Puede Encender", "ERROR", JOptionPane.ERROR_MESSAGE);
            }
        }catch (NullPointerException e){
            JOptionPane.showMessageDialog(null, "No se ha Inicializao", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void shutdown() {
    }

    private void speedUp() {
    }

    private void breaking() {
    }
}
