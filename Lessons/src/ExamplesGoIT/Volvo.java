package ExamplesGoIT;

public class Volvo implements Car{


    @Override
    public void drive() {
        System.out.println("Driving is saifuli!!!");
    }

    @Override
    public int horsePower() {
        return 300;
    }
}
