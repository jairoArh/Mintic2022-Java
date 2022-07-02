package logic;

public class Terrestre extends Mamifero{
    private boolean bipedo;

    public Terrestre(String nombre, String color, byte numeroExtremidades, boolean pelaje, boolean bipedo) {
        super(nombre, color, numeroExtremidades, pelaje);
        this.bipedo = bipedo;
    }

    public boolean isBipedo() {
        return bipedo;
    }

    public void setBipedo(boolean bipedo) {
        this.bipedo = bipedo;
    }

    @Override
    public String desplazar() {
        return "Se desplazan caminando";
    }

    @Override
    public String respirar() {
        return "Respiran por la Pulmones";
    }

    @Override
    public String mamar() {
        return "Toman Leche en Tierra";
    }

    public String excavar(){
        return "Sacando Tierra";
    }

    @Override
    public String toString() {
        return "Terrestre{" +
                "nombre='" + nombre + '\'' +
                ", color='" + color + '\'' +
                ", numeroExtremidades=" + numeroExtremidades +
                ", pelaje=" + pelaje +
                ", bipedo=" + bipedo +
                '}';
    }
}
