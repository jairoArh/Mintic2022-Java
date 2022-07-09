package gui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class HandlingEvents implements ActionListener, WindowListener {
    public static final String ADD_DISH = "Agregar Plato";
    public static final String DELETE_DISH = "Eliminar Plato";
    public static final String FIND_DISH = "Buscar Plato";
    public static final String UPDATE_DISH = "Actualizar Plato";
    public static final String VIEW_ADD_DISH = "Visualizar Ventana de Platos";
    public static  final String EXIT = "Salir";

    public DishWindow dishWindow;

    public HandlingEvents(DishWindow dishWindow) {
        this.dishWindow = dishWindow;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        switch( e.getActionCommand()){
            case ADD_DISH : dishWindow.addDish();
            break;

            case VIEW_ADD_DISH: dishWindow.viewAddDish();
            break;

            case EXIT: dishWindow.exit();
            break;
        }
    }

    @Override
    public void windowOpened(WindowEvent e) {

    }

    @Override
    public void windowClosing(WindowEvent e) {
        dishWindow.exit();
    }

    @Override
    public void windowClosed(WindowEvent e) {

    }

    @Override
    public void windowIconified(WindowEvent e) {

    }

    @Override
    public void windowDeiconified(WindowEvent e) {

    }

    @Override
    public void windowActivated(WindowEvent e) {

    }

    @Override
    public void windowDeactivated(WindowEvent e) {

    }
}
