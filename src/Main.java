import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        //WorldList worldList= new WorldList();
        //System.out.println(worldList.numWordsOfLength(2));
        //worldList.removeWordsOfLength(4);
        //worldList.removeWordsOfLength(3);

        MyTime t1 = new MyTime(11,30);
        MyTime t2 = new MyTime(0,15);
        MyTime t3 = new MyTime(13,15);
        MyTime t4 = new MyTime(15,45);
        MyTime t5 = new MyTime(16,0);
        MyTime t6 = new MyTime(18,45);
        MyTime t7 = new MyTime(22,15);
        MyTime t8 = new MyTime(23,0);

        Flight f1 = new Flight(t1, t2);
        Flight f2 = new Flight(t3, t4);
        Flight f3 = new Flight(t5, t6);
        Flight f4 = new Flight(t7, t8);

        ArrayList<Flight> arr = new ArrayList<>();
        arr.add(f1);
        arr.add(f2);
        arr.add(f3);
        arr.add(f4);

        Trip trip = new Trip(arr);

        System.out.println(trip.getDuration());
        System.out.println(trip.getShortestLayover());

    }
}