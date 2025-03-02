package com.clases;

import com.enums.*;
import java.util.Date;

public class jugador {
    private String nombre;
    private Date nacimiento;
    private String pais;
    private posicion posicion;
    private int dorsal;
    private traspaso traspaso;
    private equipo equipo;

    public jugador(String nombre_jug, Date nacimiento_jug, String pais_jug, posicion posicion_jug, int dorsal_jug,
            traspaso traspaso_jug, equipo equipo_jug) {
        this.nombre = (nombre_jug != null) ? nombre : "Ninguno";
        this.nacimiento = (nacimiento_jug != null) ? nacimiento : new Date();
        this.pais = (pais_jug != null) ? pais : "Ninguno";
        this.posicion = (posicion_jug != null) ? posicion : posicion.reserva;
        this.dorsal = (dorsal_jug >= 1) ? dorsal : 0;
        this.traspaso = (traspaso_jug != null) ? traspaso : traspaso.sin_solicitar;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = (nombre != null) ? nombre : "Ninguno";
    }

    public Date getNacimiento() {
        return nacimiento;
    }

    public void setNacimiento(Date nacimiento) {
        this.nacimiento = (nacimiento != null) ? nacimiento : new Date();
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = (pais != null) ? pais : "Ninguno";
    }

    public posicion getPosicion() {
        return posicion;
    }

    public void setPosicion(posicion posicion) {
        this.posicion = (posicion != null) ? posicion : posicion.reserva;
    }

    public int getDorsal() {
        return dorsal;
    }

    public void setDorsal(int dorsal) {
        this.dorsal = (dorsal >= 1) ? dorsal : 0;
    }

    public traspaso getTraspaso() {
        return traspaso;
    }

    public void setTraspaso(traspaso traspaso) {
        this.traspaso = (traspaso != null) ? traspaso : traspaso.sin_solicitar;
    }

    public equipo getEquipo() {
        return equipo;
    }

    public void setEquipo(equipo equipo) {
        this.equipo = equipo;
    }

}