package org.aadlani;

public class ValidadorUsuario {


    public boolean validarNombreUsuario(String nombre) {
        return nombre != null && nombre.matches("[a-zA-Z0-9]{5,15}");
    }


    public boolean validarContrasena(String contrasena) {
        return contrasena != null && contrasena.matches("^(?=.*[a-zA-Z])(?=.*\\d).{8,}$");
    }


    public boolean validarCorreo(String correo) {
        return correo != null && correo.matches("^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$")&& !correo.contains("..");
    }




}
