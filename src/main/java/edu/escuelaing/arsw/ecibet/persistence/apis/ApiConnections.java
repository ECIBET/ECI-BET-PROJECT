package edu.escuelaing.arsw.ecibet.persistence.apis;

import edu.escuelaing.arsw.ecibet.model.ApuestaApi;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Set;

public interface ApiConnections {

    String getTablePremiereLeague();
    Set<ApuestaApi> getBets();

    void guardarApuesta(String apuesta, int id);

    Hashtable<Integer, ArrayList> getTableApuestas();
    ArrayList getTableApuestasUsuario(int id);
}
