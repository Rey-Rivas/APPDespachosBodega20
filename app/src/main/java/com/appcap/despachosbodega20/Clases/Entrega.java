package com.appcap.despachosbodega20.Clases;

public class Entrega {
    private int idEntrega, stockPreparado;
    private User repartidor, admin;
    private Reserva reserva;

    public Entrega (int idEntrega, int stockPreparado, User repartidor, User admin, Reserva reserva){
        this.idEntrega = idEntrega;
        this.stockPreparado = stockPreparado;
        this.repartidor = repartidor;
        this.admin = admin;
        this.reserva = reserva;
    }

    public int getIdEntrega() {
        return idEntrega;
    }

    public void setIdEntrega(int idEntrega) {
        this.idEntrega = idEntrega;
    }

    public int getStockPreparado() {
        return stockPreparado;
    }

    public void setStockPreparado(int stockPreparado) {
        this.stockPreparado = stockPreparado;
    }

    public User getAdmin() {
        return admin;
    }

    public void setAdmin(User admin) {
        this.admin = admin;
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

}
