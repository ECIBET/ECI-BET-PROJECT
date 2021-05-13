package edu.escuelaing.arsw.ecibet.services;

import edu.escuelaing.arsw.ecibet.model.Apuesta;
import edu.escuelaing.arsw.ecibet.model.ApuestaApi;
import edu.escuelaing.arsw.ecibet.persistence.apis.ApiConnections;
import edu.escuelaing.arsw.ecibet.persistence.impl.ApiConnectionsImpl;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.Set;

public interface ApuestasService {

    JSONObject getTablePremierLeague();
    Set<ApuestaApi> getTableBets();
    String getTableApuestas();
    ArrayList<Apuesta> getTableApuestasUsuario(int id);
    void guardarApuesta(String apuesta);
    ApiConnections getobjeto();

}
