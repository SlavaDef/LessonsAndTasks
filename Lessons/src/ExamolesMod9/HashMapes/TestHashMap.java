package ExamolesMod9.HashMapes;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class TestHashMap {

    public static void main(String[] args) {

        Map<String,String> capitals = new HashMap<>();

        // add elements

        capitals.put("Germani", "Berlin");
        capitals.put("Ukraine", "Kyiv");
        capitals.put("USA", "New York");
        capitals.put("France", "Parice");
        capitals.put("Great Britain", "London");

        System.out.println(capitals);

        // получить по ключу - значение get();

        String germany = capitals.get("Germani");
        System.out.println("Germani capital is "+germany);

        // delate element

        capitals.remove("France");
        System.out.println(capitals);

        System.out.println("Size is "+ capitals.size()); // return size

        // получаем набор ключей

        Set<String> keySet = capitals.keySet();
        System.out.println(keySet);

        // так же можно вывести только значения

        Collection<String> values = capitals.values();
        System.out.println(values);

        // отдельно то отдельно то

        Set<Map.Entry<String,String>> entries = capitals.entrySet();

        for(Map.Entry<String,String> entry: entries){

            System.out.println("Enterys");
            System.out.println("Keys = " + entry.getKey());
            System.out.println("Values = " + entry.getValue());
            System.out.println("HashCode = " + entry.hashCode());
        }



    }
}
