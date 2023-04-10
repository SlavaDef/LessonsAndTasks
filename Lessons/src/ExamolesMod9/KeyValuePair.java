package ExamolesMod9;

// Наступне застосування generic – це узагальнені класи. Для цього після імені класу ми вказуємо
// в кутових дужках один або більше типізованих параметрів.
// Наприклад, так можна оголосити клас, який зберігає ключ і відповідне цьому ключу значення.
// При цьому, ми самі вибираємо тип ключа і тип значення:

public class KeyValuePair <K,V> {

    private K key; // тож самое только за ранее не указываем тип переменной
    private V value;

    public K getKey() {
        return key;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return key + " = " + value;
    }
}

class KeyValueTest {
    public static void main(String[] args) {
        KeyValuePair<String, Integer> javaSalary = new KeyValuePair<String, Integer>();
        javaSalary.setKey("Java");
        javaSalary.setValue(5000);
        System.out.println(javaSalary);

        // типы уже указываем при создынии
        KeyValuePair<Integer, String> translate = new KeyValuePair<>();
        translate.setKey(8);
        translate.setValue("восемь");
        System.out.println(translate);

        KeyValuePair<String, String> sinonims = new KeyValuePair<>();
        sinonims.setKey("Hello");
        sinonims.setValue("Hai");
        System.out.println(sinonims);

        KeyValuePair<Character, Double> numbers = new KeyValuePair<Character, Double>();
        numbers.setKey('J');
        numbers.setValue(66.55);
        System.out.println(numbers);

    }
}

/*
Ми оголосили клас KeyValuePair, у якого є два типізовані параметри - K та V.
Це тип ключа та тип значення відповідно.

Далі, коли ми створюємо об'єкти цього класу, ми вказуємо не тільки ім'я класу KeyValuePair,
але й вказуємо, якими типами параметрів типізувати цей клас. У нашому випадку - це String та Integer.

Коли ми ініціалізуємо об'єкт (new KeyValuePair<String, Integer>()), ми також вказуємо ці типи даних.

Створивши цей об'єкт, ми його використовуємо, викликаючи методи setKey() та setValue().
При цьому компілятор не дасть нам передати в методи setKey() і setValue() неправильні типи даних.
Код нижче не скомпілюється:

KeyValuePair<String, Integer> javaSalary = new KeyValuePair<String, Integer>();
javaSalary.setKey(100);

Компілятор побачить, що метод setKey() для об'єкта javaSalary повинен приймати лише тип даних String.
Тип даних Integer у цьому разі - неприпустимий.

При цьому нічого не заважає нам створити два об'єкта keyValuePair з різною типізацією:

KeyValuePair<String, Integer> javaSalary = new KeyValuePair<String, Integer>();
KeyValuePair<Integer, Float> yearAvgTemperature = new KeyValuePair<Integer, Float>();

javaSalary.setKey("Java");
javaSalary.setValue(5000);

yearAvgTemperature.setKey(3200);
yearAvgTemperature.setValue(15f);
 */
