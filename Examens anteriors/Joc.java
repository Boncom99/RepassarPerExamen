
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;

public class Joc {
    static HashMap<String, Jugador> jugadors = new HashMap<String, Jugador>();

    public static void main(String[] args) {
        Joc j = new Joc();
        j.entrarNouJugador("pep");
        j.entrarNouJugador("pep");
        j.entrarNouJugador("maria");
        j.entrarPuntuacio("maria", 333);
        j.entrarPuntuacio("pedo", 330231);
        j.entrarPuntuacio("maria", 300);
        j.entrarPuntuacio("caca", 1233);
        for (String nom : jugadors.keySet()) {
            Jugador jugador = jugadors.get(nom);
            Integer puntuacio = jugador.puntuacioMaxima;
            Integer partides = jugador.partidesJugades;
            System.out.println(nom + ": " + puntuacio + ", " + partides);
        }
        j.jugadorsExistents();
        // j.Ordenar2();

        Derivada Der = new Derivada();
        Der.llegirPuntuacio(jugadors, "maria");
        System.out.println("el jugador amb maxima puntuacio es:");
        System.out.println(Der.maxPuntuacio(jugadors));

    }

    public Joc() {

    }

    boolean entrarNouJugador(String nom) {
        if (jugadors.containsKey(nom)) {
            System.out.println("ja existeix el jugador " + nom);
            return false;
        }
        Jugador j = new Jugador();
        jugadors.put(nom, j);
        return true;
    }

    void entrarPuntuacio(String nom, int puntuacio) { // crear nou jugador si no existeix
        if (jugadors.containsKey(nom)) {
            Jugador jugador = jugadors.get(nom);
            if (jugador.puntuacioMaxima < puntuacio) {

                jugador.puntuacioMaxima = puntuacio;
            }
            jugador.partidesJugades += 1;
        } else {
            jugadors.put(nom, new Jugador(1, puntuacio));
        }
    }

    ArrayList<String> jugadorsExistents() {
        ArrayList<String> Noms = new ArrayList<String>();
        for (String nom : jugadors.keySet()) {
            Noms.add(nom);
        }
        // printegem la llistas
        for (String b : Noms) {
            System.out.println(b);
        }
        return Noms;

    }

    /*
     * void Ordenar() {
     * // Object[] a = jugadors.entrySet().toArray();
     * Arrays.sort(jugadors.entrySet(), new Comparator<Map<String, Jugador>>() {
     * public int compare(Map.Entry<String, Jugador> a, Map.Entry<String, Jugador>
     * b) {
     * if (a.getValue().puntuacioMaxima >= b.getValue().puntuacioMaxima) {
     * return -1;
     * } else {
     * return 1;
     * } // returning 0 would merge keys
     * }
     * });
     * 
     * /*
     * for (Object e : a) {
     * System.out.println(((Map.Entry<String, Jugador>) e).getKey() + " : "
     * + ((Map.Entry<String, Jugador>) e).getValue().puntuacioMaxima);
     * }
     * 
     * // jugadors = a;
     * 
     * }
     */

    void Ordenar2() {
        Jugador[] orderedValues = (Jugador[]) jugadors.values().toArray();
        Comparator<Jugador> COmpare = new Comparator<Jugador>() {
            public int compare(Jugador a, Jugador b) {
                if (a.puntuacioMaxima > b.puntuacioMaxima) {
                    return 1;
                } else {
                    return -1;
                }
            }
        };

        Arrays.sort(orderedValues, COmpare);
    }

}
