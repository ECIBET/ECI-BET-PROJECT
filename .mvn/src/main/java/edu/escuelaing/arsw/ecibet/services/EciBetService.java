package edu.escuelaing.arsw.ecibet.services;

import edu.escuelaing.arsw.ecibet.model.Usuario;

public interface EciBetService {
    Usuario findUsuarioById(int id);

    Usuario findusuarioByCorreo(String correo);

    void agregarUsuario(String[] datosUsuario);
    void saveUsuario(Usuario usuario);
}
