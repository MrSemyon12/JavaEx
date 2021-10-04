public class Main {

    public static void main(String[] args) {
        //WorldList worldList= new WorldList();
        //System.out.println(worldList.numWordsOfLength(2));
        //worldList.removeWordsOfLength(4);
        //worldList.removeWordsOfLength(3);

        MyTime t1 = new MyTime(1,0);
        MyTime t2 = new MyTime(2,15);
        System.out.println(t1.minutesUntil(t2));
        System.out.println(t2.minutesUntil(t1));



    }
}