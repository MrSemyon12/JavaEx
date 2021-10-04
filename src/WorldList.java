import java.util.ArrayList;
// 1st exercise
public class WorldList {

    private ArrayList<String> myList;

    public WorldList() {
        myList = new ArrayList<String>();
        myList.add("cat");
        myList.add("mouse");
        myList.add("frog");
        myList.add("dog");
        myList.add("dog");
        myList.add("");
        myList.add(" ");
    }

    public int numWordsOfLength(int len) {
        int counter = 0;

        for (String current : myList) {
            if(current.length() == len) {
                counter++;
            }
        }
        return counter;
    }

    public void removeWordsOfLength(int len) {

        ArrayList<String> tmp = (ArrayList<String>) myList.clone();

        for (String current : tmp) {
            if(current.length() == len) {
                myList.remove(current);
            }
        }
        System.out.println(myList);
    }
}
