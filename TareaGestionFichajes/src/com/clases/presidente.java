package com.clases;

import java.util.Date;

import com.enums.traspaso;

/**
 * Representa al presidente de un equipo de fútbol.
 */
public class presidente extends trabajador {
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
    public presidente(String nombre_presi, Date nacimiento_presi, String pais_presi, String dni_presi,
            equipo equipo_presi) {
        super(nombre_presi, nacimiento_presi, pais_presi);
        this.nombre = (nombre_presi != null) ? nombre_presi : "Ninguno";
        this.dni = (dni_presi != null) ? dni_presi : "--------";
        this.equipo = equipo_presi;
        totalPresi++;
    }

    @Override
    public void mostrarInfo() {
        System.out.println("Mostrar info de: " + nombre + " / " + "de tipo Presidente");
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

    public void aprobarTraspaso(jugador jugador, equipo equipo) {
        if (jugador.getEquipo() != equipo) {
            System.out.println("El presidente solo puede aprobar los traspasos de sus jugadores.");
            return;
        }

        if (jugador.getTraspaso() == traspaso.aprobado_por_entrenador) {
            jugador.setTraspaso(traspaso.aprobado_por_presidente);
            System.out.println(
                    "Decision de traspaso: " + jugador.getTraspaso() + " del jugador: " + jugador.getNombre());
        } else {
            System.out.println("Falta aprobación de Entrenador para: " + jugador.getNombre());
        }
    }

    public void rechazarTraspaso(jugador jugador, equipo equipo) {
        if (jugador.getEquipo() != equipo) {
            System.out.println("El presidente solo puede aprobar los traspasos de sus jugadores");
            return;
        }

        jugador.setTraspaso(traspaso.rechazado_por_presidente);
        System.out.println("Decision de traspaso: " + jugador.getTraspaso() + " del jugador: " + jugador.getNombre());
    }

    /**
     * Devuelve una representación en cadena del presidente.
     * 
     * @return Una cadena con la información del presidente.
     */
    @Override
    public String toString() {
        String comprobarEquipo = (equipo != null) ? equipo.getNombre() : "Ninguno";
        return "presidente [Nombre=" + getNombre() + ", PaisDeOrigen=" + getPaisDeOrigen()
                + ", FechaNacimiento="
                + getFechaNacimiento() + ", equipo=" + comprobarEquipo + ", dni=" + dni
                + "]";
    }
}
