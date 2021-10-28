package com.gelionz.gelionzgamer;

public class Eventos2 {

    private String tipo_evento;
    private String fecha_hora_evento;
    private String valor_evento;
    private String ganador_evento;
    private String cantidad_jugadores;
    private String estado;
    private String organizador;

    public Eventos2() {
    }

    public Eventos2(String tipo_evento, String fecha_hora_evento, String valor_evento, String ganador_evento, String cantidad_jugadores, String estado, String organizador) {
        this.tipo_evento = tipo_evento;
        this.fecha_hora_evento = fecha_hora_evento;
        this.valor_evento = valor_evento;
        this.ganador_evento = ganador_evento;
        this.cantidad_jugadores = cantidad_jugadores;
        this.estado = estado;
        this.organizador = organizador;
    }

    public String getTipo_evento() {
        return tipo_evento;
    }

    public void setTipo_evento(String tipo_evento) {
        this.tipo_evento = tipo_evento;
    }

    public String getFecha_hora_evento() {
        return fecha_hora_evento;
    }

    public void setFecha_hora_evento(String fecha_hora_evento) {
        this.fecha_hora_evento = fecha_hora_evento;
    }

    public String getValor_evento() {
        return valor_evento;
    }

    public void setValor_evento(String valor_evento) {
        this.valor_evento = valor_evento;
    }

    public String getGanador_evento() {
        return ganador_evento;
    }

    public void setGanador_evento(String ganador_evento) {
        this.ganador_evento = ganador_evento;
    }

    public String getCantidad_jugadores() {
        return cantidad_jugadores;
    }

    public void setCantidad_jugadores(String cantidad_jugadores) {
        this.cantidad_jugadores = cantidad_jugadores;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getOrganizador() {
        return organizador;
    }

    public void setOrganizador(String organizador) {
        this.organizador = organizador;
    }

    @Override
    public String toString() {
        return "Eventos2{" +
                "tipo_evento='" + tipo_evento + '\'' +
                ", fecha_hora_evento='" + fecha_hora_evento + '\'' +
                ", valor_evento='" + valor_evento + '\'' +
                ", ganador_evento='" + ganador_evento + '\'' +
                ", cantidad_jugadores='" + cantidad_jugadores + '\'' +
                ", estado='" + estado + '\'' +
                ", organizador='" + organizador + '\'' +
                '}';
    }
}
