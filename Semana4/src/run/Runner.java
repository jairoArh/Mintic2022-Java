package run;

import gui.MainWindow;

public class Runner {
    public static void main(String[] args) {
        MainWindow myWindow = new MainWindow("Ejemplo de Ventanas");
        myWindow.begin();
        myWindow.setVisible( true );
    }
}
