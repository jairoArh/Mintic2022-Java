package logic;

public class Humano implements AccionesSeresVivos{

    private String nombre;

    public Humano(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String hablar() {
        return "Los Humanos hablan, poco, mucho.....";
    }

    @Override
    public String desplazar() {
        return "Los Humanos caminan, corren, vuelan.";
    }

    @Override
    public String respirar() {
        return "Los Humanos respiran por la Nariz";
    }

    @Override
    public String toString() {
        return "Humano{" +
                "nombre='" + nombre + '\'' +
                '}';
    }
}
