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

    // 결국 클라이언트가 원하는건 우승한 자동차들의 이름이다.
    // 하지만 하나의 메서드에서 우승자를 구하고, 다시 우승자들의 이름을 뽑아내는것은
    // 하나의 메서드의 책임이 커보인다. 따라서, 우승자 선별 로직 및 이름 가져오는 로직을 분리했다.
    public String getWinnersName() {
        return cars.stream().map(Car::getName).collect(Collectors.joining(", "));
    }
}
