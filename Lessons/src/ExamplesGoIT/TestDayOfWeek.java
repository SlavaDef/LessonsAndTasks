package ExamplesGoIT;

import java.util.Arrays;

public class TestDayOfWeek {


    public static void main(String[] args) {

        MyDayOfWeek dayOfWeek = MyDayOfWeek.FRIDAY; // обращение как к константе

        whotDayIsIt(dayOfWeek); // вызвали метод и передплли в него ссылку

        final  MyDayOfWeek [] values = MyDayOfWeek.values(); // вернет масив Enumov
        System.out.println(Arrays.toString(values));

        final MyDayOfWeek fr = MyDayOfWeek.valueOf("FRIDAY");
        System.out.println(fr);

        final String name = fr.name(); // теперь работаем как со String_ой
        System.out.println(name);

        final String dayFree = fr.getDayOfWeek(); // геттер перевода
        System.out.println("Day is " + name + " day of " + dayFree);

        final int dayNumber = fr.getIndeficate(); // геттер индификатора
        System.out.println("Whot day is it now? "+ dayNumber);

        // 12.39

    }

    private static void whotDayIsIt(MyDayOfWeek day){
switch (day){
    case SUNDAY:
    case SUTTURDAY:
    System.out.println("Today is Free day");
    break;
    case MONDY:

    case THURSDAY:
        case WENSDAY:

    case TUESDAY:

    case FRIDAY:
        System.out.println("Today is working day");
        break;

    default:
        System.out.println("No such day of week!");



}

    }
}
