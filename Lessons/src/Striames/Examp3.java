package Striames;
import java.util.stream.Stream;

// https://winterbe.com/posts/2014/07/31/java8-stream-tutorial-examples/
// example consists of two intermediate operations map and filter and the terminal operation forEach.
// Let’s once again inspect how those operations are being executed
public class Examp3 {

    public static void main(String[] args) {

        Stream.of("d2", "a2", "b1", "b3", "c")
                .map(s -> {
                    System.out.println("map: " + s);
                    return s.toUpperCase();
                })
                .filter(s -> {
                    System.out.println("filter: " + s);
                    return s.startsWith("A");
                })
                .forEach(s -> System.out.println("forEach: " + s));

        // map:     d2
// filter:  D2
// map:     a2
// filter:  A2
// forEach: A2
// map:     b1
// filter:  B1
// map:     b3
// filter:  B3
// map:     c
// filter:  C

// As you might have guessed both map and filter are called five times for every string in
// the underlying collection whereas forEach is only called once.


        // We can greatly reduce the actual number of executions if we change the order of the operations,
        // moving filter to the beginning of the chain:

        Stream.of("d2", "a2", "b1", "b3", "c")
                .filter(s -> {
                    System.out.println("filter: " + s);
                    return s.startsWith("a");
                })
                .map(s -> {
                    System.out.println("map: " + s);
                    return s.toUpperCase();
                })
                .forEach(s -> System.out.println("forEach: " + s));

// filter:  d2
// filter:  a2
// map:     a2
// forEach: A2
// filter:  b1
// filter:  b3
// filter:  c
// Now, map is only called once so the operation pipeline performs much faster for larger numbers of
// input elements. Keep that in mind when composing complex method chains.


    }
}


