package Les;

public class WordCombine {


    public boolean canCombine(String sourceWord, String targetWord){

        boolean resalt = false;
        int counter = 0;

        String [] wor = sourceWord.split("");
        String [] wor2 = targetWord.split("");


for(int i = 0; i<sourceWord.length(); i++){
for(int j = 0; j<targetWord.length(); j++){
    if(wor[i].equalsIgnoreCase(wor2[j])){
        counter++;
    }
}

if(counter>=2){
    resalt = true;
}

}


System.out.println(counter);

        return resalt;

    }



}

class WordCombineTest {
    public static void main(String[] args) {
        //true
        System.out.println(new WordCombine().canCombine("Forest", "tor"));

        //true
        System.out.println(new WordCombine().canCombine("Magic", "Mama"));

        //false
        System.out.println(new WordCombine().canCombine("War", "Piece"));

        System.out.println(new WordCombine().canCombine("War", "Warhh"));
    }
}

/*
Він має повертати true лише в тому випадку, якщо із слова sourceWord можна скласти слово targetWord.

виконання коду new WordCombine().canCombine("Forest", "tor") повертає true;
виконання коду new WordCombine().canCombine("Magic", "Mama") повертає true;
виконання коду new WordCombine().canCombine("War", "Piece") повертає false.


 */