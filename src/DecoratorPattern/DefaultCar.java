package DecoratorPattern;

public class DefaultCar implements Car{

    private int maxSpeed = 110;
    private int maxWeight = 750;

    @Override
    public void describeYourself() {
        System.out.println("Я машина. Я еду " + maxSpeed + " км/ч и везу " + maxWeight + " кг груза.");
    }
}
