package edu.escuelaing.arsw.ecibet.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

@Entity
@Table(name = "usuarios")
public class Usuario implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;
    @Column(updatable = true)
    private int saldo;
    @Column
    private String username;
    @Column
    private String password;
    @Column(length =30, unique = true, updatable = false)
    private String correo;
    @Column(length = 20, updatable = false)
    private String tipoId;
    @Column(updatable = false)
    private String fechaNacimiento;
    @Column(updatable = true)
    private boolean enabled;

    public Usuario() {

    }

    public Usuario(int saldo, String username, String password, String correo, String tipoId,
                   String fechaNacimiento, Boolean enabled){
        this.saldo = saldo;
        this.username = username;
        this.password = password;
        this.correo = correo;
        this.tipoId = tipoId;
        this.fechaNacimiento = fechaNacimiento;
        this.enabled = enabled;
    }


    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getTipoId() {
        return tipoId;
    }

    public void setTipoId(String tipoId) {
        this.tipoId = tipoId;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
}