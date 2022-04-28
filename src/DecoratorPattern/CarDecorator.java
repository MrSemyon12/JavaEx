package DecoratorPattern;

public class CarDecorator implements Car {

    Car car;

    public CarDecorator(Car car) {
        this.car = car;
    }

    @Override
    public String describeYourself() {
        return car.describeYourself();
    }
}
