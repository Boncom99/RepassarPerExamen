import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class App {
    App() {
        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.nextLine();
        scanner.close();
        String[] newStr = inputString.split(", ");
        ArrayList<String> array = new ArrayList<String>();
        for (String string : newStr) {
            File tempFile = new File("string");
            if (tempFile.exists()) {
                array.add(string);
            } else {
                System.out.println("no existeix el file \'" + string + "\'");
            }
        }
        String[] finalArray = array.toArray(new String[0]);
        try {
            zipFiles("hola", finalArray);
        } catch (IOException e) {
        }
    }

    public static void main(String[] args) {
        new App();
    }

    public static void zipFiles(String zipFile, String files[]) throws IOException {
        FileOutputStream fout = new FileOutputStream(zipFile);
        ZipOutputStream zout = new ZipOutputStream(fout);
        byte b[];
        for (String filename : files) {
            ZipEntry ze = new ZipEntry(new File(filename).getName());
            zout.putNextEntry(ze);
            b = readBinaryFile(filename);
            zout.write(b);
            zout.closeEntry();
        }
        zout.close();
    }

    public static byte[] readBinaryFile(String filename) throws IOException {
        byte b[];
        ArrayList<Byte> B = new ArrayList<Byte>();
        FileInputStream fin = new FileInputStream(filename);
        byte aux = 0;
        while (aux != -1) {
            aux = (byte) fin.read();
            B.add(aux);

        }
        fin.close();
        b = new byte[B.size()];
        for (int j = 0; j < B.size(); j++) {
            b[j] = B.get(j);
        }
        System.out.println(b);
        System.out.println("lenghts =" + b.length);
        return b;
    }

}
