package com.appcap.despachosbodega20.Clases;

public class Contiene {
    private Reserva reserva;
    private Material material;

    public Contiene (Material material, Reserva reserva){
        this.material = material;
        this.reserva = reserva;
    }
    public Material getMaterial() {
        return material;
    }

    public void setMaterial(Material material) {
        this.material = material;
    }

    public Reserva getReserva() {
        return reserva;
    }

    public void setReserva(Reserva reserva) {
        this.reserva = reserva;
    }
}
