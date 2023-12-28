package com.appcap.despachosbodega20.Clases;

public class CentroCosto {
    private int idCentroCosto;
    private String nombreCentroCosto;
    private Departamento departamento;

    public CentroCosto(int idCentroCosto, String nombreCentroCosto, Departamento departamento){
        this.idCentroCosto = idCentroCosto;
        this.nombreCentroCosto = nombreCentroCosto;
        this.departamento = departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }

    public void setIdCentroCosto(int idCentroCosto) {
        this.idCentroCosto = idCentroCosto;
    }

    public void setNombreCentroCosto(String nombreCentroCosto) {
        this.nombreCentroCosto = nombreCentroCosto;
    }

    public int getIdCentroCosto() {
        return idCentroCosto;
    }

    public String getNombreCentroCosto() {
        return nombreCentroCosto;
    }

    public Departamento getDepartamento() {
        return departamento;
    }
}
