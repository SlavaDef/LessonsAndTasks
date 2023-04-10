package Les;

public class WaterCounter {

    public double count(String text){

        double count = 0;



        String wo = text.replace(" ", "");

        double len = text.length();

        count = (text.length()- wo.length())/ len;

        //System.out.println(wo.length()+" "+ text.length() + " " + wo.length());

        //System.out.println((text.length()- word.length)/ len);


return count;
    }
}

class WaterCounterTest {
    public static void main(String[] args) {
        //0.07692307692307693
        System.out.println(new WaterCounter().count("Moon invaders"));

        //0
        System.out.println(new WaterCounter().count("NoWater"));
    }
}


/*
22.7
Бувають такі тексти, після прочитання яких ми не отримуємо нову інформацію. У таких текстах дуже багато води
- марної інформації.

Деякі автори текстів люблять додавати по два і більше пробілів між словами, і виходить,
що загалом текст вийшов довшим (символів більше), але користі в тексті не додалося.

Напиши програму, яка визначатиме такі водянисті тексти.

Водянистістю називатимемо ставлення числа прогалин у тексті до загальної кількості символів у тексті.
Напиши клас WaterCounter. У цьому класі створи метод public double count(String text).
Він приймає рядок і повертає водянистість - відношення кількості пробілів у тексті до загальної
кількості символів у тексті.

Ніяк не округляй результат, що повертається.

виклик коду new WaterCounter().count("Moon invaders") повертає 0.07692307692307693;
виклик коду new WaterCounter().count("NoWater") повертає 0.



 */