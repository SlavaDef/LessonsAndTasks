package ExamplesMod10;

import java.io.ByteArrayInputStream;
import java.io.IOException;

public class ByteArrayInputStreamTest2 {
    public static void main(String[] args) throws IOException{

        byte[] bytes = {1, 3, 5, 7, 9};
        ByteArrayInputStream bais = new ByteArrayInputStream(bytes);

        byte[] buffer = new byte[1024];//Тут ми оголосили змінну buffer розміром 1024 байти

        //  зчитує байти з потоку в масив buffer. Повертає кількість записаних у буфер байт
        int readByteCount = bais.read(buffer, 0, buffer.length);

        for(int i = 0; i < readByteCount; i++) {
            System.out.println(buffer[i]);
        }

        bais.close();

    }
}

/*
Тут ми оголосили змінну buffer розміром 1024 байти.
Далі прочитали дані у цей буфер. У змінну readyByteCount ми зберегли кількість прочитаних байт.
Далі в циклі вивели readyByteCount байт з масиву buffer.
 */
