package v2;

import java.util.List;

public class Cars {

    private List<Car> cars;

    public Cars(final List<Car> cars) {
        this.cars = cars;
    }

    public Car get(final int index) {
        return cars.get(index);
    }

}
