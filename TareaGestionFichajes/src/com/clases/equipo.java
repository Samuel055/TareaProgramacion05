package com.clases;


public class equipo {
    private String nombre;
    private String abreviatura;

    public equipo(String nombre_equi, String abreviatura_equi) {
        this.nombre = (nombre_equi != null) ? nombre : "Ninguno";
        this.abreviatura = (abreviatura_equi != null) ? abreviatura : "Ningunoo";
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

}
