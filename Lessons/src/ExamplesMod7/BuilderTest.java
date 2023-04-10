package ExamplesMod7;

public class BuilderTest {

    public static void main(String[] args) {


Peoples peoples = new Peoples.OptimizeWithBilder().id(2).name("Bob").build();

// удобнее чем конструктор порядок задаем сами
System.out.println("Pepples = " + peoples );



    }
}
