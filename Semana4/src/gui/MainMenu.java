package gui;

import javax.swing.*;
import java.awt.event.KeyEvent;

public class MainMenu extends JMenuBar {
    private JMenu dishes;

    private JMenuItem optDishes;
    private JMenuItem exit;

    private DishWindow dishWindow;

    public MainMenu(DishWindow dishWindow) {
        this.dishWindow = dishWindow;
        beginComponents();
        addComponents();
    }

    private void addComponents() {
        dishes.add( optDishes );
        dishes.addSeparator();
        dishes.add( exit );

        this.add( dishes );
    }

    private void beginComponents() {
        dishes = new JMenu("Platos");

        optDishes = new JMenuItem("Gestionar Platos");
        optDishes.setActionCommand(HandlingEvents.VIEW_ADD_DISH);
        optDishes.addActionListener( new HandlingEvents(dishWindow));

        exit = new JMenuItem("Salir");
        exit.setAccelerator( KeyStroke.getKeyStroke(KeyEvent.VK_X,KeyEvent.CTRL_MASK));
        exit.setActionCommand( HandlingEvents.EXIT);
        exit.addActionListener( new HandlingEvents( dishWindow ) );
        exit.setIcon( new ImageIcon("./images/exit.png"));
    }
}
