package chapters.chapters14;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ShowFile {
    public static void main(String[] args) {
        int i;
        FileInputStream fin = null;
        if (args.length != 1) {
            System.out.println("Иcпoльзoвaниe : ShowFile имя_файла ");
            return;
        }
        try {
            fin = new FileInputStream(args[0]);
            do {
                i = fin.read();
                if (i != -1) {
                    System.out.println((char) i);
                }
            } while (i != -1);
        } catch (FileNotFoundException e) {
            System.out.println("file ne naydon");
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("Пpoизoшлa ошиОка ввода- вывода ");
            e.printStackTrace();
        } finally {
            try {
                if (fin != null) {
                    fin.close();
                }
            } catch (IOException e) {
                System.out.println("OшиOкa закрытия файла ");
                e.printStackTrace();
            }
        }
    }
}
