package Task9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestColections {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("one");
        list.add("two");
        list.add("three");
        list.add("four");



        for (String el : list){
            System.out.println("el = " + el);
        }

      list.remove(2);

        for (String el : list){
            System.out.println("el = " + el);
        }

        list.clear();
        for (String el : list){
            System.out.println("el = " + el);
        }
    }




}
