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
    private Date fecha;
    @Column(updatable = true)
    private int cuota;
    private int valorApostado;
    @Column(updatable = true)
    private boolean estado;

    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<Administrador> administradores = new CopyOnWriteArrayList<>();
    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<Partido> partidos = new CopyOnWriteArrayList<>();
    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<Usuario> usuarios = new CopyOnWriteArrayList<>();

    public Apuesta(){

    }
    public Apuesta(int id, Date fecha, int marcadorA, int marcadorB, int ganancia, int valorApostado, boolean estado) {
        this.id = id;
        this.fecha = fecha;
        this.cuota = ganancia;
        this.valorApostado = valorApostado;
        this.estado = estado;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Administrador> getAdministradores() {
        return administradores;
    }

    public void setAdministradores(List<Administrador> administradores) {
        this.administradores = administradores;
    }

    public List<Usuario> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(List<Usuario> usuarios) {
        this.usuarios = usuarios;
    }

    public List<Administrador> getApuestas() {
        return administradores;
    }

    public void setApuestas(List<Administrador> administradores) {
        this.administradores = administradores;
    }

    public List<Partido> getPartidos() {
        return partidos;
    }

    public void setPartidos(List<Partido> partidos) {
        this.partidos = partidos;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }


    public int getCuota() {
        return cuota;
    }

    public void setCuota(int cuota) {
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
