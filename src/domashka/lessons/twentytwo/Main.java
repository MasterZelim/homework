package domashka.lessons.twentytwo;

import java.io.*;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        int[][] array = {{1,2,3},
                         {4,5,6}};
        ArrayList<Integer> arrayList = new ArrayList<>();

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                arrayList.add(array[i][j]);
            }
        }

        int[] array1 = new int[arrayList.size()];
        for (int i = 0; i < arrayList.size(); i++) {
            array1[i] = arrayList.get(i);
            System.out.print(array1[i]);
            System.out.print(array1[i]);

        }


    }
}