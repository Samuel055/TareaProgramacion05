package com.clases;

import com.enums.*;
import java.util.Date;

/**
 * Representa un jugador de fútbol con atributos como nombre, posición, equipo y
 * estado de traspaso.
 */
public class jugador {
    private String nombre;
    private Date nacimiento;
    private String pais;
    private posicion posicion;
    private int dorsal;
    private traspaso traspaso;
    private equipo equipo;
    private static int totalJug = 0;

    /**
     * Constructor de la clase jugador.
     * 
     * @param nombre_jug     Nombre del jugador
     * @param nacimiento_jug Fecha de nacimiento del jugador
     * @param pais_jug       País de origen del jugador
     * @param posicion_jug   Posición en la que juega
     * @param dorsal_jug     Número de dorsal del jugador
     * @param traspaso_jug   Estado del traspaso
     * @param equipo_jug     Equipo actual del jugador
     */
    public jugador(String nombre_jug, Date nacimiento_jug, String pais_jug, posicion posicion_jug, int dorsal_jug,
            traspaso traspaso_jug, equipo equipo_jug) {
        this.nombre = (nombre_jug != null) ? nombre_jug : "Ninguno";
        this.nacimiento = (nacimiento_jug != null) ? nacimiento_jug : new Date();
        this.pais = (pais_jug != null) ? pais_jug : "Ninguno";
        this.posicion = (posicion_jug != null) ? posicion_jug : posicion.reserva;
        this.dorsal = (dorsal_jug >= 1) ? dorsal_jug : 0;
        this.traspaso = (traspaso_jug != null) ? traspaso_jug : traspaso.sin_solicitar;
        totalJug++;
    }

    /**
     * Obtiene el número total de jugadores creados.
     * 
     * @return Número total de jugadores.
     */
    public static int getTotalJug() {
        return totalJug;
    }

    /**
     * Solicita un traspaso para el jugador.
     */
    public void solicitudDeTraspaso() {
        if (this.traspaso == traspaso.sin_solicitar) {
            this.traspaso = traspaso.solicitado;
            System.out.println("El jugador " + this.nombre + " esta solicitando un traspaso.");
        } else {
            System.out.println("El jugador " + this.nombre + " ya ha solicitado un traspaso.");
        }
    }

    /**
     * Aceptación o rechazo del traspaso por parte del entrenador.
     * 
     * @param acepta true si el entrenador aprueba el traspaso, false en caso
     *               contrario.
     */
    public void entrenadorAceptacion(boolean acepta) {
        if (this.traspaso == traspaso.solicitado) {
            this.traspaso = acepta ? traspaso.aprobado_por_entrenador : traspaso.rechazado_por_entrenador;
            System.out.println("Decision de traspaso: " + this.traspaso + " del jugador: " + this.nombre);
        } else {
            System.out.println("Traspaso aún no solicitado.");
        }
    }

    /**
     * Aceptación o rechazo del traspaso por parte del presidente.
     * 
     * @param acepta true si el presidente aprueba el traspaso, false en caso
     *               contrario.
     */
    public void presidenteAceptacion(boolean acepta) {
        if (this.traspaso == traspaso.aprobado_por_entrenador) {
            this.traspaso = acepta ? traspaso.aprobado_por_presidente : traspaso.rechazado_por_presidente;
            System.out.println("Decision de traspaso: " + this.traspaso + " del jugador: " + this.nombre);
        } else {
            System.out.println("Falta aprobación de Entrenador para: " + this.nombre);
        }
    }

    /**
     * Transfiere al jugador a un nuevo equipo si el traspaso ha sido aprobado por
     * el presidente.
     * 
     * @param nuevoEquipo Equipo al que se transferirá el jugador.
     */
    public void transferir(equipo nuevoEquipo) {
        if (this.traspaso == traspaso.aprobado_por_presidente) {
            if (this.equipo != null) {
                this.equipo.eliminarJug(this);
            }
            nuevoEquipo.agregarJug(this);
            this.traspaso = traspaso.sin_solicitar;
            System.out.println(this.nombre + " ha sido transferido a " + nuevoEquipo.getNombre());
        } else {
            System.out.println(this.nombre + " no ha sido aprobado por el presidente.");
        }
    }

    /**
     * Obtiene el nombre del jugador.
     * 
     * @return El nombre del jugador.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre del jugador.
     * Si el valor es nulo, se asigna "Ninguno".
     * 
     * @param nombre Nombre del jugador.
     */
    public void setNombre(String nombre) {
        this.nombre = (nombre != null) ? nombre : "Ninguno";
    }

    /**
     * Obtiene la fecha de nacimiento del jugador.
     * 
     * @return La fecha de nacimiento del jugador.
     */
    public Date getNacimiento() {
        return nacimiento;
    }

    /**
     * Establece la fecha de nacimiento del jugador.
     * Si el valor es nulo, se asigna la fecha actual.
     * 
     * @param nacimiento Fecha de nacimiento del jugador.
     */
    public void setNacimiento(Date nacimiento) {
        this.nacimiento = (nacimiento != null) ? nacimiento : new Date();
    }

    /**
     * Obtiene el país del jugador.
     * 
     * @return El país del jugador.
     */
    public String getPais() {
        return pais;
    }

    /**
     * Establece el país del jugador.
     * Si el valor es nulo, se asigna "Ninguno".
     * 
     * @param pais País del jugador.
     */
    public void setPais(String pais) {
        this.pais = (pais != null) ? pais : "Ninguno";
    }

    /**
     * Obtiene la posición en la que juega el jugador.
     * 
     * @return La posición del jugador.
     */
    public posicion getPosicion() {
        return posicion;
    }

    /**
     * Establece la posición del jugador en el campo.
     * Si el valor es nulo, se asigna la posición de reserva.
     * 
     * @param posicion Posición del jugador.
     */
    public void setPosicion(posicion posicion) {
        this.posicion = (posicion != null) ? posicion : posicion.reserva;
    }

    /**
     * Obtiene el número de dorsal del jugador.
     * 
     * @return El dorsal del jugador.
     */
    public int getDorsal() {
        return dorsal;
    }

    /**
     * Establece el número de dorsal del jugador.
     * Si el valor es menor que 1, se asigna 0.
     * 
     * @param dorsal Número de dorsal del jugador.
     */
    public void setDorsal(int dorsal) {
        this.dorsal = (dorsal >= 1) ? dorsal : 0;
    }

    /**
     * Obtiene el estado actual de traspaso del jugador.
     * 
     * @return El estado de traspaso del jugador.
     */
    public traspaso getTraspaso() {
        return traspaso;
    }

    /**
     * Establece el estado de traspaso del jugador.
     * Si el valor es nulo, se asigna "sin_solicitar".
     * 
     * @param traspaso Estado de traspaso del jugador.
     */
    public void setTraspaso(traspaso traspaso) {
        this.traspaso = (traspaso != null) ? traspaso : traspaso.sin_solicitar;
    }

    /**
     * Obtiene el equipo actual del jugador.
     * 
     * @return El equipo del jugador.
     */
    public equipo getEquipo() {
        return equipo;
    }

    /**
     * Establece el equipo en el que juega el jugador.
     * 
     * @param equipo Equipo del jugador.
     */
    public void setEquipo(equipo equipo) {
        this.equipo = equipo;
    }

    /**
     * Representación en cadena del jugador.
     * 
     * @return Información del jugador en formato de texto.
     */
    @Override
    public String toString() {
        String comprobarEquipo = (equipo != null) ? equipo.getNombre() : "Ninguno";
        return "jugador [nombre=" + nombre + ", nacimiento=" + nacimiento + ", pais=" + pais + ", posicion=" + posicion
                + ", dorsal=" + dorsal + ", traspaso=" + traspaso + ", equipo=" + comprobarEquipo + "]";
    }

}