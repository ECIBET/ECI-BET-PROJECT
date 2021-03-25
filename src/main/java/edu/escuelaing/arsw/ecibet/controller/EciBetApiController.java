package edu.escuelaing.arsw.ecibet.controller;

import edu.escuelaing.arsw.ecibet.services.EciBetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/usuarios")
public class EciBetApiController {

    @Autowired
    @Qualifier("eciBetServiceImpl")
    EciBetService eciBetSer;



    @RequestMapping(method = RequestMethod.GET, value = "/{id}")
    public ResponseEntity<?> obtenerUsuario(@PathVariable int id) {
        return new ResponseEntity<>(eciBetSer.findUsuarioById(id), HttpStatus.ACCEPTED);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/correos/{correo}")
    public ResponseEntity<?> obtenerUsuarioCorreo(@PathVariable String correo) {
        return new ResponseEntity<>(eciBetSer.findusuarioByCorreo(correo), HttpStatus.ACCEPTED);
    }

    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<?> crearUsuario(@RequestBody String[] datosUsuario) {
        eciBetSer.agregarUsuario(datosUsuario);
        return new ResponseEntity<>(HttpStatus.ACCEPTED);
    }



}