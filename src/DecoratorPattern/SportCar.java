package DecoratorPattern;

public class SportCar extends CarDecorator {

    public SportCar(Car car) {
        super(car);
    }

    @Override
    public String describeYourself() {
        return car.describeYourself() + "Могу быстро ездить. ";
    }
}
