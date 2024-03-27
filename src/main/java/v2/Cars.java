package v2;

import java.util.List;
import java.util.stream.Collectors;

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

    public List<Car> getWinners() {
        final int max = getMax();
        final List<Car> winners = cars.stream().filter(car -> car.isSamePosition(max)).collect(Collectors.toList());
        return winners;
    }

    private int getMax() {
        return cars.stream().mapToInt(Car::getPositionValue).max().orElse(0);
    }

}
