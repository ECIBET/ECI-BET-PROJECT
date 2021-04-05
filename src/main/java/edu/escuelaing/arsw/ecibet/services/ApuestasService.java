package edu.escuelaing.arsw.ecibet.services;

import edu.escuelaing.arsw.ecibet.model.ApuestaApi;

import java.util.ArrayList;
import java.util.Set;

public interface ApuestasService {

    String getTablePremierLeague();
    Set<ApuestaApi> getTableBets();
    ArrayList<String> getTableApuestas();
    void guardarApuesta(String apuesta, int id);

}
