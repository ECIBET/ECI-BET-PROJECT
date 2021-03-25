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
    private int marcadorA;
    @Column(updatable = true)
    private int marcadorB;
    @Column(updatable = true)
    private int ganancia;
    private int valorApostado;
    @Column(updatable = true)
    private boolean estado;
    @Column(updatable = false)
    private int equipoLocal;

    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<Administrador> administradores = new CopyOnWriteArrayList<>();
    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<Partido> partidos = new CopyOnWriteArrayList<>();
    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<Usuario> usuarios = new CopyOnWriteArrayList<>();

    public Apuesta(int id, Date fecha, int marcadorA, int marcadorB, int ganancia, int valorApostado, boolean estado, int equipoLocal) {
        this.id = id;
        this.fecha = fecha;
        this.marcadorA = marcadorA;
        this.marcadorB = marcadorB;
        this.ganancia = ganancia;
        this.valorApostado = valorApostado;
        this.estado = estado;
        this.equipoLocal = equipoLocal;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getEquipoLocal() {
        return equipoLocal;
    }

    public void setEquipoLocal(int equipoLocal) {
        this.equipoLocal = equipoLocal;
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

    public int getMarcadorA() {
        return marcadorA;
    }

    public void setMarcadorA(int marcadorA) {
        this.marcadorA = marcadorA;
    }

    public int getMarcadorB() {
        return marcadorB;
    }

    public void setMarcadorB(int marcadorB) {
        this.marcadorB = marcadorB;
    }

    public int getGanancia() {
        return ganancia;
    }

    public void setGanancia(int ganancia) {
        this.ganancia = ganancia;
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
