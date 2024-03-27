package v2.view;

import v2.Car;

import java.util.List;
import java.util.stream.Collectors;

public class ResultView {

    public static void printStatus(final List<Car> cars) {
        System.out.println("실행 결과");
        cars.forEach(car -> {
            System.out.println(car.toString());
        });
        System.out.println();
    }

    public static void printWinner(final List<Car> cars) {
        final String winnerName = cars.stream().map(car -> car.carName()).collect(Collectors.joining(", "));
        System.out.println(winnerName + "가 최종 우승했습니다.");
    }
}
