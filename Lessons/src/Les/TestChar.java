package Les;

public class TestChar {


    public static void main(String[] args) {

        String word = "Hello";
        String vord2 = "kollo";
        boolean res = word.regionMatches(true,0,vord2,0,word.length());

        System.out.println(res);

    }
}
