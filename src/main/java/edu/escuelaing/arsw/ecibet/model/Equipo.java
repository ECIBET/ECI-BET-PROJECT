package edu.escuelaing.arsw.ecibet.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "equipos")
public class Equipo implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;
    private String nombre;
    @Column(updatable = false)
    private boolean equipoLocal;

    public Equipo(int id, String nombre, boolean equipoLocal) {
        this.id = id;
        this.nombre = nombre;
        this.equipoLocal = equipoLocal;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isEquipoLocal() {
        return equipoLocal;
    }

    public void setEquipoLocal(boolean equipoLocal) {
        this.equipoLocal = equipoLocal;
    }
}
