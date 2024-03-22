package v1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

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

    public Cars getWinners() {
        final int maxStep = getMaxStep();
        final List<Car> winners = cars.stream().filter(car -> car.isSameStep(maxStep)).collect(Collectors.toList());
        return new Cars(winners);
    }

    // 최대값이 0이고, 모든 자동차의 step도 0이면 공동우승 >> 버그 X
    private int getMaxStep() {
        return cars.stream().mapToInt(car -> car.steps()).max().orElse(0);
    }
}
