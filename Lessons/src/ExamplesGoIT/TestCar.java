package ExamplesGoIT;

public class TestCar {

    public static void main(String[] args) {
        //  Car car = new Car() !!!! no
Car car = new Volvo();
car.drive();
Car car2 = new Mersedes();
car2.drive();


Animal dog = new Dog();
dog.makeNoise();

    }
}
