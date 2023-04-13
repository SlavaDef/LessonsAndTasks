package Striames;

import java.util.stream.Stream;

public class Examp4Sorted {
// Let’s extend the above example by an additional operation, sorted:
    public static void main(String[] args) {

        Stream.of("d2", "a2", "b1", "b3", "c")
                .sorted((s1, s2) -> {
                    System.out.printf("sort: %s; %s\n", s1, s2);
                    return s1.compareTo(s2);
                })
                .filter(s -> {
                    System.out.println("filter: " + s);
                    return s.startsWith("a");
                })
                .map(s -> {
                    System.out.println("map: " + s);
                    return s.toUpperCase();
                })
                .forEach(s -> System.out.println("forEach: " + s));

     /*   Sorting is a special kind of intermediate operation. It’s a so called stateful operation since in order to
     sort a collection of elements you have to maintain state during ordering.

        Executing this example results in the following console output:

        sort:    a2; d2
        sort:    b1; a2
        sort:    b1; d2
        sort:    b1; a2
        sort:    b3; b1
        sort:    b3; d2
        sort:    c; b3
        sort:    c; d2
        filter:  a2
        map:     a2
        forEach: A2
        filter:  b1
        filter:  b3
        filter:  c
        filter:  d2 */

        // First, the sort operation is executed on the entire input collection. In other words sorted is
        // executed horizontally. So in this case sorted is called eight times for multiple combinations on every
        // element in the input collection.

       // Once again we can optimize the performance by reordering the chain:

        Stream.of("d2", "a2", "b1", "b3", "c")
                .filter(s -> {
                    System.out.println("filter: " + s);
                    return s.startsWith("a");
                })
                .sorted((s1, s2) -> {
                    System.out.printf("sort: %s; %s\n", s1, s2);
                    return s1.compareTo(s2);
                })
                .map(s -> {
                    System.out.println("map: " + s);
                    return s.toUpperCase();
                })
                .forEach(s -> System.out.println("forEach: " + s));

// filter:  d2
// filter:  a2
// filter:  b1
// filter:  b3
// filter:  c
// map:     a2
// forEach: A2
       // In this example sorted is never been called because filter reduces the input collection to just one element.
        // So the performance is greatly increased for larger input collections.
    }
}
