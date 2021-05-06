package edu.escuelaing.arsw.ecibet.persistence.apis;

import edu.escuelaing.arsw.ecibet.model.ApuestaApi;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Set;

public interface ApiConnections {

    JSONObject getTablePremiereLeague();
    Set<ApuestaApi> getBets();
    Hashtable<Integer, ArrayList> getTableApuestas();
    ArrayList getTableApuestasUsuario(int id);
}
