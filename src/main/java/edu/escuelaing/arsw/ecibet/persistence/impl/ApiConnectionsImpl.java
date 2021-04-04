package edu.escuelaing.arsw.ecibet.persistence.impl;

import edu.escuelaing.arsw.ecibet.model.ApuestaApi;
import edu.escuelaing.arsw.ecibet.persistence.apis.ApiConnections;
import edu.escuelaing.arsw.ecibet.services.ApuestasService;
import org.json.JSONObject;
import org.springframework.stereotype.Component;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

@Component
public class ApiConnectionsImpl implements ApiConnections {

    //private final ConcurrentHashMap<Tuple<String,String>,Blueprint> blueprints=new ConcurrentHashMap<>();
    //[{"author":"author2","points":[{"x":0,"y":1},{"x":1,"y":0}],"name":"Blueprint_b"}}]
    private ArrayList<ApuestaApi> bets = new ArrayList<>();

    @Override
    public String getTablePremiereLeague() {
        String table = new String("{\"records\":[{\"team\":\"Manchester City\",\"played\":30,\"win\":22,\"draw\":5,\"loss\":3,\"goalsFor\":64,\"goalsAgainst\":21,\"points\":71},{\"team\":\"Manchester United\",\"played\":29,\"win\":16,\"draw\":9,\"loss\":4,\"goalsFor\":56,\"goalsAgainst\":32,\"points\":57},{\"team\":\"Leicester\",\"played\":29,\"win\":17,\"draw\":5,\"loss\":7,\"goalsFor\":53,\"goalsAgainst\":32,\"points\":56},{\"team\":\"Chelsea\",\"played\":29,\"win\":14,\"draw\":9,\"loss\":6,\"goalsFor\":44,\"goalsAgainst\":25,\"points\":51},{\"team\":\"West Ham\",\"played\":29,\"win\":14,\"draw\":7,\"loss\":8,\"goalsFor\":45,\"goalsAgainst\":35,\"points\":49},{\"team\":\"Tottenham\",\"played\":29,\"win\":14,\"draw\":6,\"loss\":9,\"goalsFor\":49,\"goalsAgainst\":30,\"points\":48},{\"team\":\"Everton\",\"played\":28,\"win\":14,\"draw\":4,\"loss\":10,\"goalsFor\":40,\"goalsAgainst\":37,\"points\":46},{\"team\":\"Liverpool\",\"played\":29,\"win\":13,\"draw\":7,\"loss\":9,\"goalsFor\":48,\"goalsAgainst\":36,\"points\":46},{\"team\":\"Arsenal\",\"played\":29,\"win\":12,\"draw\":6,\"loss\":11,\"goalsFor\":40,\"goalsAgainst\":32,\"points\":42},{\"team\":\"Aston Villa\",\"played\":28,\"win\":12,\"draw\":5,\"loss\":11,\"goalsFor\":39,\"goalsAgainst\":30,\"points\":41},{\"team\":\"Leeds\",\"played\":29,\"win\":12,\"draw\":3,\"loss\":14,\"goalsFor\":45,\"goalsAgainst\":47,\"points\":39},{\"team\":\"Crystal Palace\",\"played\":29,\"win\":10,\"draw\":7,\"loss\":12,\"goalsFor\":31,\"goalsAgainst\":47,\"points\":37},{\"team\":\"Wolverhampton Wanderers\",\"played\":29,\"win\":9,\"draw\":8,\"loss\":12,\"goalsFor\":28,\"goalsAgainst\":38,\"points\":35},{\"team\":\"Southampton\",\"played\":29,\"win\":9,\"draw\":6,\"loss\":14,\"goalsFor\":36,\"goalsAgainst\":51,\"points\":33},{\"team\":\"Burnley\",\"played\":29,\"win\":8,\"draw\":9,\"loss\":12,\"goalsFor\":22,\"goalsAgainst\":37,\"points\":33},{\"team\":\"Brighton\",\"played\":29,\"win\":7,\"draw\":11,\"loss\":11,\"goalsFor\":32,\"goalsAgainst\":36,\"points\":32},{\"team\":\"Newcastle United\",\"played\":29,\"win\":7,\"draw\":7,\"loss\":15,\"goalsFor\":28,\"goalsAgainst\":48,\"points\":28},{\"team\":\"Fulham\",\"played\":30,\"win\":5,\"draw\":11,\"loss\":14,\"goalsFor\":23,\"goalsAgainst\":38,\"points\":26},{\"team\":\"West Bromwich Albion\",\"played\":29,\"win\":3,\"draw\":9,\"loss\":17,\"goalsFor\":20,\"goalsAgainst\":57,\"points\":18},{\"team\":\"Sheffield United\",\"played\":29,\"win\":4,\"draw\":2,\"loss\":23,\"goalsFor\":16,\"goalsAgainst\":50,\"points\":14}]}");
        System.out.println("Esto es lo que deberia imprimir \n" + table );
        return table;
    }
    @Override
    public Set<ApuestaApi> getBets() {
        JSONObject tableJson = new JSONObject("{ \"10010\":[{\n" +
                "  \"hora\": \"14:00\",\n" +
                "  \"fecha\": \"9th Apr\",\n" +
                "  \"logo1\": \"1.png\",\n" +
                "  \"logo2\": \"20.png\",\n" +
                "  \"equipo1\": \"Fulham\",\n" +
                "  \"equipo2\": \"Wolverhampton\",\n" +
                "  \"cuota1\": \"2.4\",\n" +
                "  \"cuotaEmpate\": \"3.2\",\n" +
                "  \"cuota2\": \"3.0\"\n" +
                "}]," +
                "\"10011\":[{\n" +
                "  \"hora\": \"06:30\",\n" +
                "  \"fecha\": \"10th Apr\",\n" +
                "  \"logo1\": \"8.png\",\n" +
                "  \"logo2\": \"18.png\",\n" +
                "  \"equipo1\": \"MANCHESTER CITY\",\n" +
                "  \"equipo2\": \"LEEDS\",\n" +
                "  \"cuota1\": \"1.22\",\n" +
                "  \"cuotaEmpate\": \"6.5\",\n" +
                "  \"cuota2\": \"11.0\"\n" +
                "}]," +
                "\"10012\":[{\n" +
                "  \"hora\": \"09:00\",\n" +
                "  \"fecha\": \"10th Apr\",\n" +
                "  \"logo1\": \"7.png\",\n" +
                "  \"logo2\": \"6.png\",\n" +
                "  \"equipo1\": \"LIVERPOOL\",\n" +
                "  \"equipo2\": \"ASTON VILLA\",\n" +
                "  \"cuota1\": \"1.40\",\n" +
                "  \"cuotaEmpate\": \"4.75\",\n" +
                "  \"cuota2\": \"7.50\"\n" +
                "}]," +
                "\"10013\":[{\n" +
                "  \"hora\": \"11:30\",\n" +
                "  \"fecha\": \"10th Apr\",\n" +
                "  \"logo1\": \"4.png\",\n" +
                "  \"logo2\": \"3.png\",\n" +
                "  \"equipo1\": \"CRYSTAL PALACE\",\n" +
                "  \"equipo2\": \"CHELSEA\",\n" +
                "  \"cuota1\": \"9.50\",\n" +
                "  \"cuotaEmpate\": \"4.00\",\n" +
                "  \"cuota2\": \"1.40\"\n" +
                "}]," +
                "\"10014\":[{\n" +
                "  \"hora\": \"06:00\",\n" +
                "  \"fecha\": \"10th Apr\",\n" +
                "  \"logo1\": \"17.png\",\n" +
                "  \"logo2\": \"12.png\",\n" +
                "  \"equipo1\": \"BURNLEY\",\n" +
                "  \"equipo2\": \"NEWCASTLE\",\n" +
                "  \"cuota1\": \"2.15\",\n" +
                "  \"cuotaEmpate\": \"3.10\",\n" +
                "  \"cuota2\": \"3.60\"\n" +
                "}]," +
                "\"10015\":[{\n" +
                "  \"hora\": \"08:00\",\n" +
                "  \"fecha\": \"11TH APR\",\n" +
                "  \"logo1\": \"14.png\",\n" +
                "  \"logo2\": \"10.png\",\n" +
                "  \"equipo1\": \"WEST HAM\",\n" +
                "  \"equipo2\": \"LEICESTER\",\n" +
                "  \"cuota1\": \"2.90\",\n" +
                "  \"cuotaEmpate\": \"3.40\",\n" +
                "  \"cuota2\": \"2.37\"\n" +
                "}]," +
                "\"10016\":[{\n" +
                "  \"hora\": \"10:30\",\n" +
                "  \"fecha\": \"11TH APR\",\n" +
                "  \"logo1\": \"13.png\",\n" +
                "  \"logo2\": \"9.png\",\n" +
                "  \"equipo1\": \"TOTTENHAM\",\n" +
                "  \"equipo2\": \"MANCHESTER UNITED\",\n" +
                "  \"cuota1\": \"2.80\",\n" +
                "  \"cuotaEmpate\": \"3.40\",\n" +
                "  \"cuota2\": \"2.40\"\n" +
                "}]," +
                "\"10017\":[{\n" +
                "  \"hora\": \"13:00\",\n" +
                "  \"fecha\": \"11TH APR\",\n" +
                "  \"logo1\": \"19.png\",\n" +
                "  \"logo2\": \"2.png\",\n" +
                "  \"equipo1\": \"SHEFFIELD UNITED\",\n" +
                "  \"equipo2\": \"ARSENAL\",\n" +
                "  \"cuota1\": \"6.50\",\n" +
                "  \"cuotaEmpate\": \"3.75\",\n" +
                "  \"cuota2\": \"1.55\"\n" +
                "}]," +
                "\"10018\":[{\n" +
                "  \"hora\": \"12:00\",\n" +
                "  \"fecha\": \"12TH APR\",\n" +
                "  \"logo1\": \"15.png\",\n" +
                "  \"logo2\": \"11.png\",\n" +
                "  \"equipo1\": \"WEST BROM\",\n" +
                "  \"equipo2\": \"SOUTHAMPTON\",\n" +
                "  \"cuota1\": \"4.00\",\n" +
                "  \"cuotaEmpate\": \"3.20\",\n" +
                "  \"cuota2\": \"2.05\"\n" +
                "}]," +
                "\"10019\":[{\n" +
                "  \"hora\": \"14:15\",\n" +
                "  \"fecha\": \"12TH APR\",\n" +
                "  \"logo1\": \"16.png\",\n" +
                "  \"logo2\": \"5.png\",\n" +
                "  \"equipo1\": \"BRIGHTON\",\n" +
                "  \"equipo2\": \"EVERTON\",\n" +
                "  \"cuota1\": \"2.25\",\n" +
                "  \"cuotaEmpate\": \"3.30\",\n" +
                "  \"cuota2\": \"3.10\"\n" +
                "}]" +
                "}");
        Iterator<String> keys = tableJson.keys();
        Set<ApuestaApi> apuestasApi =new HashSet<>();
        ArrayList<String> idApuestas = new ArrayList<>();
        for(int i = 0; i< tableJson.keySet().toArray().length; i++){
            idApuestas.add(i,tableJson.keySet().toArray()[i].toString());
        }
        int sizeIdApuestas = 0;
        while(keys.hasNext()) {


            String premio1 = tableJson.getJSONArray(keys.next()).get(0).toString();
            //System.out.println(premio1);
            JSONObject premio1Json = new JSONObject(premio1);
            //System.out.println(premio1Json.get("equipo1"));
            ApuestaApi apuesta = new ApuestaApi(idApuestas.get(sizeIdApuestas),premio1Json.get("hora").toString(), premio1Json.get("fecha").toString(), premio1Json.get("logo1").toString(),
                    premio1Json.get("logo2").toString(), premio1Json.get("equipo1").toString(), premio1Json.get("equipo2").toString(),
                    premio1Json.get("cuota1").toString(), premio1Json.get("cuotaEmpate").toString(), premio1Json.get("cuota2").toString());
            apuestasApi.add(apuesta);
            sizeIdApuestas++;
        }
        //System.out.println("Esto es lo que deberia imprimir \n" + apuestasApi.toString() );
        return apuestasApi;
    }
}
