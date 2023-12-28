package com.appcap.despachosbodega20.Clases;

public class Departamento {
    private int idDepartamento;
    private char nombreDepartamento;

    public Departamento(int idDepartamento, char nombreDepartamento){
        this.idDepartamento = idDepartamento;
        this.nombreDepartamento = nombreDepartamento;
    }

    public void setIdDepartamento(int idDepartamento) {
        this.idDepartamento = idDepartamento;
    }

    public void setNombreDepartamento(char nombreDepartamento) {
        this.nombreDepartamento = nombreDepartamento;
    }

    public int getIdDepartamento() {
        return idDepartamento;
    }

    public char getNombreDepartamento() {
        return nombreDepartamento;
    }
}
