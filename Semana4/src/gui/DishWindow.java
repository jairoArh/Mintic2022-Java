package gui;

import control.ControllerDish;

import javax.swing.*;
import java.awt.*;

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
        System.out.println( controller.addDish());

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
}
