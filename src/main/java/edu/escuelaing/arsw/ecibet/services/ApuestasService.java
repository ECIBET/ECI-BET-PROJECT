package edu.escuelaing.arsw.ecibet.services;

import edu.escuelaing.arsw.ecibet.model.ApuestaApi;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Set;

public interface ApuestasService {

    String getTablePremierLeague();
    Set<ApuestaApi> getTableBets();
    Hashtable<Integer, ArrayList> getTableApuestas();
    ArrayList getTableApuestasUsuario(int id);
    void guardarApuesta(String apuesta, int id);

}
