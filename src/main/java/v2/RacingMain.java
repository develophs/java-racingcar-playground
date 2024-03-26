package v2;

import v2.view.InputView;

public class RacingMain {

    public static void main(String[] args) {
        final String carNames = InputView.getCarNames();
        final int racingRound = InputView.getRacingRound();

        System.out.println(carNames);
        System.out.println(racingRound);
    }
}
