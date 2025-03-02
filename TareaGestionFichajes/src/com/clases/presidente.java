package com.clases;

public class presidente {
    private String nombre;
    private String dni;
    private equipo equipo;
    private static int totalPresi = 0;

    public presidente(String nombre_presi, String dni_presi, equipo equipo_presi) {
        this.nombre = (nombre_presi != null) ? nombre_presi : "Ninguno";
        this.dni = (dni_presi != null) ? dni_presi : "--------";
        this.equipo = equipo_presi;
        totalPresi++;
    }
    public static int getTotalPresi() {
        return totalPresi;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = (nombre != null) ? nombre : "Ninguno";
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = (dni != null) ? dni : "--------";
    }

    public equipo getEquipo() {
        return equipo;
    }

    public void setEquipo(equipo equipo) {
        this.equipo = equipo;
    }

    @Override
    public String toString() {
        String comprobarEquipo = (equipo != null) ? equipo.getNombre() : "Ninguno";
        return "presidente [nombre=" + nombre + ", dni=" + dni + ", equipo=" + comprobarEquipo + "]";
    }
}