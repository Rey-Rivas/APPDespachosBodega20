package com.appcap.despachosbodega20.Clases;

import java.util.Date;

public class Despacha {
    private Date fechaRecepcion;
    private int idDespacho, stockDespachado;
    private User repartidor, ejecutor;
    private Reserva reserva;
    private Material material;

    public Despacha(Date fechaRecepcion, int idDespacho, int stockDespachado, User repartidor,
                    User ejecutor, Reserva reserva, Material material){
        this.fechaRecepcion = fechaRecepcion;
        this.idDespacho = idDespacho;
        this.stockDespachado = stockDespachado;
        this.repartidor = repartidor;
        this.ejecutor = ejecutor;
        this.reserva = reserva;
        this.material = material;
    }

    public User getRepartidor() {
        return repartidor;
    }

    public void setRepartidor(User repartidor) {
        this.repartidor = repartidor;
    }

    public Reserva getReserva() {
        return reserva;
    }

    public void setReserva(Reserva reserva) {
        this.reserva = reserva;
    }

    public Material getMaterial() {
        return material;
    }

    public void setMaterial(Material material) {
        this.material = material;
    }

    public User getEjecutor() {
        return ejecutor;
    }

    public void setEjecutor(User ejecutor) {
        this.ejecutor = ejecutor;
    }

    public Date getFechaRecepcion() {
        return fechaRecepcion;
    }

    public void setFechaRecepcion(Date fechaRecepcion) {
        this.fechaRecepcion = fechaRecepcion;
    }

    public int getIdDespacho() {
        return idDespacho;
    }

    public void setIdDespacho(int idDespacho) {
        this.idDespacho = idDespacho;
    }

    public int getStockDespachado() {
        return stockDespachado;
    }

    public void setStockDespachado(int stockDespachado) {
        this.stockDespachado = stockDespachado;
    }
}
