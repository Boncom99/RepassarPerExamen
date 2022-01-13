import java.util.ArrayList;
import java.util.HashMap;
//import java.util.Hashtable;
import java.util.Properties;

public class ArrayDinamic2 {
    public static void main(String[] args) {
        // taules HASH.
        // conte una Key i un value.
        // son arrays pero els index no cal que siguin enters
        // es diu memoria associativa. es com funciona el cervell. no saps eon tens
        // guardada la informacio
        // en Python es el que es coneix com diccionaris es el que es coneix com
        // diccionaris

        Properties p = new Properties();
        // Properties treballa amb 2 strings.
        p.setProperty("uab", 60 + ""); // posem +"" per convertir-ho en string
        p.setProperty("upc", "70");
        System.out.println(p.getProperty("uab"));
        System.out.println(p.getProperty("xxx")); // retorna null ja que no existeix

        HashMap<String, Integer> h = new HashMap<String, Integer>();
        // podem definir quins objectes tindra el HashMap,
        // en aquest cas-> Key:string, val: Integer
        h.put("uab", 69);
        h.put("pamplona", 155);
        h.put("hiuston", 1492);
        System.out.println(h.get("uab"));
        System.out.println(h.get("xxx"));
        // h.keySet(); // retorna el conjunt de Keys
        // Si volem interar entre totes elles utilitzarem keySet.

        int v[] = { 10, 20, 30, 40, 50 };
        for (int i = 0; i < v.length; i++) {
            System.out.println(v[i]);
        } // tmb es pot fer el mateix amb:
        for (int iterator : v) { // no dona el index ni et permet canviar el contingut de la array

            System.out.println(iterator);
        }
        for (String it : h.keySet()) {
            System.out.println(it + " :" + h.get(it));
        }

    }

    void f() { // Repas classe anterior
        // Array estatic
        int v1[]; // encara no ha guardat els 50 espais. No inicialitzat
        v1 = new int[50];
        // Array dinamic
        ArrayList<Integer> v2 = new ArrayList<Integer>();
        Integer e = 2;
        v2.add(e);
        v2.add(3);
        ArrayList<String> v3 = new ArrayList<String>();
        String s2 = new String("cacaaa");
        String s3 = "cacaaa"; // aixi tmb funcciona amb els strings.
        // String the associat el operador "=" amb el constructor.
        v3.add(s2);
        v3.add(s3);
        v3.add(new String("cristobal colon"));
        v3.add("hola");
        // Tipus de dades basics: int, double, float, ....
        // Classes associades: Ineger, Double, Float, ...

    }
}