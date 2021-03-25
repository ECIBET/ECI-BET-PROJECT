package edu.escuelaing.arsw.ecibet.persistence.impl;

import edu.escuelaing.arsw.ecibet.persistence.apis.ApiConnections;
import org.springframework.stereotype.Component;

@Component
public class ApiConnectionsImpl implements ApiConnections {

    @Override
    public String getTablePremiereLeague() {
        String table = new String("{\"records\":[{\"team\":\"Manchester City\",\"played\":30,\"win\":22,\"draw\":5,\"loss\":3,\"goalsFor\":64,\"goalsAgainst\":21,\"points\":71},{\"team\":\"Manchester United\",\"played\":29,\"win\":16,\"draw\":9,\"loss\":4,\"goalsFor\":56,\"goalsAgainst\":32,\"points\":57},{\"team\":\"Leicester\",\"played\":29,\"win\":17,\"draw\":5,\"loss\":7,\"goalsFor\":53,\"goalsAgainst\":32,\"points\":56},{\"team\":\"Chelsea\",\"played\":29,\"win\":14,\"draw\":9,\"loss\":6,\"goalsFor\":44,\"goalsAgainst\":25,\"points\":51},{\"team\":\"West Ham\",\"played\":29,\"win\":14,\"draw\":7,\"loss\":8,\"goalsFor\":45,\"goalsAgainst\":35,\"points\":49},{\"team\":\"Tottenham\",\"played\":29,\"win\":14,\"draw\":6,\"loss\":9,\"goalsFor\":49,\"goalsAgainst\":30,\"points\":48},{\"team\":\"Everton\",\"played\":28,\"win\":14,\"draw\":4,\"loss\":10,\"goalsFor\":40,\"goalsAgainst\":37,\"points\":46},{\"team\":\"Liverpool\",\"played\":29,\"win\":13,\"draw\":7,\"loss\":9,\"goalsFor\":48,\"goalsAgainst\":36,\"points\":46},{\"team\":\"Arsenal\",\"played\":29,\"win\":12,\"draw\":6,\"loss\":11,\"goalsFor\":40,\"goalsAgainst\":32,\"points\":42},{\"team\":\"Aston Villa\",\"played\":28,\"win\":12,\"draw\":5,\"loss\":11,\"goalsFor\":39,\"goalsAgainst\":30,\"points\":41},{\"team\":\"Leeds\",\"played\":29,\"win\":12,\"draw\":3,\"loss\":14,\"goalsFor\":45,\"goalsAgainst\":47,\"points\":39},{\"team\":\"Crystal Palace\",\"played\":29,\"win\":10,\"draw\":7,\"loss\":12,\"goalsFor\":31,\"goalsAgainst\":47,\"points\":37},{\"team\":\"Wolverhampton Wanderers\",\"played\":29,\"win\":9,\"draw\":8,\"loss\":12,\"goalsFor\":28,\"goalsAgainst\":38,\"points\":35},{\"team\":\"Southampton\",\"played\":29,\"win\":9,\"draw\":6,\"loss\":14,\"goalsFor\":36,\"goalsAgainst\":51,\"points\":33},{\"team\":\"Burnley\",\"played\":29,\"win\":8,\"draw\":9,\"loss\":12,\"goalsFor\":22,\"goalsAgainst\":37,\"points\":33},{\"team\":\"Brighton\",\"played\":29,\"win\":7,\"draw\":11,\"loss\":11,\"goalsFor\":32,\"goalsAgainst\":36,\"points\":32},{\"team\":\"Newcastle United\",\"played\":29,\"win\":7,\"draw\":7,\"loss\":15,\"goalsFor\":28,\"goalsAgainst\":48,\"points\":28},{\"team\":\"Fulham\",\"played\":30,\"win\":5,\"draw\":11,\"loss\":14,\"goalsFor\":23,\"goalsAgainst\":38,\"points\":26},{\"team\":\"West Bromwich Albion\",\"played\":29,\"win\":3,\"draw\":9,\"loss\":17,\"goalsFor\":20,\"goalsAgainst\":57,\"points\":18},{\"team\":\"Sheffield United\",\"played\":29,\"win\":4,\"draw\":2,\"loss\":23,\"goalsFor\":16,\"goalsAgainst\":50,\"points\":14}]}");
        System.out.println("Esto es lo que deberia imprimir \n" + table );
        return table;
    }
}
