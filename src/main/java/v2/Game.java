package v2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Game {

    private final Cars cars;
    private final int gameRound;
    private int currentRound;

    public Game(final String carNames, final int gameRound) {
        this.cars = init(carNames);
        this.gameRound = gameRound;
        this.currentRound = 0;
    }

    private Cars init(String carNames) {
        return new Cars(
                Arrays.stream(
                        new StringSplit(carNames).split(",")
                        )
                .map(Car::new)
                .collect(Collectors.toList())
        );
    }

    public void race() {
        cars.race();
        currentRound++;
    }

    public boolean isEnd() {
        return currentRound == gameRound;
    }

    public List<Car> getCurrentCars() {
        return cars.getCars();
    }

    public List<Car> getWinners() {
        return cars.getWinners();
    }


}
