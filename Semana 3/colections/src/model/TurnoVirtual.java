package model;

public class TurnoVirtual {
    //ESTA CLASE NO TIENE MAIN

    //INSERTE LOS ATRIBUTOS
    private String[] turnos;
    private String[] turnosPerdidos;

    private boolean estadoTurnoVirtual;

    private int turnoEnAtencion;

    private int cantidadTurnosAtendidos;

    //INSERTE EL MÉTODO CONSTRUCTOR

    public TurnoVirtual(String[] turnos) {
        this.turnos = turnos;
        turnosPerdidos = new String[ turnos.length ];
        for( int i = 0 ; i < turnosPerdidos.length ; i++ ){
            turnosPerdidos[i] = " ";
        }
        estadoTurnoVirtual = true;
        turnoEnAtencion = 0;
        cantidadTurnosAtendidos = 1;
    }

    //INSERTE LOS GETTERS Y SETTERS

    public String[] getTurnos() {
        return turnos;
    }

    public void setTurnos(String[] turnos) {
        this.turnos = turnos;
    }

    public String[] getTurnosPerdidos() {
        return turnosPerdidos;
    }

    public void setTurnosPerdidos(String[] turnosPerdidos) {
        this.turnosPerdidos = turnosPerdidos;
    }

    public boolean isEstadoTurnoVirtual() {
        return estadoTurnoVirtual;
    }

    public void setEstadoTurnoVirtual(boolean estadoTurnoVirtual) {
        this.estadoTurnoVirtual = estadoTurnoVirtual;
    }

    public int getTurnoEnAtencion() {
        return turnoEnAtencion;
    }

    public void setTurnoEnAtencion(int turnoEnAtencion) {
        this.turnoEnAtencion = turnoEnAtencion;
    }

    public int getCantidadTurnosAtendidos() {
        return cantidadTurnosAtendidos;
    }

    public void setCantidadTurnosAtendidos(int cantidadTurnosAtendidos) {
        this.cantidadTurnosAtendidos = cantidadTurnosAtendidos;
    }


    //INSERTE LOS DEMÁS MÉTODOS

    //NO SE DEBE PREOCUPAR POR DESARROLLAR ESTE MÉTODO. ¡NO ELIMINARLO NI MODIFICARLO!
    public void agregarTurnoPerdido() {
        for (int i = 0; i < turnosPerdidos.length; i++) {
            if (" ".equals(turnosPerdidos[i])) {
                turnosPerdidos[i] = turnos[turnoEnAtencion];
                break;
            }
        }
    }

    public void atenderProximoTurno(){
        if( estadoTurnoVirtual ){
            turnoEnAtencion++;
            cantidadTurnosAtendidos++;
        }
    }

    public void cambiarEstadoTurno(){
        estadoTurnoVirtual = !estadoTurnoVirtual;
    }
}
