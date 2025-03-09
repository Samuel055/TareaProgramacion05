package com.interfaz;

import com.clases.*;

/**
 * Interfaz que define los métodos para gestionar traspasos de jugadores entre equipos.
 */
public interface gestorTraspasos {
    
    /**
     * Aprueba el traspaso de un jugador a un equipo.
     * 
     * @param jugador Jugador cuyo traspaso será aprobado.
     * @param equipo Equipo al que será transferido el jugador.
     */
    void aprobarTraspaso(jugador jugador, equipo equipo);

    /**
     * Rechaza el traspaso de un jugador a un equipo.
     * 
     * @param jugador Jugador cuyo traspaso será rechazado.
     * @param equipo Equipo al que no será transferido el jugador.
     */
    void rechazarTraspaso(jugador jugador, equipo equipo);
}
