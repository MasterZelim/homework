package domashka.lessons.fourteen;

import java.util.LinkedList;

public class Main {


    public static void main(String[] args) {


        List list = new List();



        list.add(1);
        list.addFirst(3);
        list.add(2);
        list.add(5);
        list.addLast(4);
        list.deleteFirst();
        list.deleteLast();
        System.out.println(list.first.data);
        System.out.println(list.last.data);
    }


}
