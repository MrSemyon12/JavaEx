package Task9or10;

import java.io.*;

public class WriteApp {
    public static void main(String[] args) {
        Person person1 = new Person("Denisenko", "Semyon",2001,"VDK");
        Person person2 = new Person("Vasya", "Ivanov",2005,"KHV");

        try {
            FileOutputStream fos = new FileOutputStream("C:\\Users\\mrsem\\IdeaProjects\\Homework\\src\\Task9or10\\data");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(person1);
            oos.writeObject(person2);
            oos.close();
            System.out.println("Success");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
