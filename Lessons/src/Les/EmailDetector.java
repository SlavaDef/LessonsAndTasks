package Les;

public class EmailDetector {

    public boolean isPresent(String text){

boolean res = true;
String find = "";

String[] word = text.split(" ");

for (String elm:word){
    if(elm.contains("@")){
        find = elm;
    }
}

if(find.length()<5 || !find.contains("@")){ // длинна < 5 и елемент не содержит @
    res = false;
}


if( find.startsWith("@") | find.endsWith("@") )  {
    res = false;
     }



System.out.println(find);

return res;

    }


}

class EmailDetectorTest {
    public static void main(String[] args) {
        //true
        System.out.println(new EmailDetector().isPresent("This email is no-reply@goo.com"));

        //false
        System.out.println(new EmailDetector().isPresent("No email present, but @ there"));
        // true
        System.out.println(new EmailDetector().isPresent("eklaz arr i caby oxqaa tikue pug"));
         //false
        // System.out.println(new EmailDetector().isPresent("f kyce zue q s @ a napa"));
        //true
       // System.out.println(new EmailDetector().isPresent("f cavyr viryw@lu b"));



    }
}





/*
Коли Goo сканує сайт, то намагається знайти сторінку "Про автора". Зазвичай, на цій сторінці є email.

Напиши програму, яка визначатиме, чи є у тексті email.

Email вважається знайденим, якщо є рядок виду xx@xx, де замість x - будь-який символ, крім пробілу.

Напиши клас EmailDetector. У цьому класі створи метод public boolean isPresent(String text).
Він приймає рядок та повертає true лише в тому випадку, якщо в ньому є email згідно з описаним алгоритмом.

виконання коду new EmailDetector().isPresent("This email is no-reply@goo.com") повертає true;
виконання коду new EmailDetector().isPresent("No email present, but @ there") повертає false.


 */