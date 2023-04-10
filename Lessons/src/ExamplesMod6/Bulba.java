package ExamplesMod6;

import java.util.Arrays;

public class Bulba {

    /*public static void sortBulb(int[] numbers, Comporator comporator) {

        boolean isSorted = false;
        int numb;

        while (!isSorted) { // while
            isSorted = true; // sink will be true, we are optimixers
            for (int i = 0; i < numbers.length - 1; i++) {
                if (numbers[i] > numbers[i + 1]) {
                    isSorted = false;

                    numb = numbers[i];
                    numbers[i] = numbers[i + 1];
                    numbers[i + 1] = numb;
                }
            }
        }
    }
    */



        public static void sort(int [] arr, Comparator comparator){ // метод принимант масив и обьект Comparator
            boolean sorted = false;
            int buf;

            while(!sorted) {
                sorted = true;
                for (int i = 0; i < arr.length-1; i++) {
                    if(comparator.compare(arr[i], arr[i+1])){ // вызвалем метод compare и передаем туда числа масива
                        sorted = false;

                        buf = arr[i]; // временная переменная для хранения первого числа
                        arr[i] = arr[i+1];
                        arr[i+1] = buf;
                    }
                }
            }
        }


    public static void main(String[] args) {

        int [] mas = {12,3,6,8,9,34,1,5};
       // sort(mas);
       // System.out.println(Arrays.toString(mas);

        //Comparator comparator = new ComparatorDesc();

        Comparator comparator = new Comparator() { // создали обьект  Comparator
            @Override
            public boolean compare(int element1, int element2) { //  @Override method
                return element1 > element2;
            }
        };

        sort(mas, comparator); // передали параметры в метод масив и comparator
        System.out.println("arr = " + Arrays.toString(mas)); // вывод массива

    }


                    }


