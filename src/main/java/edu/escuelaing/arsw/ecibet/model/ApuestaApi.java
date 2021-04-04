package edu.escuelaing.arsw.ecibet.model;

public class ApuestaApi {

    private String idApuesta;
    private String hora;
    private String Fecha;
    private String logo1;
    private String logo2;
    private String equipo1;
    private String equipo2;
    private String cuota1;
    private String cuotaEmpate;
    private String cuota2;

    public ApuestaApi(String idApuesta,String hora, String fecha, String logo1, String logo2, String equipo1, String equipo2, String cuota1, String cuotaEmpate, String cuota2) {
        this.idApuesta = idApuesta;
        this.hora = hora;
        this.Fecha = fecha;
        this.logo1 = logo1;
        this.logo2 = logo2;
        this.equipo1 = equipo1;
        this.equipo2 = equipo2;
        this.cuota1 = cuota1;
        this.cuotaEmpate = cuotaEmpate;
        this.cuota2 = cuota2;
    }

    public String getIdApuesta() {
        return idApuesta;
    }

    public void setIdApuesta(String idApuesta) {
        this.idApuesta = idApuesta;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getFecha() {
        return Fecha;
    }

    public void setFecha(String fecha) {
        Fecha = fecha;
    }

    public String getLogo1() {
        return logo1;
    }

    public void setLogo1(String logo) {
        this.logo1 = logo1;
    }

    public String getLogo2() {
        return logo2;
    }

    public void setLogo2(String logo) {
        this.logo2 = logo2;
    }

    public String getEquipo1() {
        return equipo1;
    }

    public void setEquipo1(String equipo1) {
        this.equipo1 = equipo1;
    }

    public String getEquipo2() {
        return equipo2;
    }

    public void setEquipo2(String equipo2) {
        this.equipo2 = equipo2;
    }

    public String getCuota1() {
        return cuota1;
    }

    public void setCuota1(String cuota1) {
        this.cuota1 = cuota1;
    }

    public String getCuotaEmpate() {
        return cuotaEmpate;
    }

    public void setCuotaEmpate(String cuotaEmpate) {
        this.cuotaEmpate = cuotaEmpate;
    }

    public String getCuota2() {
        return cuota2;
    }

    public void setCuota2(String cuota2) {
        this.cuota2 = cuota2;
    }
}
