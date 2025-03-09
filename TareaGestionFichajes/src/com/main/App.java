import java.util.Calendar;
import java.util.Date;
import java.util.ArrayList;
import com.clases.*;
import com.enums.*;

/**
 * Clase principal que inicializa y gestiona los objetos relacionados con el
 * sistema de fútbol.
 */
public class App {

        /**
         * Método auxiliar para crear una fecha de nacimiento.
         * 
         * @param anio Año de nacimiento.
         * @param mes  Mes de nacimiento (1-12).
         * @param dia  Día de nacimiento.
         * @return Objeto Date con la fecha indicada.
         */
        public static Date nacimiento(int anio, int mes, int dia) {
                Calendar cal = Calendar.getInstance();
                cal.set(anio, mes - 1, dia);
                return cal.getTime();
        }

        /**
         * Método principal que ejecuta la lógica del programa.
         * 
         * @param args Argumentos de línea de comandos (no utilizados en este programa).
         * @throws Exception Puede lanzar excepciones en tiempo de ejecución.
         */
        public static void main(String[] args) throws Exception {
                // Creación de entrenadores
                entrenador entrenador1 = new entrenador("Pep Guardiola", nacimiento(1982, 5, 15), "España",formacion._251, null);
                entrenador entrenador2 = new entrenador("Carlo Ancelotti",nacimiento(2000, 3, 16), "Francia",formacion._431, null);

                // Creación de equipos
                equipo equipo1 = new equipo("Bayern Munich", "BAY", null, null, null);
                equipo equipo2 = new equipo("FC Barcelona", "BAR", null, null, null);

                // Creación de jugadores
                jugador jugador1 = new jugador("Lionel Messi", nacimiento(1987, 06, 24), "Argentina",
                                posicion.delantero, 10,
                                traspaso.sin_solicitar, null);
                jugador jugador2 = new jugador("Cristiano Ronaldo", nacimiento(1985, 2, 5), "Portugal",
                                posicion.defensa, 7,
                                traspaso.sin_solicitar, null);
                jugador jugador3 = new jugador("Kylian Mbappé", nacimiento(1998, 12, 20), "Francia",
                                posicion.mediocampista, 7,
                                traspaso.sin_solicitar, null);
                jugador jugador4 = new jugador("Erling Haaland", nacimiento(2000, 07, 21), "Noruega", posicion.portero,
                                9,
                                traspaso.sin_solicitar, null);
                jugador jugador5 = new jugador("Luka Modric", nacimiento(1985, 9, 9), "Croacia", posicion.delantero, 10,
                                traspaso.sin_solicitar, null);

                // Creación de presidentes
                presidente presidente1 = new presidente("Florentino Perez",nacimiento(1982, 9, 12), "Argentina","12345678J", null);
                presidente presidente2 = new presidente("Joan Laporta",nacimiento(1979, 3, 8), "Portugal","87654321J", null);

                // Listas de jugadores para cada equipo
                ArrayList<jugador> BAY = new ArrayList<>();
                ArrayList<jugador> BAR = new ArrayList<>();

                // Asignación de entrenadores y presidentes a equipos
                equipo1.setEntrenador(entrenador1);
                equipo1.setPresidente(presidente1);
                equipo1.setJugador(BAY);
                equipo2.setEntrenador(entrenador2);
                equipo2.setPresidente(presidente2);
                equipo2.setJugador(BAR);

                // Asignación de equipos a entrenadores y presidentes
                entrenador1.setEquipo(equipo1);
                entrenador2.setEquipo(equipo2);
                presidente1.setEquipo(equipo1);
                presidente2.setEquipo(equipo2);

                // Asignación de jugadores a equipos
                jugador1.setEquipo(equipo1);
                jugador2.setEquipo(equipo1);
                jugador3.setEquipo(equipo1);
                jugador4.setEquipo(equipo2);
                jugador5.setEquipo(equipo2);

                // Agregar jugadores a los equipos
                equipo1.agregarJug(jugador1);
                equipo1.agregarJug(jugador2);
                equipo1.agregarJug(jugador3);
                equipo2.agregarJug(jugador4);
                equipo2.agregarJug(jugador5);

                // Impresión del estado inicial de las clases, su info y su comparacion de Paises
                System.out.println(equipo1);
                System.out.println(jugador1);
                System.out.println(entrenador1);
                System.out.println(presidente1);

                jugador1.mostrarInfo();
                jugador1.mismaNacionalidad(jugador2);

                // Simulación de solicitudes de traspaso
                System.out.println("-----Jugador 1, 2 y 3 piden traspaso hacia otro equipo-----");
                jugador1.setTraspaso(traspaso.solicitado);
                jugador2.setTraspaso(traspaso.solicitado);
                jugador1.solicitudDeTraspaso();
                jugador2.solicitudDeTraspaso();
                jugador3.solicitudDeTraspaso();

                // Decisión del entrenador sobre los traspasos
                System.out.println("-----Entrenador decide si acepta o no-----");
                entrenador1.aprobarTraspaso(jugador1, equipo1);
                entrenador1.rechazarTraspaso(jugador2, equipo1);
                entrenador1.aprobarTraspaso(jugador3, equipo2);

                // Decisión del presidente sobre los traspasos
                System.out.println("-----Presidente decide si acepta o no-----");
                presidente1.aprobarTraspaso(jugador1, equipo1);
                presidente1.aprobarTraspaso(jugador2, equipo1);
                presidente1.aprobarTraspaso(jugador3, equipo2);

                // Proceso de traspaso de los jugadores aprobados
                System.out.println("-----Proceso de traspaso de jugador(es) aceptados-----");
                jugador1.transferir(equipo2);

                // Reseteo de estados de traspaso en el equipo 1
                System.out.println("-----Reseteo del estado de Traspaso para los rechazados-----");
                equipo1.reseteo();
                System.out.println("-----Visualización del estado del jugador 2-----");
                System.out.println(jugador2);
                System.out.println("-----Visualización del estado del equipo 2-----");
                System.out.println(equipo2);

                // Conteo de objetos totales creados
                System.out.println("-----Conteo de objetos totales creados-----");
                System.out.println("Total de trabajadores: " + trabajador.getTotalTra());
                System.out.println("Total de entrenadores: " + entrenador.getTotalEntr());
                System.out.println("Total de equipos: " + equipo.getTotalEqui());
                System.out.println("Total de jugadores: " + jugador.getTotalJug());
                System.out.println("Total de presidentes: " + presidente.getTotalPresi());
        }
}
