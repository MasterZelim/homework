package domashka.lessons.seventeen;

import java.io.File;

public class Zadacha1 {

    public static void main(String[] args) {

        File file = new File("D:\\PROV");
        filePrint(file);
    }
    public static void filePrint(File file) {

        File[] filesArray = file.listFiles();

       if (filesArray!=null){
           for (File file1 : filesArray) {

               if (file1.isDirectory()) {
                   System.out.println(file1);
                   filePrint(file1);
               }else {
                   System.out.println(file1);
               }
       }

    }
}

}
