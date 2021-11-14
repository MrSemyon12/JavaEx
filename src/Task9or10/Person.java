package Task9or10;

import java.io.Serializable;

public class Person implements Serializable {
    private String firstName;
    private String lastName;
    private int birthYear;
    private String address;

    public Person(String fn, String ln, int by, String ad){
        this.firstName = fn;
        this.lastName = ln;
        this.birthYear = by;
        this.address = ad;
    }

    public String toString(){
        return firstName + " " + lastName + " | " + birthYear + " | " + address;
    }
}
