package Striames;

import java.util.stream.Stream;

public class Examp1 {

    public static void main(String[] args) {

        //Here’s a combined example: the stream of doubles is first mapped to an int stream and than mapped to
        // an object stream of strings:
          Stream.of(1.0, 2.0, 3.0)
                .mapToInt(Double::intValue)
                .mapToObj(i -> "a" + i)
                .forEach(System.out::println);
    }
}
