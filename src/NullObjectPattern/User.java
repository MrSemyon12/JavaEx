package NullObjectPattern;

public class User extends AbstractUser {
    public User(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public boolean hasAccess() {
        return true;
    }
}
