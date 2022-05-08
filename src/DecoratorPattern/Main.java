package DecoratorPattern;

public class Main {
    public static void main(String[] args) {
        Car defaultCar = new DefaultCar();
        System.out.println(defaultCar.describeYourself());

        Car sportCar = new SportCar(defaultCar);
        System.out.println(sportCar.describeYourself());

        Car truckCar = new TruckCar(defaultCar);
        System.out.println(truckCar.describeYourself());

        Car megaCar = new SportCar(truckCar);
        System.out.println(megaCar.describeYourself());
    }
}
