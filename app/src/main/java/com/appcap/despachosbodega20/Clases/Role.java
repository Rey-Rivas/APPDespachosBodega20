package com.appcap.despachosbodega20.Clases;

public class Role {
    private static int contador = 0;
    private int idRole;
    private String nombreRol;

    public Role(String nombreRol){
        if(validarRol(nombreRol)) {
            this.idRole = contador++;
            this.nombreRol = nombreRol;
        }else{
            throw new IllegalArgumentException("Rol inválido");
        }
    }
    public void setNombreRol(String nombreRol){
        if(validarRol(nombreRol)) {
            this.nombreRol = nombreRol;
        }else{
            throw new IllegalArgumentException("Rol inválido");
        }
    }

    public int getIdRole(){
        return idRole;
    }

    public String getNombreRol(){
        return nombreRol;
    }

    private boolean validarRol(String nombreRol){
        return nombreRol != null && (nombreRol.equals("Administrador") ||
                nombreRol.equals("Ejecutor") || nombreRol.equals("Repartidor"));
    }
}

