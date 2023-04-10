package ExamplesMod7;

public class StrongBilderTest {

    public static void main(String[] args) {
       /*
        String res = "";
        long start = System.currentTimeMillis();// замер времяисполнения программы start
        for(int i = 0; i < 200000; i++){ // после 1т уже будет долго
            res += i;
        }
        long end = System.currentTimeMillis(); // замер времяисполнения программы end
        System.out.println("time is = " + (end-start)); // in milicecas
        //System.out.println(res);
        */

        // бдагодаря StringBuffer and StringBilder все будет быстрее

        StringBuilder sb = new StringBuilder();
        /// StringBuffer stringBuffer = new StringBuffer();
        long start = System.currentTimeMillis();
        for(int i = 0; i < 100000; i++){ // быстро и удачно справиться с 1лям+ в 1000 раз быстрее
            sb.append(i);
        }
        long end = System.currentTimeMillis();

        String res = sb.toString();
        System.out.println("time is = " + (end-start));
        //System.out.println(res);

         CustomStringBilder customStringBilder = new CustomStringBilder(); // наш буфер

        long start1 = System.currentTimeMillis();
        for(int j = 0; j < 200000; j++){
            customStringBilder.append(j);
        }
        long end1 = System.currentTimeMillis();

        String res1 = sb.toString();
        System.out.println("time is = " + (end1-start1));
        //System.out.println(res);

    }
}
