package logic;

public abstract class  Mamifero extends Animal{
    protected boolean pelaje;

    public Mamifero(String nombre, String color, byte numeroExtremidades, boolean pelaje) {
        super(nombre, color, numeroExtremidades);
        this.pelaje = pelaje;
    }

    public boolean isPelaje() {
        return pelaje;
    }

    public void setPelaje(boolean pelaje) {
        this.pelaje = pelaje;
    }

    public abstract String mamar();

    @Override
    public String toString() {
        return "Mamifero{" +
                "nombre='" + nombre + '\'' +
                ", color='" + color + '\'' +
                ", numeroExtremidades=" + numeroExtremidades +
                ", pelaje=" + pelaje +
                '}';
    }
}
