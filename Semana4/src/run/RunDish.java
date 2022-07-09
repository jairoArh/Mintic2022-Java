package run;

import gui.DishWindow;

public class RunDish {
    public static void main(String[] args) {
        DishWindow dishWindow = new DishWindow();
        dishWindow.begin();
        dishWindow.setVisible( true );
    }
}
