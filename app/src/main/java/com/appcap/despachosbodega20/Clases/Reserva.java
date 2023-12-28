package com.appcap.despachosbodega20.Clases;

import java.util.Date;

public class Reserva {
    private int codReserva;
    private String lugarEntrega, descripcion, puntoDescarga;
    private Date fechaEmision;
    private Estado estado;
    private User ejecutor;

    public Reserva(int codReserva, String lugarEntrega, String descripcion, String puntoDescarga,
                   Date fechaEmision, User ejecutor, Estado estado){
        this.codReserva = codReserva;
        this.lugarEntrega = lugarEntrega;
        this.descripcion = descripcion;
        this.puntoDescarga = puntoDescarga;
        this.fechaEmision = fechaEmision;
        this.estado = estado;
        this.ejecutor = ejecutor;
    }

    public int getCodReserva() {
        return codReserva;
    }

    public void setCodReserva(int codReserva) {
        this.codReserva = codReserva;
    }

    public String getLugarEntrega() {
        return lugarEntrega;
    }

    public void setLugarEntrega(String lugarEntrega) {
        this.lugarEntrega = lugarEntrega;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getPuntoDescarga() {
        return puntoDescarga;
    }

    public void setPuntoDescarga(String puntoDescarga) {
        this.puntoDescarga = puntoDescarga;
    }

    public Date getFechaEmision() {
        return fechaEmision;
    }

    public void setFechaEmision(Date fechaEmision) {
        this.fechaEmision = fechaEmision;
    }

    public User getEjecutor() {
        return ejecutor;
    }

    public void setEjecutor(User ejecutor) {
        this.ejecutor = ejecutor;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

}
