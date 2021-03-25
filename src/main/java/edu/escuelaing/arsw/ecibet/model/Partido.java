package edu.escuelaing.arsw.ecibet.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

@Entity
@Table(name = "partidos")
public class Partido implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;
    @Column(updatable = true)
    private int marcadorA;
    @Column(updatable = true)
    private int marcadorB;
    @Column(updatable = false)
    private Date fecha;
    @Column(updatable = true)
    private boolean estado;
    private String nombreDeporte;
    private String tipoEncuentro;
    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<Equipo> equipos = new CopyOnWriteArrayList<>();
    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<Deporte> deportes = new CopyOnWriteArrayList<>();
    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<Dato> datos = new CopyOnWriteArrayList<>();

    public Partido(int id, int marcadorA, int marcadorB, Date fecha, boolean estado, String nombreDeporte, String tipoEncuentro) {
        this.id = id;
        this.marcadorA = marcadorA;
        this.marcadorB = marcadorB;
        this.fecha = fecha;
        this.estado = estado;
        this.nombreDeporte = nombreDeporte;
        this.tipoEncuentro = tipoEncuentro;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public String getNombreDeporte() {
        return nombreDeporte;
    }

    public void setNombreDeporte(String nombreDeporte) {
        this.nombreDeporte = nombreDeporte;
    }

    public String getTipoEncuentro() {
        return tipoEncuentro;
    }

    public void setTipoEncuentro(String tipoEncuentro) {
        this.tipoEncuentro = tipoEncuentro;
    }

    public List<Equipo> getEquipos() {
        return equipos;
    }

    public void setEquipos(List<Equipo> equipos) {
        this.equipos = equipos;
    }

    public List<Deporte> getDeportes() {
        return deportes;
    }

    public void setDeportes(List<Deporte> deportes) {
        this.deportes = deportes;
    }

    public List<Dato> getDatos() {
        return datos;
    }

    public void setDatos(List<Dato> datos) {
        this.datos = datos;
    }
}
