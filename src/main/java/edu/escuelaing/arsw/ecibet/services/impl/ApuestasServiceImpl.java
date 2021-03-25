package edu.escuelaing.arsw.ecibet.services.impl;

import edu.escuelaing.arsw.ecibet.persistence.apis.ApiConnections;
import edu.escuelaing.arsw.ecibet.persistence.impl.ApiConnectionsImpl;
import edu.escuelaing.arsw.ecibet.services.ApuestasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

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
}
