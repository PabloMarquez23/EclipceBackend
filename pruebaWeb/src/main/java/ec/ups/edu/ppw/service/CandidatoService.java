package ec.ups.edu.ppw.service;

import ec.ups.edu.ppw.pruebaWeb.Candidato;
import ec.ups.edu.ppw.dao.CandidatoDAO;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import java.util.List;

@Path("/candidatos")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class CandidatoService {

    @Inject
    private CandidatoDAO candidatoDAO;

    // Obtener todos los candidatos
    @GET
    @Path("/lista")
    public Response listarCandidatos() {
        List<Candidato> lista = candidatoDAO.obtenerTodos();
        return Response.ok(lista).build();
    }

    // Crear un nuevo candidato
    @POST
    @Path("/crear")
    public Response crearCandidato(Candidato candidato) {
        candidatoDAO.crearCandidato(candidato);
        return Response.status(Response.Status.CREATED)
                       .entity("{\"mensaje\": \"Candidato creado correctamente\"}")
                       .build();
    }

    // Eliminar un candidato por nombre
    @DELETE
    @Path("/eliminar/{nombre}")
    public Response eliminarCandidato(@PathParam("nombre") String nombre) {
        boolean eliminado = candidatoDAO.eliminarCandidato(nombre);
        if (eliminado) {
            return Response.ok("{\"mensaje\": \"Candidato eliminado correctamente\"}").build();
        } else {
            return Response.status(Response.Status.NOT_FOUND)
                           .entity("{\"mensaje\": \"Candidato no encontrado\"}")
                           .build();
        }
    }
}
