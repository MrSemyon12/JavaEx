package NullObjectPattern;

public class NullUser extends AbstractUser{
    public NullUser() {
        this.id = -1;
        this.name = "Guest";
    }

    @Override
    public boolean hasAccess() {
        return false;
    }
}
