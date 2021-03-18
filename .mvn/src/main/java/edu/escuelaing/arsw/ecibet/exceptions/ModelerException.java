package edu.escuelaing.arsw.ecibet.exceptions;

public class ModelerException extends Exception{
    public static String existeUsuario ="Ya existe un usuario con este email";
    public static String noEsUnCorreoValido="Revise el correo enviado";
    public static String nombreDeUsuarioInvalido="Ya esta en uso este nombre de usuario";

    public ModelerException(String ms) {
        super(ms);
    }
}