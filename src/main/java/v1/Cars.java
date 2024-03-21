package v1;

import java.util.ArrayList;
import java.util.List;

public class Cars {

    private List<Car> cars;

    public Cars() {
        cars = new ArrayList<>();
    }

    public void addCar(final Car car) {
        cars.add(car);
    }

    public List<Car> getCars() {
        return cars;
    }

    public String getCarNameByIndex(int index) {
        return cars.get(index).getName();
    }
}
