package com.clases;

/**
 * Representa al presidente de un equipo de fútbol.
 */
public class presidente {
    private String nombre;
    private String dni;
    private equipo equipo;
    private static int totalPresi = 0;

    /**
     * Constructor para crear un presidente con nombre, DNI y equipo asociado.
     * 
     * @param nombre_presi Nombre del presidente.
     * @param dni_presi    DNI del presidente.
     * @param equipo_presi Equipo que preside.
     */
    public presidente(String nombre_presi, String dni_presi, equipo equipo_presi) {
        this.nombre = (nombre_presi != null) ? nombre_presi : "Ninguno";
        this.dni = (dni_presi != null) ? dni_presi : "--------";
        this.equipo = equipo_presi;
        totalPresi++;
    }

    /**
     * Obtiene el número total de presidentes creados.
     * 
     * @return Número total de presidentes.
     */
    public static int getTotalPresi() {
        return totalPresi;
    }

    /**
     * Obtiene el nombre del presidente.
     * 
     * @return El nombre del presidente.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre del presidente.
     * Si el valor es nulo, se asigna "Ninguno".
     * 
     * @param nombre Nombre del presidente.
     */
    public void setNombre(String nombre) {
        this.nombre = (nombre != null) ? nombre : "Ninguno";
    }

    /**
     * Obtiene el DNI del presidente.
     * 
     * @return El DNI del presidente.
     */
    public String getDni() {
        return dni;
    }

    /**
     * Establece el DNI del presidente.
     * Si el valor es nulo, se asigna "--------".
     * 
     * @param dni DNI del presidente.
     */
    public void setDni(String dni) {
        this.dni = (dni != null) ? dni : "--------";
    }

    /**
     * Obtiene el equipo que preside el presidente.
     * 
     * @return El equipo presidido.
     */
    public equipo getEquipo() {
        return equipo;
    }

    /**
     * Establece el equipo que preside el presidente.
     * 
     * @param equipo Equipo que presidirá el presidente.
     */
    public void setEquipo(equipo equipo) {
        this.equipo = equipo;
    }

    /**
     * Devuelve una representación en cadena del presidente.
     * 
     * @return Una cadena con la información del presidente.
     */
    @Override
    public String toString() {
        String comprobarEquipo = (equipo != null) ? equipo.getNombre() : "Ninguno";
        return "presidente [nombre=" + nombre + ", dni=" + dni + ", equipo=" + comprobarEquipo + "]";
    }
}
