package logic;

public abstract class Animal implements AccionesSeresVivos{
    protected String nombre;
    protected String color;
    protected byte numeroExtremidades;

    public Animal(String nombre, String color, byte numeroExtremidades) {
        this.nombre = nombre;
        this.color = color;
        this.numeroExtremidades = numeroExtremidades;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public byte getNumeroExtremidades() {
        return numeroExtremidades;
    }

    public void setNumeroExtremidades(byte numeroExtremidades) {
        this.numeroExtremidades = numeroExtremidades;
    }

    public String hablar(){
        return "Los Animales no hablan";
    }


    @Override
    public String toString() {
        return "Animal{" +
                "nombre='" + nombre + '\'' +
                ", color='" + color + '\'' +
                ", numeroExtremidades=" + numeroExtremidades +
                '}';
    }
}
