package Striames;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Examp6 {

    public static void main(String[] args) {

        List<PersonOfFbr> persons =
                Arrays.asList(
                        new PersonOfFbr("Max", 18),
                        new PersonOfFbr("Peter", 23),
                        new PersonOfFbr("Pamela", 23),
                        new PersonOfFbr("David", 12),
                        new PersonOfFbr("Mia", 12),
                        new PersonOfFbr("Sidni", 17));

        List<PersonOfFbr> filtered =
                persons
                        .stream()
                        .filter(p -> p.name.startsWith("P"))
                        .collect(Collectors.toList());

        System.out.println(filtered);    // [Peter, Pamela]

        System.out.println("=============================");

        Map<Integer, List<PersonOfFbr>> personsByAge = persons
                .stream()
                .collect(Collectors.groupingBy(p -> p.age));

        personsByAge
                .forEach((age, p) -> System.out.format("age %s: %s\n", age, p));
// age 17: [Sidni]
// age 18: [Max]
// age 23: [Peter, Pamela]
// age 12: [David, Mia]

        // Collectors are extremely versatile. You can also create aggregations on the elements of the stream,
        // e.g. determining the average age of all persons

        System.out.println("=============================");

        Double averageAge = persons
                .stream()
                .collect(Collectors.averagingInt(p -> p.age)); // averagingInt() = средний возраст

        System.out.println(averageAge);

        System.out.println("=============================");

        // If you’re interested in more comprehensive statistics, the summarizing collectors return a special
        // built-in summary statistics object. So we can simply determine min,
        // max and arithmetic average age of the persons as well as the sum and count.

        IntSummaryStatistics ageSummary = // IntSummaryStatistics = class по статистике обькута
                persons
                        .stream()
                        .collect(Collectors.summarizingInt(p -> p.age));// statistik po age

        System.out.println(ageSummary);

// IntSummaryStatistics{count=4, sum=76, min=12, average=19.000000, max=23}
        // count = кількість обьектів, сумма інтів, мі макс и середні значення

    }
}
