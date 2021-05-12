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

import java.text.SimpleDateFormat;
import java.util.Date;

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
        System.out.println(datos[0]);
        Date date = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
        String password = passworEncoder.encode(datos[4]);
        Usuario newUsuario = new Usuario(0,datos[2],password,datos[3], datos[1], formatter.format(date),true,"USER");
        saveUsuario(newUsuario);
    }



}
