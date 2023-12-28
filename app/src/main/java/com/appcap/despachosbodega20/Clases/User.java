package com.appcap.despachosbodega20.Clases;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class User {
    private String RUT, correo, nombre, password;
    private short anexo;
    private Role rol;
    private CentroCosto centroCosto;

    public User(String RUT, String correo, String nombre, short anexo, CentroCosto centroCosto){
        if (validarRUT(RUT)) {
            this.RUT = RUT;
        }else{
            throw new IllegalArgumentException("RUT inválido");
        }
        this.password = encryptPassword(password);
        this.correo = correo;
        this.nombre = nombre;
        this.anexo = anexo;
        this.centroCosto = centroCosto;
    }

    public void setRol(Role rol) {
        this.rol = rol;
    }
    public Role getRol() {
        return rol;
    }
    public void setCentroCosto(CentroCosto centroCosto) {
        this.centroCosto = centroCosto;
    }
    public CentroCosto getCentroCosto() {
        return centroCosto;
    }
    public void setRUT(String RUT) {
        if(validarRUT(RUT)){
            this.RUT = RUT;
        }else{
            throw new IllegalArgumentException("RUT inválido");
        }
    }
    public String getRUT() {
        return RUT;
    }
    public void setCorreo(String correo) {
        this.correo = correo;
    }
    public String getCorreo() {
        return correo;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getNombre() {
        return nombre;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = encryptPassword(password);
    }
    public void setAnexo(short anexo) {
        this.anexo = anexo;
    }
    public short getAnexo() {
        return anexo;
    }

    private String encryptPassword(String password){
        try{
            MessageDigest md = MessageDigest.getInstance("SHA-256");
            byte[]hashedBytes = md.digest(password.getBytes());
            StringBuilder sb = new StringBuilder();
            for (byte b : hashedBytes) {
                sb.append(String.format("%02x",b));
            }
            return sb.toString();
        }catch(NoSuchAlgorithmException e){
            e.printStackTrace();
            return null;
        }
    }

    private boolean validarRUT(String RUT){
        if (RUT == null || RUT.isEmpty()) {
            return false;
        }
        RUT = RUT.replace(".", "").replace("-", "");
        if(RUT.length() < 2){
            return false;
        }
        try{
            String RUTPart = RUT.substring(0, RUT.length() - 1);
            char dv = RUT.charAt(RUT.length() - 1);

            int RUTNumber = Integer.parseInt(RUTPart);

            int m=0, s=1;
            for(; RUTNumber != 0; RUTNumber /= 10){
                s = (s + RUTNumber % 10 * (9 - m++ % 6)) % 11;
            }
            char calculatedDV = (char) (s != 0 ? s + '0' : 'K');
            return calculatedDV == dv;
        }catch (NumberFormatException e){
            return false;
        }
    }
}


