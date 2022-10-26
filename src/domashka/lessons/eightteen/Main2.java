package domashka.lessons.eightteen;

import java.io.*;
import java.util.ArrayList;

public class Main2 {

    public static void main(String[] args) {
        File file = new File("C:\\Users\\Zelim\\Music\\Папка1");
        File[] listFiles = file.listFiles();
        for (File file1 : listFiles) {
            ArrayList<String> arrayList = metodReader(file1);
            metodWriter(arrayList, file1.getName());

        }
    }
    public static ArrayList<String> metodReader(File file) {
        ArrayList<String> arrayList;
        try (FileReader fileReader = new FileReader(file);
             BufferedReader bufferedReader = new BufferedReader(fileReader)) {

            arrayList = new ArrayList<>();
            while (bufferedReader.ready()) {
                arrayList.add(bufferedReader.readLine());
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return arrayList;
    }

    public static void metodWriter(ArrayList<String> arrayList, String fileName) {

        File file = new File("C:\\Users\\Zelim\\Music\\Папка2", fileName);
        try (FileWriter fileWriter = new FileWriter(file);
             BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)) {

            for (String s : arrayList) {
                bufferedWriter.write(s + "\n");
                bufferedWriter.flush();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}




