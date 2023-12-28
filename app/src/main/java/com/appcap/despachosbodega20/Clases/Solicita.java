package com.appcap.despachosbodega20.Clases;

import java.util.Date;

public class Solicita {
    private int stockRequerido;
    private Reserva reserva;
    private Material material;
    private User ejecutor;
    private Date fechaRequerida;

    public Solicita (Reserva reserva, Material material, User ejecutor, Date fechaRequerida, int stockRequerido){
        this.ejecutor = ejecutor;
        this.material = material;
        this.fechaRequerida = fechaRequerida;
        this.reserva = reserva;
        this.stockRequerido = stockRequerido;
    }

    public User getEjecutor() {
        return ejecutor;
    }

    public void setEjecutor(User ejecutor) {
        this.ejecutor = ejecutor;
    }

    public Reserva getReserva() {
        return reserva;
    }

    public void setReserva(Reserva reserva) {
        this.reserva = reserva;
    }

    public int getStockRequerido() {
        return stockRequerido;
    }

    public void setStockRequerido(int stockRequerido) {
        this.stockRequerido = stockRequerido;
    }

    public Material getMaterial() {
        return material;
    }

    public void setMaterial(Material material) {
        this.material = material;
    }

    public Date getFechaRequerida() {
        return fechaRequerida;
    }

    public void setFechaRequerida(Date fechaRequerida) {
        this.fechaRequerida = fechaRequerida;
    }
}
