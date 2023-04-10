package ExamolesMod9;

public class GenericUtils {

    public static <T> boolean isEquals(GenericType<? super Number> o1, GenericType<? super Number> o2){ // обобщение метода
return o1.getType().equals(o2.getType());
    }
}
// ? super Number  данная запись означает что в параметры сможем принимать уже класы родители Number i Object