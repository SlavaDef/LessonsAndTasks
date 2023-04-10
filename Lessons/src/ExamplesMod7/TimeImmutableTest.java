package ExamplesMod7;

import java.util.Date;
import java.math.BigDecimal;

public class TimeImmutableTest {

    public static void main(String[] args) {

       /* Time time = new Time(1,5,8);
        Time time2 = new Time(2,7,15);
        time.setSeconds(9); */

        Date date = new Date();


        PaymentTranzaktion paymentTranzaktion = new PaymentTranzaktion(new BigDecimal("50.5"),date);

        System.out.println("paymentTranzaktion = " + paymentTranzaktion);

        date.setTime(155); // теперь время не измениться
        System.out.println("paymentTranzaktion = " + paymentTranzaktion);

    }
}
