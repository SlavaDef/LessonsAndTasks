package ExamplesGoIT;

public class Mersedes implements Car {


    @Override
    public void drive() {
        System.out.println("Comfort driving");
    }

    @Override
    public int horsePower() {
        return 500;
    }
}
