package v1;

public class CarFactory {

    private static CarFactory carFactory;

    public static CarFactory getInstance() {
        if (carFactory == null) {
            carFactory = new CarFactory();
        }
        return carFactory;
    }

    public Car construct(final String carName) {
        return new Car(carName);
    }
}
