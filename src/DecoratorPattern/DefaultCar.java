package DecoratorPattern;

public class DefaultCar implements Car {

    @Override
    public String describeYourself() {
       return "Я машина. ";
    }
}
