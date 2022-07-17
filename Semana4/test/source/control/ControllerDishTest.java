package control;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class ControllerDishTest {

    @Test
    void dump() {
    }

    @Test
    void load() {

        ControllerDish controll = new ControllerDish();
        controll.load();

        String[][] data = controll.sortDish( 1 );

        assertEquals(4, data.length );

    }
}