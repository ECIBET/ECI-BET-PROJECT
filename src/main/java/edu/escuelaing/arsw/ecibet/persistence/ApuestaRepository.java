package edu.escuelaing.arsw.ecibet.persistence;

import edu.escuelaing.arsw.ecibet.model.Apuesta;
import org.springframework.data.repository.CrudRepository;

public interface ApuestaRepository extends CrudRepository<Apuesta, Integer> {
}
