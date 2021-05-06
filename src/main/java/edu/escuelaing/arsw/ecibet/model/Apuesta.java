package edu.escuelaing.arsw.ecibet.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

@Entity
@Table(name = "apuestas")
public class Apuesta implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;
    @Column(updatable = false)
    private String fecha;
    @Column(updatable = true)
    private float cuota;
    private int valorApostado;
    @Column(updatable = true)
    private boolean estado;
    private String equipoApuesta;

    private int administrador;
    private int partidos;
    private int usuarios;

    public Apuesta(){

    }

    public Apuesta(int id, String fecha, float cuota, int valorApostado, boolean estado) {
        this.id = id;
        this.fecha = fecha;
        this.cuota = cuota;
        this.valorApostado = valorApostado;
        this.estado = estado;
    }

    public Apuesta(int i, String fecha, float cuota, int valorApostado, boolean estado, String equipoApuesta, int administrador, int partido, int usuario) {
        this.id = id;
        this.fecha = fecha;
        this.cuota = cuota;
        this.valorApostado = valorApostado;
        this.estado = estado;
        this.equipoApuesta = equipoApuesta;
        this.administrador = administrador;
        this.partidos = partido;
        this.usuarios =  usuario;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getEquipoApuesta() {
        return equipoApuesta;
    }

    public void setEquipoApuesta(String equipoApuesta) {
        this.equipoApuesta = equipoApuesta;
    }

    public int getAdministrador() {
        return administrador;
    }

    public void setAdministrador(int administrador) {
        this.administrador = administrador;
    }

    public int getPartidos() {
        return partidos;
    }

    public void setPartidos(int partidos) {
        this.partidos = partidos;
    }

    public int getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(int usuarios) {
        this.usuarios = usuarios;
    }

    public float getCuota() {
        return cuota;
    }

    public void setCuota(float cuota) {
        this.cuota = cuota;
    }

    public int getValorApostado() {
        return valorApostado;
    }

    public void setValorApostado(int valorApostado) {
        this.valorApostado = valorApostado;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
}
