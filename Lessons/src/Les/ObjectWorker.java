package Les;

import java.util.Arrays;

public class ObjectWorker {

    public String join(Object[] objects) {

        StringBuilder sb = new StringBuilder();



        for (Object eln : objects){
            sb.append(eln).append(" ");
        }



         return sb.toString().trim();
    }
}

class ObjectWorkerTest {
    public static void main(String[] args) {
        Object[] data = {"Hello", 20L, 3.14f, true};

        //Hello 20 3.14 true
        System.out.println(new ObjectWorker().join(data));
    }
}
