package ExamplesMod7;

public class Time {


    // щоб не створювати обьекти кожного разу можно створити константи и вызывать их от куда угодно


    public static final Time SECOND = new Time(0,0,1);
    public static final Time HOUR = new Time(1,0,0);

    private int hours, minutes,seconds;




    Time(int hours, int minutes, int seconds){
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    public int getSeconds() {
        return seconds;
    }

    public void setSeconds(int seconds) {
        this.seconds = seconds;
    }

    private int convertTimeToseconds(Time time){
        return time.getHours() * 3600 + time.getMinutes() * 60 + time.getSeconds();

    }

    public void addTime(Time time){ // передаеться обьект классу Time
       int thisSeconds = convertTimeToseconds(this);
       int otherSeconds = convertTimeToseconds(time);
       int sum = thisSeconds+otherSeconds;
       this.hours = sum / 3600;
       this.minutes = (sum % 3600) / 60; // minutes остаток от деления на 3600 делим на 60
       this.seconds = sum % 60; // просто остаток от дел на 60


    }

    @Override
    public String toString() {
        return "Time{" +
                "hours = " + hours +
                ", minutes = " + minutes +
                ", seconds = " + seconds +
                '}';
    }
}
