package ExamplesMod7;

public class TestPizza {

    public static void main(String[] args) {
        System.out.println(Pizza.TOMATO);
        System.out.println(Pizza.BICON);
        System.out.println(Pizza.CHEEZ.sum(Pizza.MUCHRUMS)); // return suma of indigridiens our method
        System.out.println(Pizza.MUCHRUMS.getTrunskription()); // return trunskription
        System.out.println(Pizza.BOW.ordinal()); // return порядковый номер

        for(Pizza piz : Pizza.values()){ // values() вернет массив энамов
            System.out.println(piz);
        }


    }
}
