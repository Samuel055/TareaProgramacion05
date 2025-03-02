/**
 * Clase que representa un equipo de fútbol.
 */
package com.clases;

import com.enums.*;
import java.util.ArrayList;

public class equipo {
    /** Nombre del equipo. */
    private String nombre;
    /** Abreviatura del equipo. */
    private String abreviatura;
    /** Entrenador del equipo. */
    private entrenador entrenador;
    /** Presidente del equipo. */
    private presidente presidente;
    /** Lista de jugadores del equipo. */
    private ArrayList<jugador> jugador;
    /** Contador estático del total de equipos creados. */
    private static int totalEqui = 0;

    /**
     * Constructor de la clase equipo.
     * 
     * @param nombre_equi      Nombre del equipo.
     * @param abreviatura_equi Abreviatura del equipo.
     * @param entrenador_equi  Entrenador del equipo.
     * @param presidente_equi  Presidente del equipo.
     * @param jugador_equi     Lista de jugadores del equipo.
     */
    public equipo(String nombre_equi, String abreviatura_equi, entrenador entrenador_equi, presidente presidente_equi,
            ArrayList jugador_equi) {
        this.nombre = (nombre_equi != null) ? nombre_equi : "Ninguno";
        this.abreviatura = (abreviatura_equi != null) ? abreviatura_equi : "Ningunoo";
        this.entrenador = entrenador_equi;
        this.presidente = presidente_equi;
        this.jugador = (jugador_equi != null) ? jugador_equi : new ArrayList<>();
        totalEqui++;
    }

    /**
     * Obtiene el total de equipos creados.
     * 
     * @return Total de equipos creados.
     */
    public static int getTotalEqui() {
        return totalEqui;
    }

    /**
     * Agrega un jugador al equipo.
     * 
     * @param jugador Jugador a agregar.
     */
    public void agregarJug(jugador jugador) {
        if (jugador != null) {
            this.jugador.add(jugador);
            jugador.setEquipo(this);
        }
    }

    /**
     * Elimina un jugador del equipo.
     * 
     * @param jugador Jugador a eliminar.
     */
    public void eliminarJug(jugador jugador) {
        if (jugador != null && this.jugador.contains(jugador)) {
            this.jugador.remove(jugador);
            jugador.setEquipo(null);
        }
    }

    /**
     * Resetea los estados de traspaso de los jugadores que fueron rechazados.
     */
    public void reseteo() {
        for (jugador jugador : jugador) {
            if (jugador.getTraspaso() == traspaso.rechazado_por_entrenador ||
                    jugador.getTraspaso() == traspaso.rechazado_por_presidente) {
                jugador.setTraspaso(traspaso.sin_solicitar);
            }
        }
        System.out.println("Estados de traspaso reseteados de: " + nombre);
    }

    /**
     * Obtiene el nombre del equipo.
     * 
     * @return Nombre del equipo.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre del equipo.
     * 
     * @param nombre Nombre del equipo.
     */
    public void setNombre(String nombre) {
        this.nombre = (nombre != null) ? nombre : "Ninguno";
    }

    /**
     * Obtiene la abreviatura del equipo.
     * 
     * @return Abreviatura del equipo.
     */
    public String getAbreviatura() {
        return abreviatura;
    }

    /**
     * Establece la abreviatura del equipo.
     * 
     * @param abreviatura Abreviatura del equipo.
     */
    public void setAbreviatura(String abreviatura) {
        this.abreviatura = (abreviatura != null) ? abreviatura : "Ninguno";
    }

    /**
     * Obtiene el entrenador del equipo.
     * 
     * @return Entrenador del equipo.
     */
    public entrenador getEntrenador() {
        return entrenador;
    }

    /**
     * Establece el entrenador del equipo.
     * 
     * @param entrenador Entrenador del equipo.
     */
    public void setEntrenador(entrenador entrenador) {
        this.entrenador = entrenador;
    }

    /**
     * Obtiene el presidente del equipo.
     * 
     * @return Presidente del equipo.
     */
    public presidente getPresidente() {
        return presidente;
    }

    /**
     * Establece el presidente del equipo.
     * 
     * @param presidente Presidente del equipo.
     */
    public void setPresidente(presidente presidente) {
        this.presidente = presidente;
    }

    /**
     * Obtiene la lista de jugadores del equipo.
     * 
     * @return Lista de jugadores.
     */
    public ArrayList<jugador> getJugador() {
        return jugador;
    }

    /**
     * Establece la lista de jugadores del equipo.
     * 
     * @param jugador Lista de jugadores.
     */
    public void setJugador(ArrayList<jugador> jugador) {
        if (jugador != null) {
            this.jugador = jugador;
        }
    }

    /**
     * Devuelve una representación en cadena del equipo.
     * 
     * @return Cadena con la información del equipo.
     */
    @Override
    public String toString() {
        String comprobarEntrenador = (entrenador != null) ? entrenador.getNombre() : "Ningun entrenador";
        String comprobarPresidente = (presidente != null) ? presidente.getNombre() : "Ningun presidente";
        return "equipo [nombre=" + nombre + ", abreviatura=" + abreviatura + ", entrenador=" + comprobarEntrenador
                + ", presidente=" + comprobarPresidente + ", jugador=" + jugador + "]";
    }
}
