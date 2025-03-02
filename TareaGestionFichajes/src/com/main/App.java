import java.util.Calendar;
import java.util.Date;

import com.clases.*;
import com.enums.*;

public class App {
    public static Date nacimiento(int año, int mes, int dia) {
        Calendar cal = Calendar.getInstance();
        cal.set(año, mes - 1, dia);
        return cal.getTime();
    }

    public static void main(String[] args) throws Exception {
        entrenador entrenador1 = new entrenador("Pep Guardiola", null);
        entrenador entrenador2 = new entrenador("Carlo Ancelotti", null);

        equipo equipo1 = new equipo("Bayern Munich", "BAY");
        equipo equipo2 = new equipo("FC Barcelona", "BAR");

        jugador jugador1 = new jugador("Lionel Messi", nacimiento(1987, 06, 24), "Argentina", null, 10,
                traspaso.sin_solicitar);
        jugador jugador2 = new jugador("Cristiano Ronaldo", nacimiento(1985, 2, 5), "Portugal", null, 7,
                traspaso.sin_solicitar);
        jugador jugador3 = new jugador("Kylian Mbappé", nacimiento(1998, 12, 20), "Francia", null, 7,
                traspaso.sin_solicitar);
        jugador jugador4 = new jugador("Erling Haaland", nacimiento(2000, 07, 21), "Noruega", null, 9,
                traspaso.sin_solicitar);
        jugador jugador5 = new jugador("Luka Modric", nacimiento(1985, 9, 9), "Croacia", null, 10,
                traspaso.sin_solicitar);

        presidente presidente1 = new presidente("Florentino Perez", "12345678J");
        presidente presidente2 = new presidente("Joan Laporta", "87654321J");

    }

}
