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
    @Column(updatable = true)
    private int partidoJugados;
    @Column(updatable = true)
    private int partidoGanados;
    @Column(updatable = true)
    private int partidoEmpatados;
    @Column(updatable = true)
    private int partidoPerdido;
    @Column(updatable = true)
    private int GF;
    @Column(updatable = true)
    private int GC;
    @Column(updatable = true)
    private int puntos;

    public Equipo(int id, String nombre, int partidoJugados, int partidoGanados, int partidoEmpatados, int partidoPerdido, int GF, int GC, int puntos) {
        this.id = id;
        this.nombre = nombre;
        this.partidoJugados = partidoJugados;
        this.partidoGanados = partidoGanados;
        this.partidoEmpatados = partidoEmpatados;
        this.partidoPerdido = partidoPerdido;
        this.GF = GF;
        this.GC = GC;
        this.puntos = puntos;
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

    public int getPartidoJugados() {
        return partidoJugados;
    }

    public void setPartidoJugados(int partidoJugados) {
        this.partidoJugados = partidoJugados;
    }

    public int getPartidoGanados() {
        return partidoGanados;
    }

    public void setPartidoGanados(int partidoGanados) {
        this.partidoGanados = partidoGanados;
    }

    public int getPartidoEmpatados() {
        return partidoEmpatados;
    }

    public void setPartidoEmpatados(int partidoEmpatados) {
        this.partidoEmpatados = partidoEmpatados;
    }

    public int getPartidoPerdido() {
        return partidoPerdido;
    }

    public void setPartidoPerdido(int partidoPerdido) {
        this.partidoPerdido = partidoPerdido;
    }

    public int getGF() {
        return GF;
    }

    public void setGF(int GF) {
        this.GF = GF;
    }

    public int getGC() {
        return GC;
    }

    public void setGC(int GC) {
        this.GC = GC;
    }

    public int getPuntos() {
        return puntos;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }
}
