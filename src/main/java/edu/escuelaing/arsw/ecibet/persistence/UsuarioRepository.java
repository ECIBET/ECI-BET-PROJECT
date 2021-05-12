package edu.escuelaing.arsw.ecibet.persistence;

import edu.escuelaing.arsw.ecibet.model.Usuario;
import org.springframework.data.repository.CrudRepository;

public interface UsuarioRepository extends CrudRepository<Usuario, Integer> {
    public Usuario findByCorreo(String correo);
}
