package Task2;

import Task2.Flight;

import java.util.ArrayList;
// 2nd exercise
public class Trip {
    private ArrayList<Flight> flights;

    public Trip(ArrayList<Flight> flights){
        this.flights = new ArrayList<>();

        if (flights.size() > 0){
            this.flights.add(flights.get(0));
        }

        if (flights.size() > 1){
            for (int i = 1; i < flights.size(); i++){
                if (this.flights.get(this.flights.size() - 1).getArrivalTime().minutesUntil(flights.get(i).getDepartureTime()) > 0){
                    this.flights.add(flights.get(i));
                }
            }
        }
    }

    public int getDuration(){
        if (this.flights.size() == 0){
            return 0;
        }
        else{
            int sum = 0;
            for (Flight current: this.flights) {
                sum += current.getDepartureTime().minutesUntil(current.getArrivalTime());
            }
            return sum;
        }
    }

    public int getShortestLayover(){

        if (this.flights.size() > 1){
            int min = 1000000000;

            for (int i = 0; i < this.flights.size() - 1; i++){
                int currentLayover = this.flights.get(i).getArrivalTime().minutesUntil(this.flights.get(i + 1).getDepartureTime());
                if (currentLayover < min){
                    min = currentLayover;
                }
            }
            return min;
        }
        else{
            return -1;
        }
    }

}
