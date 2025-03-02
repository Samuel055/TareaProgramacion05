package com.clases;

import java.util.ArrayList;

public class equipo {
    private String nombre;
    private String abreviatura;
    private entrenador entrenador;
    private presidente presidente;
    private ArrayList<jugador> jugador;

    public equipo(String nombre_equi, String abreviatura_equi, entrenador entrenador_equi, presidente presidente_equi,
            ArrayList jugador_equi) {
        this.nombre = (nombre_equi != null) ? nombre : "Ninguno";
        this.abreviatura = (abreviatura_equi != null) ? abreviatura : "Ningunoo";
        this.entrenador = entrenador_equi;
        this.presidente = presidente_equi;
        this.jugador = (jugador_equi != null) ? jugador : new ArrayList<>();
    }

    public void agregarJug(jugador jugador) {
        if (jugador != null) {
            this.jugador.add(jugador);
            jugador.setEquipo(this);
        }
    }
    
    public void eliminarJug(jugador jugador) {
        if (jugador != null && this.jugador.contains(jugador)) {
            this.jugador.remove(jugador);
            jugador.setEquipo(null);
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = (nombre != null) ? nombre : "Ninguno";
    }

    public String getAbreviatura() {
        return abreviatura;
    }

    public void setAbreviatura(String abreviatura) {
        this.abreviatura = (abreviatura != null) ? abreviatura : "Ninguno";
    }

    public entrenador getEntrenador() {
        return entrenador;
    }

    public void setEntrenador(entrenador entrenador) {
        this.entrenador = entrenador;
    }

    public presidente getPresidente() {
        return presidente;
    }

    public void setPresidente(presidente presidente) {
        this.presidente = presidente;
    }

    public ArrayList<jugador> getJugador() {
        return jugador;
    }

    public void setJugador(ArrayList<jugador> jugador) {
        if (jugador != null) {
            this.jugador = jugador;
        }
    }

}