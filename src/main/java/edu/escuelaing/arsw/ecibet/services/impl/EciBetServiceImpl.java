package edu.escuelaing.arsw.ecibet.services.impl;

import edu.escuelaing.arsw.ecibet.model.*;
import edu.escuelaing.arsw.ecibet.persistence.EciBetUsuarioPersistence;
import edu.escuelaing.arsw.ecibet.services.EciBetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;

@Service
public class EciBetServiceImpl implements EciBetService {

    @Autowired
    @Qualifier("eciBetUsuarioPersistence")
    private EciBetUsuarioPersistence sas;


    @Autowired
    private BCryptPasswordEncoder passworEncoder;


    @Override
    @Transactional(readOnly = true)
    public Usuario findUsuarioById(int id) {
        return sas.findById(id).orElse(null);
    }

    @Override
    @Transactional
    public void saveUsuario(Usuario usuario) {
        sas.save(usuario);
    }


    @Override
    @Transactional(readOnly = true)
    public Usuario findusuarioByCorreo(String correo) {
        return sas.findByCorreo(correo);
    }


    @Override
    public void agregarUsuario(String[] datos) {
        System.out.println(datos[3]);
        String password = passworEncoder.encode(datos[3]);
        Usuario newUsuario = new Usuario(0, datos[1], password, datos[2], datos[4], datos[5], true);
        saveUsuario(newUsuario);
    }



}
