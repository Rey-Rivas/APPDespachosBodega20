package com.appcap.despachosbodega20.Clases;

public class Recibida {
    public User admin;
    public Reserva reserva;

    public Recibida (User admin, Reserva reserva){
        this.admin = admin;
        this.reserva = reserva;
    }

    public Reserva getReserva() {
        return reserva;
    }

    public void setReserva(Reserva reserva) {
        this.reserva = reserva;
    }

    public User getAdmin() {
        return admin;
    }

    public void setAdmin(User admin) {
        this.admin = admin;
    }
}
