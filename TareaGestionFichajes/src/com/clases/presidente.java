package com.clases;

public class presidente {
    private String nombre;
    private String dni;

    public presidente(String nombre_presi, String dni_presi) {
        this.nombre = (nombre_presi != null) ? nombre : "Ninguno";
        this.dni = (dni_presi != null) ? dni : "--------";
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
    
}
