package v1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

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

    public Cars constructCars(final String carName) {
        final String[] carNames = new StringSplitter(carName).split(",");
        CarNameValidationUtils.validateCarNames(carNames);
        final List<Car> cars = Arrays.stream(carNames).map(name -> construct(name)).collect(Collectors.toList());
        return new Cars(cars);
    }

}
