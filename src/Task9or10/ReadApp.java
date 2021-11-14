package Task9or10;

import java.io.*;

public class ReadApp {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("C:\\Users\\mrsem\\IdeaProjects\\Homework\\src\\Task9or10\\data");
            ObjectInputStream ois = new ObjectInputStream(fis);

            Person person1 = (Person)ois.readObject();
            Person person2 = (Person)ois.readObject();

            System.out.println(person1);
            System.out.println(person2);

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}
