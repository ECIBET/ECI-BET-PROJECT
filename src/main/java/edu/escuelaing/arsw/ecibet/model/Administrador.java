package edu.escuelaing.arsw.ecibet.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "administradores")
public class Administrador implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;
    private String nombre;
    @Column(unique = true, updatable = true)
    private String correo;
    @Column(unique = true, updatable = false)
    private String cedula;

    public Administrador(int id, String nombre, String correo, String cedula) {
        this.id = id;
        this.nombre = nombre;
        this.correo = correo;
        this.cedula = cedula;
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

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }
}
