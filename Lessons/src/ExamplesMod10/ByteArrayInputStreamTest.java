package ExamplesMod10;

import java.io.ByteArrayInputStream;
import java.io.IOException;

public class ByteArrayInputStreamTest {

    public static void main(String[] args)throws IOException{
        byte[] bytes = {1, 3, 5, 7, 9};
        ByteArrayInputStream bais = new ByteArrayInputStream(bytes); // цей потік читає інформацію з масиву байт

        while (bais.available() > 0) { // повертає кількість байтів, доступних для читання у потоці;
            byte currentByte = (byte) bais.read();//  повертає цілочисельне представлення наступного байта в потоці
            System.out.println(currentByte);
        }

        bais.close();// закриває потік, звільняючи захоплені ресурси (наприклад, файли)
    }
}

/*
Код вище виведе в консоль по черзі 1, 3, 5, 7, 9. У циклі while ми щоразу перевіряємо,
чи є хоч один байт для читання (bais.available() > 0).
Далі зчитується один байт (викликом bais.read()) і виводиться в консоль.
В кінці потік закривається викликом методу close().

Читати дані по одному байту неефективно, тому, зазвичай, дані читаються
блоками (як правило, по 1024 байта або кратно, тому що це розмір кілобайта).
 */
