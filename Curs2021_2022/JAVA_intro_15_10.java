import java.io.*;
import java.lang.Math;
import java.util.Scanner;

class Prog1 {
    public static void main(String argv[]) throws Exception {
        FileInputStream fis = new FileInputStream("read_input.txt"); // definim canal d'entrada
        // System.out.println("entra un string\n ");
        // DataInputStream dis = new DataInputStream(fis/* System.in */);
        // String s = dis.readLine(); //deprecated
        // new way
        // Scanner sc = new Scanner(fis);
        // String s = sc.nextLine();
        // System.out.println("has llegit: " + s);

        // Llegir 2 enters i sumar-los
        Scanner sc2 = new Scanner(System.in);
        int n1 = sc2.nextInt();
        int n2 = sc2.nextInt();
        int suma = n1 + n2;
        System.out.println("la suma és " + suma);
        PrintStream p = new PrintStream("file_out.txt");
        p.println("estem a classe de PA");
        p.println("motherfucker");
        p.close();
        double d = Math.Log(3);
        System.out.println("el numero pi és: " + Math.PI);

    }
}