package edu.escuelaing.arsw.ecibet.controller;

import edu.escuelaing.arsw.ecibet.model.Apuesta;
import edu.escuelaing.arsw.ecibet.services.ApuestasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/tables")
public class ApuestasApiController {

    //Is not Apuestas services, or Apuestasapicontroller anotherone ---> looking tables is correct

    @Autowired
    @Qualifier("apuestasServiceImpl")
    ApuestasService apuesServi;

    @RequestMapping(method = RequestMethod.GET, value = "/premierleague")
    public ResponseEntity<?> getTablePremiere() {
        return new ResponseEntity<>(apuesServi.getTablePremierLeague(), HttpStatus.ACCEPTED);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/bets")
    public ResponseEntity<?> getTableBets() {
        return new ResponseEntity<>(apuesServi.getTableBets(), HttpStatus.ACCEPTED);
    }
    @RequestMapping(method = RequestMethod.GET, value = "/stats")
    public ResponseEntity<?> getTableStats() {
        return new ResponseEntity<>(apuesServi.getTablePremierLeague().get("records").toString(), HttpStatus.ACCEPTED);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/apuestas")
    public ResponseEntity<?> getTableApuestas() {
        return new ResponseEntity<>(apuesServi.getTableApuestas(), HttpStatus.ACCEPTED);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/apuestas/{id}")
    public ResponseEntity<?> getTableApuestasUsuario(@PathVariable int id) {
        return new ResponseEntity<>(apuesServi.getTableApuestasUsuario(id), HttpStatus.ACCEPTED);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/{id}/apuestas")
    public ResponseEntity<?> guardarApuesta(@RequestBody String apuesta, @PathVariable int id) {
        System.out.println("apuestas api controler"+apuesta);
        apuesServi.guardarApuesta(apuesta);
        return new ResponseEntity<>(HttpStatus.ACCEPTED);
    }


}
