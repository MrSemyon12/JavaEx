package Task2;

// 2nd exercise
public class Flight {

    private MyTime departureTime;
    private MyTime arrivalTime;

    public Flight(MyTime departureTime, MyTime arrivalTime){
            this.departureTime = departureTime;
            this.arrivalTime = arrivalTime;
    }

    public MyTime getDepartureTime(){
        return this.departureTime;
    }

    public MyTime getArrivalTime(){
        return this.arrivalTime;
    }


}
