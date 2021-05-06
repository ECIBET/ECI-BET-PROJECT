package edu.escuelaing.arsw.ecibet.services.impl;

import com.google.gson.Gson;
import edu.escuelaing.arsw.ecibet.model.Apuesta;
import edu.escuelaing.arsw.ecibet.model.ApuestaApi;
import edu.escuelaing.arsw.ecibet.persistence.ApuestaRepository;
import edu.escuelaing.arsw.ecibet.persistence.apis.ApiConnections;
import edu.escuelaing.arsw.ecibet.services.ApuestasService;
import org.json.JSONObject;
import java.text.DateFormat;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.*;

@Service
public class ApuestasServiceImpl implements ApuestasService {

    @Autowired
    @Qualifier("apiConnectionsImpl")
    ApiConnections apiConne;

    @Autowired
    ApuestaRepository apuestaRepository;

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
    public String getTableApuestas() {
        List<Apuesta> apuestas = null;
        Gson send = new Gson();
        String jsonToString = null;
        apuestas = (List<Apuesta>) apuestaRepository.findAll();
        //System.out.println(apuestaRepository.findAll().getClass() + "Claseeeee");
        jsonToString = send.toJson(apuestas);
        return jsonToString;

    }
    public String getTableApuestasUsuario(int id) {
        List<Apuesta> apuestas = null;
        Gson send = new Gson();
        String jsonToString = null;
        apuestas = (List<Apuesta>) apuestaRepository.findAll();
        ArrayList<Apuesta> apuestasId = new ArrayList<Apuesta>();
        for (int i = 0 ; i< apuestas.size(); i++){
            if (apuestas.get(i).getId() == id){
                apuestasId.add(apuestas.get(i));
            }
        }
        jsonToString = send.toJson(apuestasId);
        return jsonToString;
    }

    @Override
    public void guardarApuesta(String apuesta) {
        JSONObject stringJson = new JSONObject(apuesta);
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date date = Calendar.getInstance().getTime();
        String fecha = formatter.format(date);
        double c = (double)stringJson.get("cuota");
        float cuota = (float)c;
        Apuesta apuestaGuardar = new Apuesta(0,fecha,
                                            cuota,(int)stringJson.get("valorApostado"),false,
                                            (String)stringJson.get("equipoApuesta"),1,(int)stringJson.get("idPartido"),(int)stringJson.get("idUser"));

        apuestaRepository.save(apuestaGuardar);
    }

    @Override
    public String getTableStats() {
        Gson send = new Gson();
        String jsonToString = null;
        jsonToString = send.toJson(apiConne.getTablePremiereLeague());
        return jsonToString;
    }
}
