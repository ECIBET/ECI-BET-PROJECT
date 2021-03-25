package edu.escuelaing.arsw.ecibet.controller;

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

    @RequestMapping(method = RequestMethod.GET, value = "/premiereleague")
    public ResponseEntity<?> getTablePremiere() {
        return new ResponseEntity<>(apuesServi.getTablePremierLeague(), HttpStatus.ACCEPTED);
    }


}
