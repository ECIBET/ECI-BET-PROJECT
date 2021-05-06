package edu.escuelaing.arsw.ecibet.services;

import edu.escuelaing.arsw.ecibet.model.Apuesta;
import edu.escuelaing.arsw.ecibet.model.ApuestaApi;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.Set;

public interface ApuestasService {

    JSONObject getTablePremierLeague();
    Set<ApuestaApi> getTableBets();
    String getTableApuestas();
    ArrayList<Apuesta> getTableApuestasUsuario(int id);
    void guardarApuesta(String apuesta);

}
