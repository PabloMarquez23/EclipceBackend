package ec.ups.edu.ppw.pruebaWeb;

public class Candidato {
    private String nombre;
    private String apellido;
    private String partido;
    private Binomio binomio;

    public Candidato() {}

    public Candidato(String nombre, String apellido, String partido, Binomio binomio) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.partido = partido;
        this.binomio = binomio;
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

    public String getPartido() {
        return partido;
    }

    public void setPartido(String partido) {
        this.partido = partido;
    }

    public Binomio getBinomio() {
        return binomio;
    }

    public void setBinomio(Binomio binomio) {
        this.binomio = binomio;
    }
}
