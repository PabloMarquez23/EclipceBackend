package ec.ups.edu.ppw.pruebaWeb;

public class Binomio {
    private String nombre;
    private String apellido;

    public Binomio() {}

    public Binomio(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
}
