package ec.ups.edu.ppw.dao;

import ec.ups.edu.ppw.pruebaWeb.Candidato;
import ec.ups.edu.ppw.pruebaWeb.Binomio;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.ArrayList;
import java.util.List;

@ApplicationScoped
public class CandidatoDAO {
    private static final List<Candidato> candidatos = new ArrayList<>();

    static {
        // Datos de ejemplo (para iniciar con algunos candidatos en memoria)
        candidatos.add(new Candidato("Juan", "Pérez", "Partido A", new Binomio("Carlos", "Gómez")));
        candidatos.add(new Candidato("María", "López", "Partido B", new Binomio("Luis", "Torres")));
    }

    public List<Candidato> obtenerTodos() {
        return candidatos;
    }

    public Candidato obtenerPorNombre(String nombre) {
        return candidatos.stream()
                .filter(candidato -> candidato.getNombre().equalsIgnoreCase(nombre))
                .findFirst()
                .orElse(null);
    }

    public void crearCandidato(Candidato candidato) {
        candidatos.add(candidato);
    }

    public boolean eliminarCandidato(String nombre) {
        return candidatos.removeIf(candidato -> candidato.getNombre().equalsIgnoreCase(nombre));
    }
}
