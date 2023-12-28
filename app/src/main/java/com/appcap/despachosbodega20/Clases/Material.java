package com.appcap.despachosbodega20.Clases;

public class Material {
    private Long codSAP;
    private String codAntiguo, descripcion, unidad, Ubicacion;
    private int stock;

    public Material(Long codSAP, String codAntiguo, String descripcion, String unidad, String ubicacion, int stock){
        this.codSAP = codSAP;
        if (validarCodigoAntiguo(codAntiguo)) {
            this.codAntiguo = codAntiguo;
        }else{
            throw new IllegalArgumentException("Formato incorrecto para el codigo antiguo");
        }
        this.descripcion = descripcion;
        this.unidad = unidad;
        if (validarUbicacion(ubicacion)) {
            this.Ubicacion = ubicacion;
        }else{
            throw new IllegalArgumentException("Formato de ubicación inválido");
        }
        this.stock = stock;

    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getUnidad() {
        return unidad;
    }

    public void setUnidad(String unidad) {
        this.unidad = unidad;
    }

    public String getUbicacion() {
        return Ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        if (validarUbicacion(ubicacion)){
            this.Ubicacion = ubicacion;
        }else{
            throw new IllegalArgumentException("Formato de ubicación inválido");
        }
    }

    public String getCodAntiguo() {
        return codAntiguo;
    }

    public void setCodAntiguo(String codAntiguo) {
        if(validarCodigoAntiguo(codAntiguo)){
            this.codAntiguo = codAntiguo;
        }else{
            throw new IllegalArgumentException("Formato incorrecto para el codigo antiguo");
        }

    }

    public Long getCodSAP() {
        return codSAP;
    }

    public void setCodSAP(Long codSAP) {
        this.codSAP = codSAP;
    }

    private boolean validarUbicacion(String Ubicacion){
        return Ubicacion != null && Ubicacion.matches("[Bb][1-9][Ee][1-20][aA-Dd][1-13]");
    }

    private boolean validarCodigoAntiguo(String codAntiguo){
        return codAntiguo != null && codAntiguo.startsWith("CSH-");
    }
}
