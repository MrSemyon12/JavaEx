package DecoratorPattern;

public class Main {
    public static void main(String[] args) {
        Car defaultCar = new DefaultCar();
        Car sportCar = new SportCar(defaultCar);
        Car truckCar = new TruckCar(defaultCar);
        Car megaCar = new SportCar(truckCar);


        System.out.println(defaultCar.describeYourself());
        System.out.println(sportCar.describeYourself());
        System.out.println(truckCar.describeYourself());
        System.out.println(megaCar.describeYourself());
    }
}
