package ExamplesMod7;

import java. util.Date;
import java.math.BigDecimal;

public class PaymentTranzaktion {


    private final BigDecimal sum;
    private final Date data; // дата транзакции

    public PaymentTranzaktion(BigDecimal sum, Date data) {
        this.sum = sum;
        this.data = (Date) data.clone(); // чтобы обьект нельзя было изменяьт делаем копию как с масивам
    }

    @Override
    public String toString() {
        return "PaymentTranzaktion{" +
                "sum = " + sum +
                ", data = " + data +
                '}';
    }

    public Date getData() {
        return (Date) data.clone();// также вернуть копию с гетера
    }
}
