package ExamolesMod9;

/*
Перше застосування Generic – методи. Припустимо, ми хочемо вивести масив довільних об'єктів у консоль.
Тоді Generic метод буде виглядати наступним чином:

 */
public class TypeArrayPrinter {

    public <E> void printArray(E [] data){ // метод printArray() приймає масив типу E тип любий
    for(E it : data){
    System.out.println(it);
}
    }
}

 class TypeArrayPrinterTest {

    public static void main(String[] args) {
        String[] items = {"Hello", "Java"};
        Integer[] years = {2000, 3000};
        Float[] numbers = {34f, 77.8f,22.3f,88.45f};
        int [] nub = {2,3,4,5,5,77,9}; // no

        /* TypeArrayPrinter typeArrayPrinter = new TypeArrayPrinter();
        typeArrayPrinter.printArray(items);
        typeArrayPrinter.printArray(years); */

        new TypeArrayPrinter().printArray(items); // обект без ссылки
        new TypeArrayPrinter().printArray(years);
        new TypeArrayPrinter().printArray(numbers);
        // new TypeArrayPrinter().printArray(nub); no only class obertka
        // Generic працює тільки з посилальними типами, він не може працювати з примітивами - int тощо.


    }
}

/*
У прикладі вище у метода printArray() є типізований параметр, оголошений у кутових дужках - <E>.
І сам метод printArray() приймає масив типу E.

E - це довільна назва, ми самі вигадуємо її. Як правило, це великі літери - E, T, V.
 */