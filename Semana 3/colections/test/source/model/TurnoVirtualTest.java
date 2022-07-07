package model;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class TurnoVirtualTest {

    private TurnoVirtual tv;

    void setup(){
        String[] turnos = {"A0","A1","A2","A3","A4","A5","A6","A7","A8","A9","A10","A11"};
        tv = new TurnoVirtual( turnos );
    }

    @Test
    void testBegin(){
        setup();
        assertEquals("A0",tv.getTurnos()[0]);
        assertEquals("A5",tv.getTurnos()[5]);
        assertEquals("A11",tv.getTurnos()[11]);
        assertTrue(tv.isEstadoTurnoVirtual());
        assertEquals(0,tv.getTurnoEnAtencion());
        assertEquals(1,tv.getCantidadTurnosAtendidos());

        tv.atenderProximoTurno();
        tv.atenderProximoTurno();
        tv.atenderProximoTurno();
        tv.atenderProximoTurno();
        assertEquals(4,tv.getTurnoEnAtencion());
        assertEquals(5,tv.getCantidadTurnosAtendidos());
        assertTrue(tv.isEstadoTurnoVirtual());

        tv.agregarTurnoPerdido();
        tv.atenderProximoTurno();
        tv.agregarTurnoPerdido();
        tv.atenderProximoTurno();
        tv.agregarTurnoPerdido();

        assertEquals("A4",tv.getTurnosPerdidos()[0]);
        assertEquals("A5",tv.getTurnosPerdidos()[1]);
        assertEquals("A6",tv.getTurnosPerdidos()[2]);
        assertEquals(6,tv.getTurnoEnAtencion());
        assertEquals(7,tv.getCantidadTurnosAtendidos());

        tv.cambiarEstadoTurno();
        tv.atenderProximoTurno();
        tv.cambiarEstadoTurno();
        assertTrue(tv.isEstadoTurnoVirtual());
        assertEquals(6,tv.getTurnoEnAtencion());
        assertEquals(7,tv.getCantidadTurnosAtendidos());
    }

}