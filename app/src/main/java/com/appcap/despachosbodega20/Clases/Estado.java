package com.appcap.despachosbodega20.Clases;

public class Estado {
    private int idEstado;
    private char nombreEstado;

    public void setIdEstado(int idEstado) {
        this.idEstado = idEstado;
    }

    public void setNombreEstado(char nombreEstado){
        this.nombreEstado = nombreEstado;
    }

    public int getIdEstado(){
        return idEstado;
    }

    public char getNombreEstado(){
        return nombreEstado;
    }
}

