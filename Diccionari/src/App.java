import java.util.ArrayList;
import java.util.HashMap;

public class App {
    HashMap<String, Frequencia> Diccionari = new HashMap<String, Frequencia>();

    public static void main(String[] args) throws Exception {
        new App();
        Derivada D = new Derivada();
        D.llegirFrequencia("hola");
        System.out.println(D.maxFrequencia());
        System.out.println(D.darreraParaula("q"));

    }

    App() {
        entrarNovaParaula("hola");
        entrarNovaParaula("que");
        entrarNovaParaula("qui");
        entrarNovaParaula("tal");
        entrarParaula("qqqqq");
        entrarParaula("hola");
        entrarParaula("hola");
        entrarNovaParaula("quo");
        System.out.println(paraulesExistents());
    }

    void entrarNovaParaula(String Paraula) {
        Diccionari.put(Paraula, new Frequencia(1, System.currentTimeMillis()));
    }

    void entrarParaula(String Paraula) {
        if (Diccionari.containsKey(Paraula)) {
            Diccionari.get(Paraula).freq += 1;
            Diccionari.get(Paraula).darrerMomentMS = System.currentTimeMillis();
        } else {
            entrarNovaParaula(Paraula);
        }
    }

    ArrayList<String> paraulesExistents() {
        ArrayList<String> Llista = new ArrayList<String>();
        for (String paraula : Diccionari.keySet()) {
            Llista.add(paraula);
        }
        /*
         * for (String string : Diccionari.keySet()) {
         * System.out.print(string + ":  ");
         * System.out.print(Diccionari.get(string).freq + ", ");
         * System.out.print(Diccionari.get(string).darrerMomentMS);
         * System.out.println(" ");
         * }
         */
        return Llista;
    }
}
