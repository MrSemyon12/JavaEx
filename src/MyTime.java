// 2nd exercise
public class MyTime {

    private int hours;
    private int minutes;

    public MyTime(int hours, int minutes) {
        this.hours = hours;
        this.minutes = minutes;
    }

    public int minutesUntil(MyTime other) {
        if (other.hours == 0){
            return (24 * 60 + other.minutes) - (this.hours * 60 + this.minutes);
        }
        return (other.hours * 60 + other.minutes) - (this.hours * 60 + this.minutes);
    }
}
