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
        entrenador entrenador1 = new entrenador("Pep Guardiola", null, null);
        entrenador entrenador2 = new entrenador("Carlo Ancelotti", null, null);

        equipo equipo1 = new equipo("Bayern Munich", "BAY", entrenador1, null, null);
        equipo equipo2 = new equipo("FC Barcelona", "BAR", entrenador2, null, null);

        jugador jugador1 = new jugador("Lionel Messi", nacimiento(1987, 06, 24), "Argentina", null, 10,
                traspaso.sin_solicitar, equipo1);
        jugador jugador2 = new jugador("Cristiano Ronaldo", nacimiento(1985, 2, 5), "Portugal", null, 7,
                traspaso.sin_solicitar, equipo1);
        jugador jugador3 = new jugador("Kylian Mbappé", nacimiento(1998, 12, 20), "Francia", null, 7,
                traspaso.sin_solicitar, equipo1);
        jugador jugador4 = new jugador("Erling Haaland", nacimiento(2000, 07, 21), "Noruega", null, 9,
                traspaso.sin_solicitar, equipo2);
        jugador jugador5 = new jugador("Luka Modric", nacimiento(1985, 9, 9), "Croacia", null, 10,
                traspaso.sin_solicitar, equipo2);

        presidente presidente1 = new presidente("Florentino Perez", "12345678J", equipo1);
        presidente presidente2 = new presidente("Joan Laporta", "87654321J", equipo2);

        ArrayList<jugador> BAY = new ArrayList<jugador>();
        ArrayList<jugador> BAR = new ArrayList<jugador>();

        BAY.add(jugador1);
        BAY.add(jugador2);
        BAY.add(jugador3);
        BAR.add(jugador4);
        BAR.add(jugador5);
        

    }

}