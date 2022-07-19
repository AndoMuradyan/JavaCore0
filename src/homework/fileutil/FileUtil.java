package homework.fileutil;

import java.io.*;
import java.nio.CharBuffer;
import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class FileUtil {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
//        fileSearch();
//        createFileWithContent();
        printSizeOfPackage();
//        contentSearch();

    }


    //այս մեթոդը պետք է սքաններով վերցնի երկու string.
    // 1 - path թե որ ֆոլդերում ենք փնտրելու
    // 2 - fileName - ֆայլի անունը, որը փնտրում ենք։
    //Որպես արդյունք պտի ծրագիրը տպի true եթե կա էդ ֆայլը էդ պապկի մեջ, false եթե չկա։
    static void fileSearch() {
//        System.out.println("please input path");
//        String path = scanner.nextLine();
//        System.out.println("please input file name");
//        String fileName = scanner.nextLine();
//        File file = new File(path);
//        File[] files = file.listFiles();
//        for (File file1 : files) {
//            System.out.println(file1.getName().equals(fileName));
//            break;


    }

    //այս մեթոդը պետք է սքաններով վերցնի երեք string.
    // 1 - path պապկի տեղը, թե որտեղ է սարքելու նոր ֆայլը
    // 2 - fileName ֆայլի անունը, թե ինչ անունով ֆայլ է սարքելու
    // 3 - content ֆայլի պարունակությունը։ Այսինքն ստեղծված ֆայլի մեջ ինչ է գրելու
    // որպես արդյունք պապկի մեջ սարքելու է նոր ֆայլ, իրա մեջ էլ լինելու է content-ով տվածը
    static void createFileWithContent() throws IOException {
//        System.out.println("please input path ");
//        String path = scanner.nextLine();
//        System.out.println("please input file name");
//        String fileName = scanner.nextLine();
//        System.out.println("please input content ");
//        String content = scanner.nextLine();
//        File myFile = new File(path);
//        if (myFile.exists()) {
//            myFile.createNewFile();
//            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(fileName));
//            bufferedWriter.write(content);
//            bufferedWriter.close();
//
//        }
//    }
    }


//այս մեթոդը պետք է սքաններով վերցնի մեկ string.
// 1 - path թե որ ֆոլդերի չափն ենք ուզում հաշվել
// ֆոլդերի բոլոր ֆայլերի չափսերը գումարում ենք իրար, ու տպում
    static void printSizeOfPackage() {
        System.out.println("please input path ");
        String path = scanner.nextLine();
        int size = 0;
        File file = new File(path);
//        for (File file1 : file.listFiles()) {
        for (File file1 : Objects.requireNonNull(file.listFiles())) {
            size += file1.length();

        }
        System.out.println(size);

    }


    //այս մեթոդը պետք է սքաններով վերցնի երկու string.
// 1 - path թե որ ֆոլդերում ենք փնտրելու
// 2 - keyword - ինչ որ բառ
// Մեթոդը պետք է նշված path-ում գտնի բոլոր .txt ֆայլերը, և իրենց մեջ փնտրի
// մեր տված keyword-ը, եթե գտնի, պետք է տպի տվյալ ֆայլի անունը։
    static void contentSearch() {
//        System.out.println("Please input path");
//        String path = scanner.nextLine();
//        System.out.println("Please input keyword");
//        String keyword = scanner.nextLine();
//
//
//
//        try (BufferedReader inputStream = new BufferedReader(new FileReader(path))) {
//            String line = "";
//            while ((line = inputStream.readLine()) != null) {
//                if (line.contains(keyword)) {
//                    System.out.println(path);
//                }
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
    }
}

//այս մեթոդը պետք է սքաններով վերցնի երկու string.
// 1 - txtPath txt ֆայլի փաթը
// 2 - keyword - ինչ որ բառ
// տալու ենք txt ֆայլի տեղը, ու ինչ որ բառ, ինքը տպելու է էն տողերը, որտեղ գտնի էդ բառը։
//}





