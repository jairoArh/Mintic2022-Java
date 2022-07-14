package gui;

import control.ControllerDish;

import javax.swing.*;
import java.awt.*;
import java.util.Arrays;

public class DishWindow extends JFrame {
    private MainMenu mainMenu;

    private WindowAddDish windowAddDish;

    private JDesktopPane desktop;

    private ControllerDish controller;

    public DishWindow() {
        this.setSize( 800,600 );
        this.setTitle("Gestión de Platos");
        this.setDefaultCloseOperation( DO_NOTHING_ON_CLOSE );
        this.setLayout( new BorderLayout() );
        this.setResizable( false );
        this.addWindowListener( new HandlingEvents( this ) );
    }

    public void begin(){
        beginComponents();
        addComponents( );
    }

    private void addComponents() {
        this.add( desktop, BorderLayout.CENTER );
        this.setJMenuBar( mainMenu );
    }

    private void beginComponents() {
        mainMenu = new MainMenu( this );

        desktop = new JDesktopPane();

        windowAddDish = new WindowAddDish( desktop,this );

        controller = new ControllerDish();
    }

    public void addDish(){
        //TODO Obtener los datos de GUI y enviar al control
        String id = windowAddDish.getIdDish();
        String name = windowAddDish.getName();
        String vegetarian = windowAddDish.isVegetarian() ? "SI" : "NO";
        String calories = windowAddDish.getCalories();
        String value = windowAddDish.getValue();

       if( controller.addDish( id,name,vegetarian,calories,value) ){
           windowAddDish.addRowTable( new Object[]{id,name,vegetarian,calories,value});
           JOptionPane.showMessageDialog(null,"Se ha Insertado el Registro","OK",JOptionPane.WARNING_MESSAGE);
           windowAddDish.cleanFields();
       }else{
           JOptionPane.showMessageDialog(null,"Ya se ha registrado el ID","OK",JOptionPane.ERROR_MESSAGE);
       }

    }

    public void viewAddDish() {
        windowAddDish.setVisible( true );
    }

    public void exit(){
        int option = JOptionPane.showConfirmDialog(null,"Esta Segur@?","Cerrar",JOptionPane.YES_NO_OPTION);
        if ( option == JOptionPane.YES_OPTION ){
            System.exit( 0 );
        }
    }

    public void deleteDish(){
        String[] object = controller.deleteDish( windowAddDish.getIdDish());
        if( object != null ){
            windowAddDish.changeDataTable( controller.sortDish( 0 ) );
        }else{
            JOptionPane.showMessageDialog(null,"Plato no Existe","Error",JOptionPane.ERROR_MESSAGE);
        }
    }

    public void sorted(){
        String[][] data = controller.sortDish(1 );

        windowAddDish.changeDataTable( data );

    }
}
