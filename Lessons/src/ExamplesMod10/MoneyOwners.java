package ExamplesMod10;

import javax.imageio.stream.ImageInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MoneyOwners {

    public static void main(String[] args) throws IOException {

        Map<String,Integer> personDebt = new HashMap<>(); //  ashMap хранит данные
               // InputStream считает с файла
        try(InputStream fis = new FileInputStream("C:\\Users\\SV\\Desktop\\FILES\\MoneyOwner.txt");
            Scanner scanner = new Scanner(fis)) { // креатим сканер и передаем в него ссылку на файл
            while (scanner.hasNext()){ // пока есть след строчка
                String line = scanner.nextLine(); // заносим строчку в переменную
                String[] splitedLine = line.split(" "); // делим ее по пробелу
                String name = splitedLine[0]; // заносим первый элемент в переменную имен долж ов
                int money = Integer.parseInt(splitedLine[1]);
                if(personDebt.containsKey(name)){
                    int currenDebt = personDebt.get(name);
                    personDebt.put(name,currenDebt+money);
                }else {
                    personDebt.put(name,money);
                }
            }

        }
    }
}
