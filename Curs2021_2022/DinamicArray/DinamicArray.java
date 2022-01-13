import java.util.ArrayList;
import java.awt.Frame;

public class DinamicArray {

    public static void main(String[] args) {

        ArrayList v = new ArrayList();
        // ArrayList<Integer> v = new ArrayList<Integer>(); //per definir el tipus de
        // ArrayList<Frame> v = new ArrayList<Frame>(); // en aquest cas, ens
        // estaviariem fer tot el instanceof etc... dins del for
        // objectes
        // v.add(Object);
        // v.add(new Integer(3)); //deprecated
        v.add(Integer.valueOf(3));
        v.add(Integer.valueOf(2));
        v.add(Integer.valueOf(5));
        v.add(new String("hola"));
        v.add(new Frame("titol"));
        for (int i = 0; i < v.size(); i++) {
            if (v.get(i) instanceof Frame) {
                System.out.println(((Frame) v.get(i)).getTitle());
            }

            System.out.println(v.get(i));
        }

        Pila<Integer> pil = new Pila<Integer>(); // classe definida abaix
        ArrayList<ArrayList<Integer>> m = new ArrayList<ArrayList<Integer>>(); // llista de llista
        m.add(new ArrayList());
        m.get(0).add(new Integer(3));
        m.get(0).get(0);
        ArrayList<Integer[]> m2 = new ArrayList<Integer[]>(); // segona component estatica
        Integer d[] = { 1, 2, 3, 4 };
        m2.add(d);
        System.out.println(m2.get(0)[0]);

        ArrayList<Integer> v3 = new ArrayList<Integer>();
        v3.add(3); // no cal posar new Integer perque ja s'espera un int
        v3.remove(0);
    }
}

class Pila<T> { // Pila preparada per qualsevol tipus de dada T (pot ser integer, string,....)
    int top;
    ArrayList<T> v;

    Pila() { // constructor
        top = -1;
        v = new ArrayList<T>();
    }
}