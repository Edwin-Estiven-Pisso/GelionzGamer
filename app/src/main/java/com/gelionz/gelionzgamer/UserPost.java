package com.gelionz.gelionzgamer;

public class UserPost {
    private String username;
    private String email;
    private String nombres;
    private String apellidos;
    private String documento;
    private String celular;
    private String genero;
    private Boolean usuario_activo;
    private String rol_de_usuario;
    private String password;

    public UserPost() {
    }

    public UserPost(String username, String email, String nombres, String apellidos, String documento, String celular, String genero, Boolean usuario_activo, String rol_de_usuario, String password) {
        this.username = username;
        this.email = email;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.documento = documento;
        this.celular = celular;
        this.genero = genero;
        this.usuario_activo = usuario_activo;
        this.rol_de_usuario = rol_de_usuario;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public Boolean getUsuario_activo() {
        return usuario_activo;
    }

    public void setUsuario_activo(Boolean usuario_activo) {
        this.usuario_activo = usuario_activo;
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

    @Override
    public String toString() {
        return "UserPost{" +
                "username='" + username + '\'' +
                ", email='" + email + '\'' +
                ", nombres='" + nombres + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", documento='" + documento + '\'' +
                ", celular='" + celular + '\'' +
                ", genero='" + genero + '\'' +
                ", usuario_activo=" + usuario_activo +
                ", rol_de_usuario='" + rol_de_usuario + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
