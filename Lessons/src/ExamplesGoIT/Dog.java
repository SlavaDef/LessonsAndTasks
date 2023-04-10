package ExamplesGoIT;

public class Dog extends Animal {
    @Override
    public void makeNoise() {
        sleep(); // + логика сна
        System.out.println("Gav-Gav");
    }


}
