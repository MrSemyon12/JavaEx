public class Main {

    public static void main(String[] args) {
        WorldList worldList= new WorldList();
        System.out.println(worldList.numWordsOfLength(2));
        worldList.removeWordsOfLength(4);
        worldList.removeWordsOfLength(3);
    }
}