package DecoratorPattern;

public class TruckCar extends CarDecorator {

    public TruckCar(Car car) {
        super(car);
    }

    @Override
    public String describeYourself() {
        return car.describeYourself() + "Могу перевозить большой груз. ";
    }
}
