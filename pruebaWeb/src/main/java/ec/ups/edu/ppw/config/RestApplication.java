package ec.ups.edu.ppw.config;

import jakarta.ws.rs.ApplicationPath;
import jakarta.ws.rs.core.Application;

@ApplicationPath("/api")  // 🔹 Esto hace que todos los endpoints inicien con "/api"
public class RestApplication extends Application {
}
