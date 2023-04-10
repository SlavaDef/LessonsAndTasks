package ExamplesGoIT;

public enum MyDayOfWeek {

    SUNDAY("Sunday",1), // теперь с описанием
    MONDY("Monday",2),
    TUESDAY("Tuesday",3),
    WENSDAY("Wensday",4),
    THURSDAY("Thursday",5),
    FRIDAY("Friday",6),
    SUTTURDAY("Sutturday",7);

    private String dayOfWeek;
    private int indeficate;

    MyDayOfWeek(String dayOfWeek, int indeficate){ // конструктор
        this.dayOfWeek=dayOfWeek;
        this.indeficate = indeficate;

    }

    public String getDayOfWeek() {
        return dayOfWeek;
    }

    public int getIndeficate() {
        return indeficate;
    }
}
