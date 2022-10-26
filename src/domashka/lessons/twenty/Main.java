package domashka.lessons.twenty;

import javax.swing.*;
import javax.swing.text.Style;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {

        outputString("учиться учиться и еще раз учиться");
        outputString2("учиться учиться и еще раз учиться");
    }
    public static void outputString(String string){

        String[] stringsArray = string.split(" ");

        Set<String> hashSet = new HashSet<>();
        Collections.addAll(hashSet, stringsArray);

        System.out.println(hashSet);
    }

    public static void outputString2(String string){

        String[] stringsArray = string.split(" ");

        Set<String> hashSet = new HashSet<>();
        Collections.addAll(hashSet, stringsArray);

        for (String s: hashSet) {
            int temp = 0;
            for (String m: stringsArray) {
                if (s.equals(m)){
                    temp++;
                }
            }

            System.out.print(s +"-"+temp +" ");
        }
    }
}
