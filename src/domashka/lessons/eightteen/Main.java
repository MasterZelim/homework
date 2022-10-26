package domashka.lessons.eightteen;

import java.io.*;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        String path = "C:\\Users\\Zelim\\Music\\Папка1";
        createFile(path);
    }

    public static void createFile(String path) {

        File file = new File(path);
        File[] files = file.listFiles();
        file = new File(path, "file");

        try (FileWriter fileWriter = new FileWriter(file);
             BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)) {

            if (files != null) {
                for (File file1 : files) {
                    bufferedWriter.write(file1.getName() + " " + file1.length() + "\n");
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}

