package ExamolesMod9;

// E = element us in java colectoins
// K = key
// V = value
// N = nember
// T = tipe
// ? = if we dont know tipe

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

// extends Number наследукмся от Number тип будет связан только с Number(все его наследники)

public class GenericType <T extends Number> { // указываем на то что это будет один из типов = Byte, Integer or String ....

    private T type; // coздаем переменную нашего типа

    public T getType() { // getter for T
        return this.type;
    }

    public void set(T type){ // setter for T
        this.type=type;

    }

    public static void main(String[] args) {

        GenericType<Integer> generic2 = new GenericType<>();
        generic2.set(35);

GenericType<Integer> generic = new GenericType<>(); // create obj указали тип
generic.set(34);
        //GenericType<String> genericType = new GenericType<>();
//genericType.set("Hello");

//final boolean eq = GenericUtils.isEquals(generic,generic2);
//System.out.println(eq);

        List<Integer> listOne = new ArrayList<>();
        List<Objects> listTwo = new ArrayList<>();

        // listTwo =  listOne No

        GenericType<Number> genericThirth = new GenericType<>();






    }
}
