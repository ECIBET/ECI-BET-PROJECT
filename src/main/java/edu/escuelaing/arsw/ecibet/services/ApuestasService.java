package edu.escuelaing.arsw.ecibet.services;

import edu.escuelaing.arsw.ecibet.model.ApuestaApi;
import org.json.JSONObject;

import java.util.Set;

public interface ApuestasService {

    String getTablePremierLeague();
    Set<ApuestaApi> getTableBets();
//    void guardarApuesta(String apuesta, int id);

}
