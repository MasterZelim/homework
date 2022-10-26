package domashka.lessons.twentytwo;

import java.io.*;

public class ArraySum {

    public static void main(String[] args) {

        try( FileReader fileReader1 = new FileReader("C:\\Users\\Zelim\\Documents\\PROGRAMMIROVANIE\\array1.txt");
             FileReader fileReader2 = new FileReader("C:\\Users\\Zelim\\Documents\\PROGRAMMIROVANIE\\array2.txt");
             BufferedReader bufferedReader1 = new BufferedReader(fileReader1);
             BufferedReader bufferedReader2 = new BufferedReader(fileReader2);
             FileWriter fileWriter = new FileWriter("C:\\Users\\Zelim\\Documents\\PROGRAMMIROVANIE\\array3.txt");
             BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)) {

            while (bufferedReader1.ready()){
                String file1 = bufferedReader1.readLine();
                String file2 = bufferedReader2.readLine();

                String[] array1 = file1.split(" ");
                String[] array2 = file2.split(" ");

                for (int i = 0; i < array1.length; i++) {

                    int c = Integer.parseInt(array1[i])+Integer.parseInt(array2[i]);
                    bufferedWriter.write(c+" ");

                }
            bufferedWriter.write("\n");

            }


        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
