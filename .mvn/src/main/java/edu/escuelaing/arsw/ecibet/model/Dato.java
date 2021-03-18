package edu.escuelaing.arsw.ecibet.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "datos")
public class Dato implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;
    @Column(updatable = true)
    private String ganador1T;
    @Column(updatable = true)
    private String ganador2T;
    @Column(updatable = true)
    private int numeroAmarillas;
    @Column(updatable = true)
    private int marcador;
    @Column(updatable = true)
    private int numeroFaltas;

    public Dato(int id, String ganador1T, String ganador2T, int numeroAmarillas, int marcador, int numeroFaltas) {
        this.id = id;
        this.ganador1T = ganador1T;
        this.ganador2T = ganador2T;
        this.numeroAmarillas = numeroAmarillas;
        this.marcador = marcador;
        this.numeroFaltas = numeroFaltas;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getGanador1T() {
        return ganador1T;
    }

    public void setGanador1T(String ganador1T) {
        this.ganador1T = ganador1T;
    }

    public String getGanador2T() {
        return ganador2T;
    }

    public void setGanador2T(String ganador2T) {
        this.ganador2T = ganador2T;
    }

    public int getNumeroAmarillas() {
        return numeroAmarillas;
    }

    public void setNumeroAmarillas(int numeroAmarillas) {
        this.numeroAmarillas = numeroAmarillas;
    }

    public int getMarcador() {
        return marcador;
    }

    public void setMarcador(int marcador) {
        this.marcador = marcador;
    }

    public int getNumeroFaltas() {
        return numeroFaltas;
    }

    public void setNumeroFaltas(int numeroFaltas) {
        this.numeroFaltas = numeroFaltas;
    }
}
