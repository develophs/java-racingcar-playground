package v2;

import java.util.List;

public class Cars {

    private List<Car> cars;

    public Cars(final List<Car> cars) {
        this.cars = cars;
    }

    public List<Car> getCars() {
        return cars;
    }

    public void race() {
        cars.forEach(car -> {
            car.move(Number.getRandomNumber());
        });
    }

}
