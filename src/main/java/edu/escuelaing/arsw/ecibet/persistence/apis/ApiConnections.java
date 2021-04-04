package edu.escuelaing.arsw.ecibet.persistence.apis;

import edu.escuelaing.arsw.ecibet.model.ApuestaApi;
import org.json.JSONObject;

import java.util.Set;

public interface ApiConnections {

    String getTablePremiereLeague();
    Set<ApuestaApi> getBets();

    void guardarApuesta(String apuesta, int id);
}
