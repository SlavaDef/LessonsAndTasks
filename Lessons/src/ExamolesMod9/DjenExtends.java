package ExamolesMod9;

/*
Ми можемо вказати, що метод або клас може працювати лише з певним набором класів.
Для цього ми використовуємо ключове слово extends.

Наприклад, ось так ми можемо оголосити метод, який друкуватиме масив чисел будь-якого типу
- Integer, Double, тощо.

 */

public class DjenExtends {

    public <E extends Number> void printNumbers(E[] array) { // метод будет роб только с числами
        for (E item : array) {
            System.out.print(item + " ");
        }


    }
    public <E extends String> void printStrings(E[] array) { // метод будет роб только с Stringoi
        for (E item : array) {
            System.out.print(item+ " ");
        }

    }

    public <E extends  Character > void printStringsAndChar(E[] array) { // метод будет роб только с Character
        for (E item : array) {
            System.out.print(item+ " ");
        }

    }

}

class TestDjenExtends{

    public static void main(String[] args) {

        Integer [] numbers = {22, 44, 55, 99, 11, 55, 77};
        Double [] doubles = {22.7, 5.78, 3.22, 89.5, 12.33};
        String [] str = {"Hello", "Margo", "Robinson"};
        Character [] characters = {'J', 'A', 'V', 'A'};

        new DjenExtends().printNumbers(doubles); // String, Char - NO
        new DjenExtends().printNumbers(numbers); // String, Char - NO
        new DjenExtends().printStrings(str); // onley String
        new DjenExtends().printStringsAndChar(characters); // onley Char
    }
}