package edu.escuelaing.arsw.ecibet.services.impl;

import edu.escuelaing.arsw.ecibet.model.ApuestaApi;
import edu.escuelaing.arsw.ecibet.persistence.apis.ApiConnections;
import edu.escuelaing.arsw.ecibet.services.ApuestasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Set;

@Service
public class ApuestasServiceImpl implements ApuestasService {

    @Autowired
    @Qualifier("apiConnectionsImpl")
    ApiConnections apiConne;

    @Override
    public String getTablePremierLeague() {
        //String to object table premiere league
        return apiConne.getTablePremiereLeague();
    }

    @Override
    public Set<ApuestaApi> getTableBets() {
        return apiConne.getBets();
    }

    @Override
    public ArrayList<String> getTableApuestas() {
        return apiConne.getTableApuestas();
    }

    @Override
    public void guardarApuesta(String apuesta, int id) {
      apiConne.guardarApuesta(apuesta,id);
    }
}
