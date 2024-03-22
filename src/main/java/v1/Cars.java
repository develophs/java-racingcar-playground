package v1;

import java.util.ArrayList;
import java.util.List;

public class Cars {

    private List<Car> cars;

    public Cars() {
        cars = new ArrayList<>();
    }

    public Cars(List<Car> cars) {
        this.cars = cars;
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

    public void play(int gameRound) {
        for (int i = 0; i < gameRound ; i++) {
            proceedStep();
        }
    }

    private void proceedStep() {
        cars.forEach(car -> {
            final int fuel = new NumberGenerator().generate();
            car.proceed(fuel);
            car.printSteps();
        });
        System.out.println();
    }
}
