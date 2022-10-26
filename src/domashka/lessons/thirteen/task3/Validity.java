package domashka.lessons.thirteen.task3;

import java.util.ArrayList;
import java.util.Scanner;

public class Validity {

    public static void main(String[] args) {

        String matvirajenie;

        try (Scanner scanner = new Scanner(System.in)) {
            matvirajenie = scanner.nextLine();
        }
        System.out.println(validity(matvirajenie.toCharArray()));

    }

    public static boolean validity(char[] chars){
        ArrayList<Character> arrayBracket = new ArrayList<>();
        ArrayList<Character> arrayBracket1 = new ArrayList<>();
        ArrayList<Character> arrayBracket2 = new ArrayList<>();
        boolean booleanBracket;


        for (int i = 0; i < chars.length; i++) {

            if (String.valueOf(chars[i]).equals("(")){
                arrayBracket1.add(chars[i]);
                arrayBracket.add(chars[i]);
            }else if (String.valueOf(chars[i]).equals(")")){
                arrayBracket2.add(chars[i]);
                arrayBracket.add(chars[i]);
            }
        }

        if (arrayBracket1.size()!=arrayBracket2.size()){
           booleanBracket = false;
        }else if (String.valueOf(arrayBracket.get(0)).equals(")")){
            booleanBracket = false;
        }else if (String.valueOf(arrayBracket.get(arrayBracket.size()-1)).equals("(")){
            booleanBracket = false;
        }else {
            booleanBracket = true;
        }

        return booleanBracket;
    }
}
