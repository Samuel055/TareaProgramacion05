package com.clases;

import com.enums.*;

public class entrenador {
    private String nombre;
    private formacion formacion;

    public entrenador(String nombre_entr, formacion formacion_entr) {
        this.nombre = (nombre_entr != null) ? nombre : "Ninguno";
        this.formacion = (formacion_entr != null) ? formacion : formacion._332_default;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = (nombre != null) ? nombre : "Ninguno"; 
    }

    public formacion getFormacion() {
        return formacion;
    }

    public void setFormacion(formacion formacion) {
        this.formacion = (formacion != null) ? formacion : formacion._332_default;
    }

}