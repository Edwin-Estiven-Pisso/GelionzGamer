package com.gelionz.gelionzgamer;

public class Usuarios {

     String username;
     String nombres;
     String apellidos;
     String email;
     String rol_de_usuario;
     String password;
     String confirmarpassword;

    public Usuarios() {
    }

    public Usuarios(String username, String nombres, String apellidos, String email, String rol_de_usuario, String password, String confirmarpassword) {
        this.username = username;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.email = email;
        this.rol_de_usuario = rol_de_usuario;
        this.password = password;
        this.confirmarpassword = confirmarpassword;

    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getRol_de_usuario() {
        return rol_de_usuario;
    }

    public void setRol_de_usuario(String rol_de_usuario) {
        this.rol_de_usuario = rol_de_usuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getConfirmarpassword() {
        return confirmarpassword;
    }

    public void setConfirmarpassword(String confirmarpassword) {
        this.confirmarpassword = confirmarpassword;
    }

    @Override
    public String toString() {
        return "Usuarios{" +
                "username='" + username + '\'' +
                ", nombres='" + nombres + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", email='" + email + '\'' +
                ", rol_de_usuario='" + rol_de_usuario + '\'' +
                ", password='" + password + '\'' +
                ", confirmarpassword='" + confirmarpassword + '\'' +
                '}';
    }
}
