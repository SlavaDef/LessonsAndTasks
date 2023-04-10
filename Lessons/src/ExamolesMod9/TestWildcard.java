package ExamolesMod9;

import java.util.*;

public class TestWildcard {

    /*
    Припустимо, що у нас є два класи: Transport, та його спадкоємець Car.

Вони мають метод drive (який перевизначений у спадкоємця).
Ми хочемо створити метод, який прийматиме список з транспортом і запускатиме кожен транспорт
(викликати метод drive):

Однак, якщо ми спробуємо передати в метод перелік машин, то отримаємо помилку компіляції. Чому?

     */

    public static void driveAllTransport2(List<Transport> transports) { // no,can write Car, but method not be universall
        for(Transport transport : transports) {
            transport.drive();
        }
    }

    // Приклад нище читається так – "приймаємо колекцію елементів, тип елементів –
    // будь-який, який наслідуєтьься від Transport".

    public static void driveAllTransport(List<? extends Transport> transports) {
        for(Transport transport : transports) {
            transport.drive();
        }
    }

    public static void main(String[] args) {
        new Car("Bentli").drive();
        new Transport().drive();
        Car car = new Car("Lada");

        List<Car> cars = new ArrayList<>();
        cars.add(new Car("Mazerratti"));
        cars.add(new Car("BMW"));
        cars.add(new Car("KIA"));


        // driveAllTransport2(cars); no
        driveAllTransport(cars);


    }


}

class Transport{
public void drive(){
    System.out.println("Some transport is running");
}

}

class Car extends Transport{
    String name;
    Car(String name){
        this.name = name;
    }

    @Override
    public void drive(){
        System.out.println("my car is driving fast, because it is "+ name);
    }

}

/*
Нижня межа ієрархії

Для wildcard можна встановити нижню межу ієрархії, тобто написати <? super T>.

Це означає, що метод може працювати тільки з класом T та його батьками. Класи-спадкоємці T вже не підходять.

Користь Generic
Generic-типізація робить кілька корисних речей:

Статична типізація на етапі компіляції. Ви описуєте методи і класи,
та вказуєте з якими саме типами даних працює ваш код. Якщо ви спробуєте передати щось не те,
ваша програма навіть не скомпілюється. Раніше для схожих цілей широко використовувався клас Object,
 що призводило до цікавих помилок.

Узагальнене програмування. Ми можемо писати алгоритми для різних типів даних.
Наприклад, метод сортування може приймати список елементів будь-якого типу – рядків, чисел тощо.
Стандартна бібліотека Java багато в чому використовує дженерики для реалізації стандартних
алгоритмів (сортування, пошук мінімального-максимального елементів тощо).

 */