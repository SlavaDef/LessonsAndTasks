package ExamolesMod9.HashMapes;

import java.util.HashMap;
import java.util.Map;

public class HashMapWithCustomKey {

    public static void main(String[] args) {

        Map<Employer,String> employers = new HashMap<>();

        Employer employer = new Employer();
        Employer employer2 = new Employer();

        employer.setId(1);
        employer.setName("Bob");

        employer2.setId(2);
        employer2.setName("Kate");


        employers.put(employer,"Ukraine");
        employers.put(employer2,"Canada");

        System.out.println(employers);



    }
}
