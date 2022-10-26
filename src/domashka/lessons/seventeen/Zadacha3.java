package domashka.lessons.seventeen;

import java.io.File;

public class Zadacha3 {

    public static void main(String[] args) {

        File file = new File("D:\\PROV");
        String fileName = "s1.txt";
        filePrint(file,fileName);
    }
    public static void filePrint(File file,String fileName) {

        File[] filesArray = file.listFiles();

        if (filesArray!=null){
            for (File file1 : filesArray) {

                if (file1.isDirectory()) {
                    filePrint(file1,fileName);
                }else if (file1.getName().equals(fileName)){
                    System.out.println(true);
                }
            }
        }

    }
}
