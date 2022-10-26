package samostoiatelnayrabota;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        ArrayList<String> arrayList2 = new ArrayList<>();
        String[] stringsArray;
        String[] stringsArray2;

        try ( FileInputStream fileInputStream = new FileInputStream("C:\\Users\\Zelim\\Documents\\input.txt");
              BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(fileInputStream));
              FileOutputStream fileOutputStream = new FileOutputStream("C:\\Users\\Zelim\\Documents\\output.txt");
              BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(fileOutputStream))){

            while (bufferedReader.ready()) {
                arrayList.add(bufferedReader.readLine());
            }

            stringsArray = new String[Integer.parseInt(arrayList.get(0))];
            for (int i = 0; i < stringsArray.length; i++) {
                stringsArray[i] = arrayList.get(i + 1);
            }

            stringsArray2 = new String[Integer.parseInt(arrayList.get(stringsArray.length + 1))];
            for (int i = 0; i < stringsArray2.length; i++) {
                stringsArray2[i] = arrayList.get(stringsArray.length + i + 2);
            }

            if (stringsArray.length > stringsArray2.length) {

                arrayList2 = condition(stringsArray, stringsArray2);

            } else if (stringsArray.length == 1 && stringsArray2.length == 1) {
                arrayList2 = condition2(stringsArray, stringsArray2);

            } else if (stringsArray2.length > stringsArray.length) {
                arrayList2 = condition3(stringsArray, stringsArray2);

            }


            for (int i = 0; i < arrayList2.size(); i++) {
                bufferedWriter.write(arrayList2.get(i));
                bufferedWriter.newLine();
            }
            bufferedWriter.flush();


        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    public static ArrayList<String> condition(String[] stringsArray, String[] stringsArray2) {
        HashMap<Integer, String> hashMap = new HashMap<>();
        HashMap<Integer, String> hashMap2 = new HashMap<>();
        ArrayList<String> arrayList = new ArrayList<>();

        for (int i = 0; i < stringsArray.length; i++) {
            int max = 0;
            for (int j = 0; j < stringsArray2.length; j++) {
                int numberOfMatches = compare1(stringsArray[i], stringsArray2[j]);
                hashMap.put(numberOfMatches, stringsArray[i] + ":" + stringsArray2[j]);
            }

            for (int key : hashMap.keySet()) {
                if (key > max) {
                    max = key;
                }
            }

            hashMap2.put(max, hashMap.get(max));
            hashMap.clear();
        }

        int min = Integer.MAX_VALUE;
        for (int key : hashMap2.keySet()) {
            if (key < min) {
                min = key;
            }
        }

        for (int key : hashMap2.keySet()) {
            if (key == min) {
                int a = hashMap2.get(key).indexOf(":");
                String s = hashMap2.get(key).substring(0, a);
                arrayList.add(s + ":?");
            } else {
                arrayList.add(hashMap2.get(key));
            }
        }

        return arrayList;
    }

    public static ArrayList<String> condition2(String[] stringsArray, String[] stringsArray2) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add(stringsArray[0] + ":" + stringsArray2[0]);
        return arrayList;
    }


    public static ArrayList<String> condition3(String[] stringsArray, String[] stringsArray2) {

        HashMap<Integer, String> hashMap = new HashMap<>();
        HashMap<Integer, String> hashMap2 = new HashMap<>();
        ArrayList<String> arrayList = new ArrayList<>();

        for (int i = 0; i < stringsArray2.length; i++) {
            int max = 0;
            for (int j = 0; j < stringsArray.length; j++) {
                int numberOfMatches = compare1(stringsArray2[i], stringsArray[j]);
                hashMap.put(numberOfMatches, stringsArray[j] + ":" + stringsArray2[i]);
            }

            for (int key : hashMap.keySet()) {
                if (key > max) {
                    max = key;
                }
            }

            hashMap2.put(max, hashMap.get(max));
            hashMap.clear();
        }

        int min = Integer.MAX_VALUE;
        for (int key : hashMap2.keySet()) {
            if (key < min) {
                min = key;
            }
        }

        for (int key : hashMap2.keySet()) {
            if (key == min) {
                int a = hashMap2.get(key).indexOf(":");
                String s = hashMap2.get(key).substring(a + 1, hashMap2.get(key).length());
                arrayList.add(s + ":?");
            } else {
                arrayList.add(hashMap2.get(key));
            }
        }

        return arrayList;
    }


    public static int compare1(String stringsArrayCompare, String stringsArrayCompare2) {

        int numberOfMatches = 0;

        char[] chars = stringsArrayCompare.toCharArray();
        char[] chars1 = stringsArrayCompare2.toCharArray();

        for (int i = 0; i < chars.length; i++) {

            for (int j = 0; j < chars1.length; j++) {

                if (chars[i] == chars1[j]) {
                    numberOfMatches++;
                }

            }

        }

        return numberOfMatches;
    }


}



