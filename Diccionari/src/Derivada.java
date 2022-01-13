import java.util.ArrayList;

public class Derivada extends App {

    Frequencia llegirFrequencia(String paraula) {
        if (Diccionari.containsKey(paraula)) {
            return Diccionari.get(paraula);
        }
        return null;

    }

    String maxFrequencia() {
        String paraula = "";
        int freq = 0;
        for (String string : Diccionari.keySet()) {
            if (Diccionari.get(string).freq > freq) {
                freq = Diccionari.get(string).freq;
                paraula = string;
            }

        }
        return paraula;
    }

    String darreraParaula(String comencaPer) {
        String paraula = "";
        ArrayList<String> llista = new ArrayList<String>();
        for (String string : Diccionari.keySet()) {
            if (string.startsWith(comencaPer)) {
                llista.add(string);
            }
        }
        long darrerMoment = 0;
        long aux = 0;
        for (String string : llista) {
            aux = Diccionari.get(string).darrerMomentMS;
            if (aux > darrerMoment) {
                darrerMoment = aux;
                paraula = string;
            }
        }
        return paraula;
    }
}
