import java.util.Calendar;
import java.util.Date;

import com.clases.*;
import com.enums.*;
import java.util.ArrayList;

public class App {
    public static Date nacimiento(int año, int mes, int dia) {
        Calendar cal = Calendar.getInstance();
        cal.set(año, mes - 1, dia);
        return cal.getTime();
    }

    public static void main(String[] args) throws Exception {
        entrenador entrenador1 = new entrenador("Pep Guardiola", formacion._251, null);
        entrenador entrenador2 = new entrenador("Carlo Ancelotti", formacion._431, null);

        equipo equipo1 = new equipo("Bayern Munich", "BAY", null, null, null);
        equipo equipo2 = new equipo("FC Barcelona", "BAR", null, null, null);

        jugador jugador1 = new jugador("Lionel Messi", nacimiento(1987, 06, 24), "Argentina", posicion.delantero, 10,
                traspaso.sin_solicitar, null);
        jugador jugador2 = new jugador("Cristiano Ronaldo", nacimiento(1985, 2, 5), "Portugal", posicion.defensa, 7,
                traspaso.sin_solicitar, null);
        jugador jugador3 = new jugador("Kylian Mbappé", nacimiento(1998, 12, 20), "Francia", posicion.mediocampista, 7,
                traspaso.sin_solicitar, null);
        jugador jugador4 = new jugador("Erling Haaland", nacimiento(2000, 07, 21), "Noruega", posicion.portero, 9,
                traspaso.sin_solicitar, null);
        jugador jugador5 = new jugador("Luka Modric", nacimiento(1985, 9, 9), "Croacia", posicion.delantero, 10,
                traspaso.sin_solicitar, null);
        
        presidente presidente1 = new presidente("Florentino Perez", "12345678J", null);
        presidente presidente2 = new presidente("Joan Laporta", "87654321J", null);

        ArrayList<jugador> BAY = new ArrayList<jugador>();
        ArrayList<jugador> BAR = new ArrayList<jugador>();

        equipo1.setEntrenador(entrenador1);
        equipo1.setPresidente(presidente1);
        equipo1.setJugador(BAY);
        equipo2.setEntrenador(entrenador2);
        equipo2.setPresidente(presidente2);
        equipo2.setJugador(BAR);

        entrenador1.setEquipo(equipo1);
        entrenador2.setEquipo(equipo2);

        presidente1.setEquipo(equipo1);
        presidente2.setEquipo(equipo2);
        
        jugador1.setEquipo(equipo1);
        jugador2.setEquipo(equipo1);
        jugador3.setEquipo(equipo1);
        jugador4.setEquipo(equipo2);
        jugador5.setEquipo(equipo2);

        equipo1.agregarJug(jugador1);
        equipo1.agregarJug(jugador2);
        equipo1.agregarJug(jugador3);
        equipo2.agregarJug(jugador4);
        equipo2.agregarJug(jugador5);

        System.out.println(equipo1);
        System.out.println(jugador1);
        System.out.println(entrenador1);
        System.out.println(presidente1);

        System.out.println("-----Jugador 2 y 3 piden traspaso al equipo 2-----");
        jugador2.setTraspaso(traspaso.solicitado);
        jugador2.solicitudDeTraspaso();
        jugador3.solicitudDeTraspaso();

        System.out.println("-----Entrenador decide si acepta o no-----");
        jugador2.entrenadorAceptacion(false);
        jugador3.entrenadorAceptacion(true);

        System.out.println("-----Presidente decide si acepta o no-----");
        jugador2.presidenteAceptacion(true);
        jugador3.presidenteAceptacion(true);

        System.out.println("-----Proceso de traspaso de jugador(es) aceptados-----");
        jugador3.transferir(equipo2);

        System.out.println("-----Reseteo del estado de Traspaso para los rechazados-----");
        equipo1.reseteo();
        System.out.println("-----Visualizacion del estado del jugador 2-----");
        System.out.println(jugador2);
        System.out.println("-----Visualizacion del estado del equipo 2-----");
        System.out.println(equipo2);

    }

}