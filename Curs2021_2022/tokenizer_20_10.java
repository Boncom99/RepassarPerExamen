import java.io.*;

public class tokenizer_20_10 {
    public static void main(String[] arg) throws Exception {
        StreamTokenizer st = new StreamTokenizer(System.in);
        do {
            st.nextToken();
            if (st.ttype == st.TT_WORD)
                System.out.println("paraula: " + st.sval);

            if (st.ttype == st.TT_NUMBER)
                System.out.println("numero: " + st.nval);
            // els signes com , . - _ ! ? no els pilla com a tt_word ni tt_number. el ttype
            // es guarda el codi ASTII (-1,-2,-3,-4.....)
        } while (st.ttype != st.TT_EOF);

    }

}

// entrem a google al "java api 7"
// java.io -> streamTokenizer