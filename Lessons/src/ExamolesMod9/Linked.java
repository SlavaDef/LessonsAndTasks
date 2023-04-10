package ExamolesMod9;

import java.util.*;

public class Linked {

    public static void main(String[] args) {

        // LinkedList выбирают если есть вставка в конец или в начало

        Deque<String> deque = new LinkedList<>();
            deque.add("78");

        List<String> list2 = new LinkedList<>();

        list2.add("SVS");
        list2.add("BBC");
        list2.add("AMD");


        List<String> list = new LinkedList<>(deque); // конструктор может принять колекции
// output [78, One, Zero, Year, Kilo, Dad] deque + listu

        list.add("One");
        list.add("Zero");
        list.add("Year");
        list.add("Kilo");
        list.add("Dad");
        list.add(0,"Mam"); // такжк при добавлении можно указать индекс куда добаыить

        //list.addAll(list2); // list.addAll() додаст колекцию сразу
        list.addAll(1, list2); // можно указать индекс от куда добавлять

        System.out.println(list);

        list.remove("Kilo"); // delete element
        list.remove(2); // delete from index
        list.contains("JDK"); // return true or false if element is in colection
        System.out.println(list);

        for (String noda: list){ // print oll elements in list
            System.out.print(" "+ noda);
        }

        list.add("78");

        System.out.println(list.lastIndexOf("78")); // return 8 последнее вхождение на 8 позиции



    }
}
