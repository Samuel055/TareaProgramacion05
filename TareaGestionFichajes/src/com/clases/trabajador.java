package com.clases;

import java.util.Date;

/**
 * Representa un trabajador con atributos básicos como nombre, fecha de nacimiento y país de origen.
 * Es una clase abstracta que debe ser extendida por clases concretas.
 */
public abstract class trabajador {
    
    /** Nombre del trabajador */
    protected String nombre;
    
    /** Fecha de nacimiento del trabajador */
    protected Date fechaNacimiento;
    
    /** País de origen del trabajador */
    protected String paisDeOrigen;
    
    /** Contador estático que mantiene el total de trabajadores creados */
    public static int totalTra = 0;

    /**
     * Constructor de la clase Trabajador.
     * 
     * @param nombre Nombre del trabajador. Si es null, se asigna "Ninguno".
     * @param fechaNacimiento Fecha de nacimiento del trabajador. Si es null, se asigna la fecha actual.
     * @param paisDeOrigen País de origen del trabajador. Si es null, se asigna "Ninguno".
     */
    public trabajador(String nombre, Date fechaNacimiento, String paisDeOrigen) {
        this.nombre = (nombre != null) ? nombre : "Ninguno";
        this.fechaNacimiento = (fechaNacimiento != null) ? fechaNacimiento : new Date();
        this.paisDeOrigen = (paisDeOrigen != null) ? paisDeOrigen : "Ninguno";
        totalTra++;
    }

    /**
     * Obtiene el número total de trabajadores creados.
     * 
     * @return Número total de trabajadores.
     */
    public static int getTotalTra() {
        return totalTra;
    }

    /**
     * Método abstracto que debe ser implementado por las clases hijas para mostrar información del trabajador.
     */
    public abstract void mostrarInfo();

    /**
     * Compara la nacionalidad del trabajador con otro trabajador.
     * 
     * @param trabajador Otro trabajador con el que se comparará la nacionalidad.
     */
    public void mismaNacionalidad(trabajador trabajador) {
        if (this.paisDeOrigen.equals(trabajador.getPaisDeOrigen())) {
            System.out.println("Los trabajadores tienen la misma nacionalidad que es: " + paisDeOrigen);
        } else {
            System.out.println("Los trabajadores tienen diferente nacionalidad que serían: " + paisDeOrigen + "/" + trabajador.getPaisDeOrigen());
        }
    }

    /**
     * Obtiene el nombre del trabajador.
     * 
     * @return Nombre del trabajador.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre del trabajador.
     * 
     * @param nombre Nombre a asignar. Si es null, se asigna "Ninguno".
     */
    public void setNombre(String nombre) {
        this.nombre = (nombre != null) ? nombre : "Ninguno";
    }

    /**
     * Obtiene la fecha de nacimiento del trabajador.
     * 
     * @return Fecha de nacimiento del trabajador.
     */
    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    /**
     * Establece la fecha de nacimiento del trabajador.
     * 
     * @param fechaNacimiento Fecha a asignar. Si es null, se asigna la fecha actual.
     */
    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = (fechaNacimiento != null) ? fechaNacimiento : new Date();
    }

    /**
     * Obtiene el país de origen del trabajador.
     * 
     * @return País de origen del trabajador.
     */
    public String getPaisDeOrigen() {
        return paisDeOrigen;
    }

    /**
     * Establece el país de origen del trabajador.
     * 
     * @param paisDeOrigen País de origen a asignar. Si es null, se asigna "Ninguno".
     */
    public void setPaisDeOrigen(String paisDeOrigen) {
        this.paisDeOrigen = (paisDeOrigen != null) ? paisDeOrigen : "Ninguno";
    }
}
