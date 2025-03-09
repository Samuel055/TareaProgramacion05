package com.clases;
import java.util.Date;

public abstract class trabajador {
    protected String nombre;
    protected Date fechaNacimiento;
    protected String paisDeOrigen;

    public trabajador(String nombre, Date fechaNacimiento, String paisDeOrigen) {
        this.nombre = (nombre != null) ? nombre : "Ninguno";
        this.fechaNacimiento = (fechaNacimiento != null) ? fechaNacimiento : new Date();
        this.paisDeOrigen = (paisDeOrigen != null) ? paisDeOrigen : "Ninguno";
    }
    public abstract void mostrarInfo();

    public void mismaNacionalidad(trabajador trabajador){
        if (this.paisDeOrigen.equals(trabajador.getPaisDeOrigen())) {
            System.out.println("Los trbajadores tienen la misma nacionalidad que es: " + paisDeOrigen);
        }else{
            System.out.println("Los trabajadores tienen diferente nacionalidad que serian: " + paisDeOrigen + "/" + trabajador.getPaisDeOrigen());
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = (nombre != null) ? nombre : "Ninguno";
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = (fechaNacimiento != null) ? fechaNacimiento : new Date();
    }

    public String getPaisDeOrigen() {
        return paisDeOrigen;
    }

    public void setPaisDeOrigen(String paisDeOrigen) {
        this.paisDeOrigen = (paisDeOrigen != null) ? paisDeOrigen : "Ninguno";
    }
}
