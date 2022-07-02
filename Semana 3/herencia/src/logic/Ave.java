package logic;

public class Ave extends Animal{
    private boolean vuela;

    public Ave(String nombre, String color, byte numeroExtremidades, boolean vuela) {
        super(nombre, color, numeroExtremidades);
        this.vuela = vuela;
    }

    @Override
    public String desplazar() {
        return "Algunas veces volando y otras caminando";
    }

    @Override
    public String respirar() {
        return "Las aves respiran en forma unidireccional";
    }

    @Override
    public String hablar(){
        return "Algunas Aves Hablan";
    }

    @Override
    public String toString() {
        return "Ave{" +
                "nombre='" + nombre + '\'' +
                ", color='" + color + '\'' +
                ", numeroExtremidades=" + numeroExtremidades +
                ", vuela=" + vuela +
                '}';
    }
}
