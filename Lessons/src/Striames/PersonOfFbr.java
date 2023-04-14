package Striames;

public class PersonOfFbr {

    String name;
    int age;

    PersonOfFbr(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return name;
    }
}
