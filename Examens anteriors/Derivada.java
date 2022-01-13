import java.util.HashMap;

public class Derivada extends Joc {
    Derivada() {

    }

    int llegirPuntuacio(HashMap<String, Jugador> jugadors, String nomJugador) {
        Jugador j = jugadors.get(nomJugador);
        if (j == null) {
            return -1;
        }
        return j.puntuacioMaxima;
    }

    String maxPuntuacio(HashMap<String, Jugador> jugadors) {
        Jugador j = new Jugador();
        String nomJugador = null;
        for (String nom : jugadors.keySet()) {

            if (jugadors.get(nom).puntuacioMaxima > j.puntuacioMaxima) {
                j = jugadors.get(nom);
                nomJugador = nom;
            }
        }
        return nomJugador;
    }
}
