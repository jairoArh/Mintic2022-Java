package logic;

public class Acuatico extends Mamifero{
    private String ecosistema;

    public Acuatico(String nombre, String color, byte numeroExtremidades, boolean pelaje, String ecosistema) {
        super(nombre, color, numeroExtremidades, pelaje);
        this.ecosistema = ecosistema;
    }

    @Override
    public String desplazar() {
        return "Se desplazan Nadando";
    }

    @Override
    public String respirar() {
        return "Respiran por Branquias";
    }

    @Override
    public String mamar() {
        return "Toman Leche debajo del Agua";
    }

    @Override
    public String toString() {
        return "Acuatico{" +
                "ecosistema='" + ecosistema + '\'' +
                ", nombre='" + nombre + '\'' +
                ", color='" + color + '\'' +
                ", numeroExtremidades=" + numeroExtremidades +
                ", pelaje=" + pelaje +
                '}';
    }
}
