public class Joc {
    boolean finalPartida = false;
    Jugador jugadors[] = { new Jugador(true), new Jugador(false) };
    Peces[][] Taulell = new Peces[8][8];

    Joc() {

    }

    void run() {
        int i = 0;
        while (!finalPartida) {

            jugadors[i].tirar();
            i = (i + 1) % 2;
        }
    }

}
