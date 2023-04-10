package ExamplesMod7;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;

public class CodeTable {
    public static void main(String[] args) {

        byte [] arr = {74,65,86,65};
        String str = new String(arr); // конструктор у String может принять масив байтов каждая цифрв соотвецтвует букве
        String str2 = new String(arr, StandardCharsets.UTF_16BE); // можно выбрать кодировку тут китай
        System.out.println(str);
        System.out.println(str2);
        byte [] bytes = str.getBytes(); // create masiv of bytes with metod getBytes()
        System.out.println("bytes = "+Arrays.toString(bytes)); // вывод масива

    }
}
