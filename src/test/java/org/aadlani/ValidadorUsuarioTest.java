package org.aadlani;

import org.aadlani.ValidadorUsuario;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ValidadorUsuarioTest {

    // ========= Tests for validarNombreUsuario =============..=======

    @Test
    public void testValidarNombreUsuario() {
        ValidadorUsuario validador = new ValidadorUsuario();


        assertTrue(validador.validarNombreUsuario("usuario123"), "The username should be valid");
        assertFalse(validador.validarNombreUsuario("usr"), "The username should be invalid (less than 5 characters)");
        assertFalse(validador.validarNombreUsuario("usuario_muy_largo"), "The username should be invalid (more than 15 characters)");
        assertFalse(validador.validarNombreUsuario("user@123"), "The username should be invalid (contains invalid characters)");
    }

    // ==================== Tests for validarContrasena ====================

    @Test
    public void testValidarContrasena() {
        ValidadorUsuario validador = new ValidadorUsuario();

        assertTrue(validador.validarContrasena("Clave1234"), "The password should be valid");
        assertFalse(validador.validarContrasena("abc123"), "The password should be invalid (less than 8 characters)");
        assertFalse(validador.validarContrasena("ClaveClave"), "The password should be invalid (no numbers)");
        assertFalse(validador.validarContrasena("12345678"), "The password should be invalid (no letters)");
    }

    // ================ Tests for validarCorreo ===== ===============

    @Test
    public void testValidarCorreo() {
        ValidadorUsuario validador = new ValidadorUsuario();


        assertTrue(validador.validarCorreo("usuario@mail.com"), "The email should be valid!!!");
        assertFalse(validador.validarCorreo("usermail.com"), "The email should be invalid (no @ !!)");
        assertFalse(validador.validarCorreo("usuario@correo"), "The email should be invalid (no domain) .com");
        assertFalse(validador.validarCorreo("user@mail..com"), "The email should be invalid (incorrect format)");
    }

}