package domashka.lessons.seventeen;

import java.io.File;

public class Zadacha4 {

    public static void main(String[] args) {

        File file = new File("D:\\PROV");
        int fileByte = 5;
        filePrint(file,fileByte);
    }
    public static void filePrint(File file,int fileByte) {

        File[] filesArray = file.listFiles();

        if (filesArray!=null){
            for (File file1 : filesArray) {

                if (file1.isDirectory()) {
                    filePrint(file1,fileByte);
                }else if (file1.length()>fileByte){
                    System.out.println(file1.getName());
                }
            }
        }

    }
}
