import java.util.ArrayList;

public class ArrayDinamic {

    public static void main(String[] args) {

        ArrayList v = new ArrayList();
        // v.add(Object);
        v.add(new Integer(3));
        v.add(new Integer(6));
        v.add(new Double(6.3));
        v.add(new String("hola"));
        for (int i = 0; i < v.size(); i++) {

            System.out.println(v.get(i));
        }

    }
}