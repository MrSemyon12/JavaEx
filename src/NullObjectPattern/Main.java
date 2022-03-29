package NullObjectPattern;

public class Main {
    static AbstractUser[] users = { new User(1, "Tim"),
            new User(2, "Mike") };

    public static AbstractUser findUser(int id) {

        for (int i = 0; i < users.length; i++) {
            if (users[i].id == id){
                return users[i];
            }
        }
        return new NullUser();
    }

    public static void main(String[] args) {
        System.out.println("User: " + findUser(1).name + ", HasAccess: " + findUser(1).hasAccess());
        System.out.println("User: " + findUser(2).name + ", HasAccess: " + findUser(2).hasAccess());
        System.out.println("User: " + findUser(3).name + ", HasAccess: " + findUser(3).hasAccess());
    }
}