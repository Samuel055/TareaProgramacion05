package com.clases;

import com.enums.*;

/**
 * Representa un entrenador de un equipo de fútbol.
 */
public class entrenador {
    private String nombre;
    private formacion formacion;
    private equipo equipo;
    private static int totalEntr = 0;

    /**
     * Constructor de la clase entrenador.
     * 
     * @param nombre_entr    Nombre del entrenador. Si es nulo, se asigna "Ninguno".
     * @param formacion_entr Formación táctica del entrenador. Si es nula, se asigna
     *                       la formación por defecto (_332_default).
     * @param equipo_entr    Equipo al que pertenece el entrenador.
     */
    public entrenador(String nombre_entr, formacion formacion_entr, equipo equipo_entr) {
        this.nombre = (nombre_entr != null) ? nombre_entr : "Ninguno";
        this.formacion = (formacion_entr != null) ? formacion_entr : formacion._332_default;
        this.equipo = equipo_entr;
        totalEntr++;
    }

    /**
     * Obtiene el número total de entrenadores creados.
     * 
     * @return Número total de entrenadores.
     */
    public static int getTotalEntr() {
        return totalEntr;
    }

    /**
     * Obtiene el nombre del entrenador.
     * 
     * @return Nombre del entrenador.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre del entrenador.
     * 
     * @param nombre Nuevo nombre del entrenador. Si es nulo, se asigna "Ninguno".
     */
    public void setNombre(String nombre) {
        this.nombre = (nombre != null) ? nombre : "Ninguno";
    }

    /**
     * Obtiene la formación táctica del entrenador.
     * 
     * @return Formación del entrenador.
     */
    public formacion getFormacion() {
        return formacion;
    }

    /**
     * Establece la formación táctica del entrenador.
     * 
     * @param formacion Nueva formación del entrenador. Si es nula, se asigna la
     *                  formación por defecto (_332_default).
     */
    public void setFormacion(formacion formacion) {
        this.formacion = (formacion != null) ? formacion : formacion._332_default;
    }

    /**
     * Obtiene el equipo del entrenador.
     * 
     * @return Equipo al que pertenece el entrenador.
     */
    public equipo getEquipo() {
        return equipo;
    }

    /**
     * Establece el equipo del entrenador.
     * 
     * @param equipo Nuevo equipo del entrenador.
     */
    public void setEquipo(equipo equipo) {
        this.equipo = equipo;
    }

    /**
     * Representación en cadena del objeto entrenador.
     * 
     * @return Cadena con la información del entrenador.
     */
    @Override
    public String toString() {
        String comprobarEquipo = (equipo != null) ? equipo.getNombre() : "Ninguno";
        return "entrenador [nombre=" + nombre + ", formacion=" + formacion + ", equipo=" + comprobarEquipo + "]";
    }
}
