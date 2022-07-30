package classwork;

import java.io.File;
import java.io.IOException;

public class FileExample {
    static String filePath = "C:\\Users\\user\\IdeaProjects\\JavaCore0\\src\\classwork\\testFolder\\hello.txt";
    static String newFilePath = "C:\\Users\\user\\IdeaProjects\\JavaCore0\\src\\classwork\\testFolder\\hello3.txt";

    public static void main(String[] args) throws IOException {
        File myFile = new File(filePath);
//        System.out.println(myFile.exists());
//        if (!myFile.exists()) {
//            myFile.createNewFile();
//            System.out.println(myFile.exists());
//exists kstuge file ka te chka
//createNewFile ete chka kavelcne
//        }
//        ======================
//        System.out.println("isFail: " + myFile.isFile());
//        System.out.println("isDirectory: " + myFile.isDirectory());
//        if (myFile.isDirectory()) {
//            File[] files = myFile.listFiles();
//            for (File file : files) {
//                System.out.println(file.getName());
//            }
//
//        }
//        =================
//        mkDir - ete me papaka u chuninq ksarke
//        mkDirs - ete sat papkek en u ete chuninq ksarke
//        kveradarcne true kam false
//        System.out.println(myFile.mkdir());
//        System.out.println(myFile.mkdirs());
//        ======================
//        renameTo - faili anuny poxenq
//        boolean b = myFile.renameTo(new File(newFilePath));
//        System.out.println(b);

    }
}
