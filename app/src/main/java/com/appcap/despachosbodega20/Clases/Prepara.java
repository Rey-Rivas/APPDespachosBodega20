package com.appcap.despachosbodega20.Clases;

public class Prepara {
    private int idPreparacion, stockDisponible;
    private User admin;
    private Material material;
    private Reserva reserva;

    public Prepara (int idPreparacion, int stockDisponible, User admin, Material material, Reserva reserva){
        this.idPreparacion = idPreparacion;
        this.stockDisponible = stockDisponible;
        this.admin= admin;
        this.material = material;
        this.reserva = reserva;
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

    public User getAdmin() {
        return admin;
    }

    public void setAdmin(User admin) {
        this.admin = admin;
    }

    public int getIdPreparacion() {
        return idPreparacion;
    }

    public void setIdPreparacion(int idPreparacion) {
        this.idPreparacion = idPreparacion;
    }

    public int getStockDisponible() {
        return stockDisponible;
    }

    public void setStockDisponible(int stockDisponible) {
        this.stockDisponible = stockDisponible;
    }
}
