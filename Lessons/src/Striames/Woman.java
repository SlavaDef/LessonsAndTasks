package Striames;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

public class Woman {
    String name;
    int age;
    int hp;
    int number;

    public Woman(String name, int age, int hp, int number) {
        this.name = name;
        this.age = age;
        this.hp = hp;
        this.number = number;
    }

    @Override
    public String toString() {
        return "Woman{" +
                "name='" + name + '\'' +
                '}';
    }
}

class TestWomen{

    public static void main(String[] args) {

        List<Woman> womens =
                Arrays.asList(
                        new Woman("Mia", 18, 95,667),
                        new Woman("Pony", 23, 100, 333),
                        new Woman("Pamela", 28, 89, 123),
                        new Woman("Dina", 15,100, 777),
                        new Woman("Mia", 15,99,456),
                        new Woman("Sidni", 27,95, 99));

        IntSummaryStatistics ageSummary = // IntSummaryStatistics = class по статистике обькута
                womens
                        .stream()
                        .collect(Collectors.summarizingInt(p -> p.hp));// cтaтистик по hp

        System.out.println(ageSummary);

// IntSummaryStatistics{count=6, sum=578, min=89, average=96,333333, max=100}
        // The next example joins all persons into a single string:

        String phrase = womens
                .stream()
                .filter(p -> p.age >= 18)// меньше 18 не пропустит
                .map(p -> p.name) // берет имя // Collectors.joining обьеденяет через and
                .collect(Collectors.joining(" and ", "In Germany ", " are of legal age."));
// The join collector accepts a delimiter as well as an optional prefix and suffix.
        System.out.println(phrase);
// In Germany Mia and Pony and Pamela and Sidni are of legal age.


    }
}
