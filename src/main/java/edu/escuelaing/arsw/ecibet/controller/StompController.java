package edu.escuelaing.arsw.ecibet.controller;

import edu.escuelaing.arsw.ecibet.model.ApuestaApi;
import edu.escuelaing.arsw.ecibet.persistence.apis.ApiConnections;
import edu.escuelaing.arsw.ecibet.persistence.impl.ApiConnectionsImpl;
import edu.escuelaing.arsw.ecibet.services.ApuestasService;
import edu.escuelaing.arsw.ecibet.services.impl.ApuestasServiceImpl;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.messaging.handler.annotation.DestinationVariable;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Controller;


import java.util.Collections;
import java.util.Set;


@Controller
public class StompController {
    @Autowired
    SimpMessagingTemplate msgt;

    @Autowired
    @Qualifier("apuestasServiceImpl")
    ApuestasService apuesServi;

    @MessageMapping("/newpoint")
    public void handlePointEvent(String updat) throws Exception {
        //System.out.println("llega perra");
        JSONObject json=new JSONObject(updat);
       // System.out.println("Nuevo UPDATE recibido en el servidor!: "+updat);
        apuesServi.getobjeto().setApuestas(json);
        Set<ApuestaApi> resp=apuesServi.getTableBets();
       // System.out.println("esta es la info del back");

        msgt.convertAndSend("/topic/newpoint",resp);

       // ApiConnections igual=;
       // instan.setApuestas(updat);



//        if (pointsForPolygon.size()==4){
//
//            Polygon generatedPolygon=new Polygon(pointsForPolygon);
//            polygonList.add(generatedPolygon);
//            pointsForPolygon = Collections.synchronizedList(new ArrayList<Point>());
//            msgt.convertAndSend("/topic/newpolygon."+numdibujo, generatedPolygon);
//        }


    }
}
