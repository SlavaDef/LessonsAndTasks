package ExamplesMod10;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.*;

public class WhoOwnerMeMoneyTest {


    static void methodThirt(String file) throws IOException {
        file = "C:\\Users\\SV\\Desktop\\FILES\\WordsDublicates.txt";
        Map<String, Integer> personDep = new TreeMap<>();
        try (InputStream fis = new FileInputStream(file);
             Scanner scanner = new Scanner(fis)) {
            while (scanner.hasNext()) {
                String line = scanner.next();
                if (personDep.containsKey(line)) {
                    int current = personDep.get(line);
                    personDep.put(line, current + 1);
                } else {
                    personDep.put(line, 1);
                }
            }
        }
        personDep.entrySet().stream()
                .sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
                .forEach(System.out::println);


    }

    public static void main(String[] args) throws IOException {

        methodThirt("C:\\Users\\SV\\Desktop\\FILES\\WordsDublicates.txt");
       /*Map<String, Integer> personDep = new TreeMap<>();

       // Map<String,Integer> treemap = new TreeMap<>(personDep);
        try (InputStream fis = new FileInputStream("C:\\Users\\SV\\Desktop\\FILES\\WordsDublicates.txt");
             Scanner scanner = new Scanner(fis)) {
            while (scanner.hasNext()) {
                String line = scanner.next();
                if (personDep.containsKey(line)) {
                    int current = personDep.get(line);
                    personDep.put(line, current + 1);
                } else {
                    personDep.put(line, 1);
                }
            }
        }
        personDep.entrySet().stream()
                .sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
                .forEach(System.out::println);


        //System.out.println(personDep);



*/
    }

}

